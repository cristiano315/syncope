/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Neo4jRealmSearchDAOTest {

    private Neo4jRealmSearchDAO searchDAO;
    private Map<String, Object> parameters;

    @BeforeEach
    public void setUp() {
        // Initialize the DAO with null dependencies. 
        // We can get away with this because fillAttrQuery doesn't actually hit the DB or use these DAOs.
        searchDAO = new Neo4jRealmSearchDAO(
                null, null, null, null, null, null, null, null, null);
        
        // Just an empty map to hold the Cypher parameters the method generates
        parameters = new HashMap<>();
    }

    // --- MOCK UTILITIES ---
    // A few quick helpers to keep the test methods clean and readable

    private PlainSchema mockSchema(String key, AttrSchemaType type, boolean isUnique) {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn(key);
        when(schema.getType()).thenReturn(type);
        when(schema.isUniqueConstraint()).thenReturn(isUnique);
        return schema;
    }

    private PlainAttrValue mockValue(String stringValue, OffsetDateTime dateValue) {
        PlainAttrValue attrValue = mock(PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn(stringValue);
        when(attrValue.getDateValue()).thenReturn(dateValue);
        return attrValue;
    }

    private AnyCond mockCond(AnyCond.Type type, String expression) {
        AnyCond cond = mock(AnyCond.class);
        when(cond.getType()).thenReturn(type);
        when(cond.getExpression()).thenReturn(expression);
        return cond;
    }

    // --- CATEGORY PARTITIONING TESTS ---

    @Test
    @DisplayName("TC1: Simple Equality (EQ), String, Unique Value, Not=False")
    public void testTC1_EQ_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "Rome");
        PlainAttrValue value = mockValue("Rome", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // Expecting a direct property check with the value wrapped in quotes.
        assertTrue(query.toString().contains("city.stringValue = \"Rome\""), 
            "TC1 failed: Basic EQ translation for a unique string didn't work. Actual query: " + query);
    }

    @Test
    @DisplayName("TC2: Equality (EQ) with Regex (*), String, Unique Value, Not=False")
    public void testTC2_EQ_WithRegex_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "Ro*me");
        PlainAttrValue value = mockValue("Ro*me", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // The EQ operator should automatically morph into a Regex match (=~) because it detects the asterisk.
        assertTrue(query.toString().contains("city.stringValue =~ \"^Ro.*me$\""), 
            "TC2 failed: The system didn't switch to regex for the EQ operator when given a wildcard. Actual query: " + query);
    }

    @Test
    @DisplayName("TC3: Greater Than (GT), Long, Multivalued, Not=False (Valid Parsing)")
    public void testTC3_GT_Long_Multivalued() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, false);
        AnyCond cond = mockCond(AnyCond.Type.GT, "150");
        PlainAttrValue value = mockValue("150", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // Since it's a multivalued field, it should use 'any(k IN...)'. 
        // Also, 150 is a valid number so it shouldn't be wrapped in quotes.
        assertTrue(query.toString().contains("any(k IN age WHERE k.longValue > 150)"), 
            "TC3 failed: Didn't handle the numeric array or the any() function correctly. Actual query: " + query);
    }

    @Test
    @DisplayName("TC4: Null Check (ISNULL), Multivalued, Not=True (Recursive Inversion)")
    public void testTC4_ISNULL_Multivalued_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, false);
        AnyCond cond = mockCond(AnyCond.Type.ISNULL, null);
        PlainAttrValue value = mockValue(null, null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        // A negated ISNULL on an array should turn into an IS NOT NULL check, or use the none() clause.
        assertTrue(query.toString().contains("IS NOT NULL") || query.toString().contains("none("), 
            "TC4 failed: Recursive inversion of NOT on ISNULL is broken. Actual query: " + query);
    }

    @Test
    @DisplayName("TC5: Less Than/Equal (LE), Date, Unique Value, Not=False")
    public void testTC5_LE_Date_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("expirationDate", AttrSchemaType.Date, true);
        AnyCond cond = mockCond(AnyCond.Type.LE, null);
        
        // Mock a real date object to trigger the internal Date formatting block
        OffsetDateTime mockDate = OffsetDateTime.now();
        PlainAttrValue value = mockValue(null, mockDate);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // We should see the <= operator and an ISO formatted date string (which includes the 'T' separator).
        assertTrue(query.toString().contains("expirationDate.dateValue <= \"") && query.toString().contains("T"), 
            "TC5 failed: ISO date formatting didn't work as expected. Actual query: " + query);
    }

    @Test
    @DisplayName("TC6: Equality (EQ), Long, Invalid Value (Exception Catch & Fallback)")
    public void testTC6_EQ_Long_InvalidParsingFallback() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "abc"); // Passing letters to a numeric schema
        PlainAttrValue value = mockValue("abc", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // Long.valueOf("abc") will throw a NumberFormatException, which the code catches silently. 
        // It should fall back to treating it as a string, wrapping "abc" in quotes.
        assertTrue(query.toString().contains("age.longValue = \"abc\""), 
            "TC6 failed: The numeric parsing fallback didn't wrap the invalid string in quotes. Actual query: " + query);
    }

    @Test
    @DisplayName("TC7: Equality (EQ), Boolean, Unique Value, Not=True (Logic Inversion)")
    public void testTC7_EQ_Boolean_Unique_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("isActive", AttrSchemaType.Boolean, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "true");
        PlainAttrValue value = mockValue("true", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        // Applying NOT to a unique constraint should wrap the whole condition in NOT(...)
        assertTrue(query.toString().contains("WHERE NOT(isActive.booleanValue = true)"), 
            "TC7 failed: NOT clause wasn't applied correctly to the boolean value. Actual query: " + query);
    }

    @Test
    @DisplayName("TC8: Case-Insensitive Pattern Matching (ILIKE), String with Wildcard")
    public void testTC8_ILIKE_String_WithWildcard() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.ILIKE, "rome%");
        PlainAttrValue value = mockValue("rome%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // ILIKE should trigger the case-insensitive regex flag (?i) and replace the % wildcard with .*
        assertTrue(query.toString().contains("city.stringValue =~ \"(?i).*rome.*\""), 
            "TC8 failed: ILIKE translation or wildcard replacement (%) is broken. Actual query: " + query);
    }

    @Test
    @DisplayName("TC9: Error Guessing - LIKE on Long (Type Incompatibility)")
    public void testTC9_LIKE_Long_IncompatibleTypeError() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.LIKE, "10%");
        PlainAttrValue value = mockValue("10%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // LIKE is illegal on numbers. It should log an error and append the ALWAYS_FALSE_CLAUSE ("1=0") so the query safely fails.
        assertTrue(query.toString().contains("1=0"), 
            "TC9 failed: The system didn't block the LIKE operator on a non-text field. Actual query: " + query);
    }
}