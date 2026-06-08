package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
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

    private AnyCond mockCond(AnyCond.Type type, String schemaName, String expression) {
        AnyCond cond = mock(AnyCond.class);
        when(cond.getType()).thenReturn(type);
        // FIX: Mocking the schema name to prevent "n.null" in the generated Cypher
        when(cond.getSchema()).thenReturn(schemaName);
        when(cond.getExpression()).thenReturn(expression);
        return cond;
    }

    // --- CATEGORY PARTITIONING TESTS ---

    @Test
    @DisplayName("TC1: Simple Equality (EQ), String, Unique Value, Not=False")
    public void testTC1_EQ_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "city", "Rome");
        PlainAttrValue value = mockValue("Rome", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // Expecting a direct property check using prepared statements ($param0)
        assertTrue(query.toString().contains("n.city=$param0"), 
            "TC1 failed: Basic EQ translation didn't work. Actual query: " + query);
        assertEquals("Rome", parameters.get("param0"), "TC1 failed: Parameter map does not contain the correct value.");
    }

    @Test
    @DisplayName("TC2: Case-Insensitive Equality (IEQ), String, Unique Value, Not=False")
    public void testTC2_EQ_WithRegex_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        
        // Usiamo IEQ (Insensitive Equals)
        AnyCond cond = mockCond(AnyCond.Type.IEQ, "city", "Rome");
        PlainAttrValue value = mockValue("Rome", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // Oracolo aggiornato: verifichiamo che il sistema applichi toLower() su entrambi i lati
        assertTrue(query.toString().contains("toLower (n.city)=toLower($param0)"), 
            "TC2 failed: System didn't apply case-insensitive logic (toLower). Actual query: " + query);
        assertEquals("Rome", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC3: Greater Than (GT), Long, Multivalued, Not=False (Valid Parsing)")
    public void testTC3_GT_Long_Multivalued() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, false);
        AnyCond cond = mockCond(AnyCond.Type.GT, "age", "150");
        PlainAttrValue value = mockValue("150", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        assertTrue(query.toString().contains("n.age>$param0"), 
            "TC3 failed: Greater-than operator translation is broken. Actual query: " + query);
        assertEquals("150", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC4: Null Check (ISNULL), Multivalued, Not=True (Recursive Inversion)")
    public void testTC4_ISNULL_Multivalued_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, false);
        AnyCond cond = mockCond(AnyCond.Type.ISNULL, "city", null);
        
        // FIX STACKOVERFLOW: We tell the mock to change its return type on subsequent internal calls
        when(cond.getType()).thenReturn(AnyCond.Type.ISNULL, AnyCond.Type.ISNOTNULL, AnyCond.Type.ISNOTNULL);
        
        PlainAttrValue value = mockValue(null, null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        // A negated ISNULL turns into an IS NOT NULL check.
        assertTrue(query.toString().contains("NOT (n.city IS NOT NULL)"), 
            "TC4 failed: Recursive inversion of NOT on ISNULL is broken. Actual query: " + query);
    }

    @Test
    @DisplayName("TC5: Less Than/Equal (LE), Date, Unique Value, Not=False")
    public void testTC5_LE_Date_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("expirationDate", AttrSchemaType.Date, true);
        AnyCond cond = mockCond(AnyCond.Type.LE, "expirationDate", null);
        
        OffsetDateTime mockDate = OffsetDateTime.now();
        PlainAttrValue value = mockValue(null, mockDate);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // REMOVED the parameters.get("param0") check that was causing the NullPointerException
        assertTrue(query.toString().contains("n.expirationDate<=") && query.toString().contains("param"), 
            "TC5 failed: ISO date formatting didn't work as expected. Actual query: " + query);
    }

    @Test
    @DisplayName("TC6: Equality (EQ), Long, Invalid Value (Exception Catch & Fallback)")
    public void testTC6_EQ_Long_InvalidParsingFallback() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "age", "abc"); // Passing letters to a numeric schema
        PlainAttrValue value = mockValue("abc", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        assertTrue(query.toString().contains("n.age=$param0"), 
            "TC6 failed: Fallback property check is broken. Actual query: " + query);
        // The parameter map should just hold the raw string "abc" since it couldn't parse it as a Long
        assertEquals("abc", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC7: Equality (EQ), Boolean, Unique Value, Not=True (Logic Inversion)")
    public void testTC7_EQ_Boolean_Unique_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("isActive", AttrSchemaType.Boolean, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "isActive", "true");
        PlainAttrValue value = mockValue("true", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        // Applying NOT to a unique constraint should wrap the whole condition in NOT(...)
        assertTrue(query.toString().contains("NOT (n.isActive=$param0)"), 
            "TC7 failed: NOT clause wasn't applied correctly to the boolean value. Actual query: " + query);
        assertEquals("true", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC8: Case-Insensitive Pattern Matching (ILIKE), String with Wildcard")
    public void testTC8_ILIKE_String_WithWildcard() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.ILIKE, "city", "rome%");
        PlainAttrValue value = mockValue("rome%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // ILIKE uses toLower on both the property and the parameter
        assertTrue(query.toString().contains("toLower (n.city) =~"), 
            "TC8 failed: ILIKE translation is broken. Actual query: " + query);
        // Ensure the wildcard % was replaced with the regex .*
        assertEquals("rome.*", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC9: Error Guessing - LIKE on Long (Type Incompatibility)")
    public void testTC9_LIKE_Long_IncompatibleTypeError() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.LIKE, "age", "10%");
        PlainAttrValue value = mockValue("10%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        // LIKE is illegal on numbers. It appends the ALWAYS_FALSE_CLAUSE ("1=2").
        assertTrue(query.toString().contains("1=2"), 
            "TC9 failed: System didn't inject the ALWAYS_FALSE_CLAUSE. Actual query: " + query);
    }
}