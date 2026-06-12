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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

public class Neo4jRealmSearchDAOCFTest {

  private Neo4jRealmSearchDAO searchDAO;

  private Map<String, Object> parameters;

  private RealmDAO realmDAO;

  private PlainSchemaDAO plainSchemaDAO;

  private RealmUtils realmUtils;

  private Neo4jClient neo4jClient;

  private Neo4jTemplate neo4jTemplate;

  /*
   * This small dummy class is only used to obtain a real Field instance.
   * RealmUtils.getField() returns Optional<Field>, therefore a simple String
   * would not be enough for the pagination test.
   */
  private static class DummyRealmFields {

    public String name;
  }

  @BeforeEach
  public void setUp() {
    realmDAO = mock(RealmDAO.class);
    plainSchemaDAO = mock(PlainSchemaDAO.class);
    realmUtils = mock(RealmUtils.class);
    neo4jClient = mock(Neo4jClient.class, RETURNS_DEEP_STUBS);
    neo4jTemplate = mock(Neo4jTemplate.class);

    /*
     * The DAO is created once before each test with mocked dependencies.
     * This keeps the tests focused on the behavior of Neo4jRealmSearchDAO
     * without requiring a real Neo4j instance or real persistence objects.
     */
    searchDAO = new Neo4jRealmSearchDAO(
      realmDAO,
      plainSchemaDAO,
      null,
      null,
      null,
      null,
      realmUtils,
      neo4jTemplate,
      neo4jClient
    );

    parameters = new HashMap<>();
  }

  /*
   * Helper methods used to keep the single test cases readable.
   * They create the minimum mocked objects needed by fillAttrQuery()
   * and by the query-building methods.
   */
  private PlainSchema mockSchema(
    final String key,
    final AttrSchemaType type,
    final boolean isUnique
  ) {
    PlainSchema schema = mock(PlainSchema.class);
    when(schema.getKey()).thenReturn(key);
    when(schema.getType()).thenReturn(type);
    when(schema.isUniqueConstraint()).thenReturn(isUnique);
    return schema;
  }

  private PlainAttrValue mockValue(
    final String stringValue,
    final OffsetDateTime dateValue
  ) {
    PlainAttrValue attrValue = mock(PlainAttrValue.class);
    when(attrValue.getValue()).thenReturn(stringValue);
    when(attrValue.getDateValue()).thenReturn(dateValue);
    return attrValue;
  }

  private AnyCond mockCond(
    final AnyCond.Type type,
    final String schemaName,
    final String expression
  ) {
    AnyCond cond = mock(AnyCond.class);
    when(cond.getType()).thenReturn(type);
    when(cond.getSchema()).thenReturn(schemaName);
    when(cond.getExpression()).thenReturn(expression);
    return cond;
  }

  private Field mockRealmField() {
    try {
      return DummyRealmFields.class.getDeclaredField("name");
    } catch (NoSuchFieldException e) {
      throw new IllegalStateException(e);
    }
  }

  private SearchCond mockLeafAttrCond(final AttrCond attrCond) {
    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
    when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.of(attrCond));

    return searchCond;
  }

  private SearchCond mockLeafAuxClassCond(final String auxClass) {
    AuxClassCond auxClassCond = mock(AuxClassCond.class);
    when(auxClassCond.getAuxClass()).thenReturn(auxClass);

    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
    when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(
      Optional.of(auxClassCond)
    );
    when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

    return searchCond;
  }

  private SearchCond mockLeafResourceCond(final String resource) {
    ResourceCond resourceCond = mock(ResourceCond.class);
    when(resourceCond.getResource()).thenReturn(resource);

    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
    when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(ResourceCond.class)).thenReturn(
      Optional.of(resourceCond)
    );
    when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

    return searchCond;
  }

  private SearchCond mockAndCond(
    final SearchCond left,
    final SearchCond right
  ) {
    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.AND);
    when(searchCond.getLeft()).thenReturn(left);
    when(searchCond.getRight()).thenReturn(right);

    return searchCond;
  }

  private SearchCond mockOrCond(final SearchCond left, final SearchCond right) {
    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.OR);
    when(searchCond.getLeft()).thenReturn(left);
    when(searchCond.getRight()).thenReturn(right);

    return searchCond;
  }

  private AttrCond mockAttrCond(
    final AttrCond.Type type,
    final String schemaName,
    final String expression
  ) {
    AttrCond cond = mock(AttrCond.class);

    when(cond.getType()).thenReturn(type);
    when(cond.getSchema()).thenReturn(schemaName);
    when(cond.getExpression()).thenReturn(expression);

    return cond;
  }

  //New methods added to cover the branches of Neo4jRealmSearchDAO that were not covered by the existing tests in Neo4jRealmSearchDAOTest.

  @Test
  @DisplayName("TC20: appendPlainAttrCond - Unique and Multivalued Branches")
  public void testTC20_appendPlainAttrCond_UniqueAndMultivaluedBranches() {
    TextStringBuilder uniqueQuery = new TextStringBuilder();
    PlainSchema uniqueSchema = mockSchema("city", AttrSchemaType.String, true);

    Neo4jRealmSearchDAO.appendPlainAttrCond(
      uniqueQuery,
      uniqueSchema,
      " = \"Rome\""
    );

    /*
     * Unique plain attributes are translated as a direct property access.
     * This covers the true branch of schema.isUniqueConstraint().
     */
    assertTrue(
      uniqueQuery.toString().contains("city."),
      "TC20 failed: unique schema should use direct property access. Actual query: " +
        uniqueQuery
    );
    assertTrue(
      uniqueQuery.toString().contains(" = \"Rome\""),
      "TC20 failed: unique schema condition was not appended. Actual query: " +
        uniqueQuery
    );

    TextStringBuilder multivaluedQuery = new TextStringBuilder();
    PlainSchema multivaluedSchema = mockSchema(
      "tags",
      AttrSchemaType.String,
      false
    );

    Neo4jRealmSearchDAO.appendPlainAttrCond(
      multivaluedQuery,
      multivaluedSchema,
      " = \"dev\""
    );

    /*
     * Non-unique plain attributes are translated through an any(...) predicate.
     * This covers the false branch of schema.isUniqueConstraint().
     */
    assertTrue(
      multivaluedQuery.toString().contains("any(k IN tags WHERE k."),
      "TC20 failed: multivalued schema should use any(...). Actual query: " +
        multivaluedQuery
    );
    assertTrue(
      multivaluedQuery.toString().contains(" = \"dev\")"),
      "TC20 failed: multivalued schema condition was not appended. Actual query: " +
        multivaluedQuery
    );
  }

  @Test
  @DisplayName("TC21: fillAttrQuery AttrCond - ISNOTNULL Branch")
  public void testTC21_fillAttrQuery_AttrCond_ISNOTNULL() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.ISNOTNULL, "city", null);
    PlainAttrValue value = mockValue(null, null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    /*
     * This covers the ISNOTNULL switch branch of the AttrCond overload.
     */
    assertTrue(
      query.toString().contains("WHERE city IS NOT NULL"),
      "TC21 failed: AttrCond ISNOTNULL was not translated correctly. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC22: fillAttrQuery AttrCond - NOT on Multivalued Equality")
  public void testTC22_fillAttrQuery_AttrCond_NotMultivaluedEQ() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("city", AttrSchemaType.String, false);
    AttrCond cond = mockAttrCond(AttrCond.Type.EQ, "city", "Rome");
    PlainAttrValue value = mockValue("Rome", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

    /*
     * For non-unique attributes, negation is not rendered as WHERE NOT(...).
     * The method rewrites any(...) into a null-or-none(...) expression.
     */
    assertTrue(
      query.toString().contains("city IS NULL OR none("),
      "TC22 failed: NOT on multivalued AttrCond was not rewritten with none(...). Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC23: fillAttrQuery AttrCond - Case-Insensitive Equality")
  public void testTC23_fillAttrQuery_AttrCond_IEQ() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.IEQ, "city", "Rome");
    PlainAttrValue value = mockValue("Rome", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    /*
     * IEQ on string schemas follows the regex branch and adds the (?i) flag.
     */
    assertTrue(
      query.toString().contains("=~"),
      "TC23 failed: IEQ should be translated as a regex comparison. Actual query: " +
        query
    );
    assertTrue(
      query.toString().contains("(?i)"),
      "TC23 failed: IEQ should add the case-insensitive regex flag. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC24: fillAttrQuery AttrCond - LIKE on Non-String Schema")
  public void testTC24_fillAttrQuery_AttrCond_LikeOnNonStringSchema() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.LIKE, "age", "12%");
    PlainAttrValue value = mockValue("12%", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    /*
     * LIKE is valid only for string-like schemas. For numeric schemas the DAO
     * deliberately emits the always-false clause.
     */
    assertTrue(
      query.toString().contains("1=2"),
      "TC24 failed: LIKE on a non-string schema should emit the always-false clause. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC25: getQuery SearchCond - NOT_LEAF Resource Condition")
  public void testTC25_getQuery_SearchCond_NotLeafResourceCond() {
    ResourceCond resourceCond = mock(ResourceCond.class);
    when(resourceCond.getResource()).thenReturn("resource-db");

    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.NOT_LEAF);
    when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(ResourceCond.class)).thenReturn(
      Optional.of(resourceCond)
    );
    when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

    Map<String, Object> params = new HashMap<>();

    Neo4jRealmSearchDAO.QueryInfo queryInfo = searchDAO.getQuery(
      searchCond,
      params
    );

    /*
     * This covers the NOT_LEAF path and the not=true branch in resource queries.
     */
    assertTrue(
      queryInfo.query().toString().contains("WHERE NOT (n)-[]-"),
      "TC25 failed: NOT_LEAF resource condition was not negated correctly. Actual query: " +
        queryInfo.query()
    );
    assertEquals(
      1,
      params.size(),
      "TC25 failed: resource condition should generate exactly one query parameter."
    );
  }

  @Test
  @DisplayName("TC26: wrapQuery - Query Not Starting With MATCH")
  public void testTC26_wrapQuery_QueryNotStartingWithMatch() {
    Map<String, Object> params = new HashMap<>();
    params.put("param0", "odd");

    Neo4jRealmSearchDAO.QueryInfo queryInfo = new Neo4jRealmSearchDAO.QueryInfo(
      new TextStringBuilder(
        "WHERE EXISTS { MATCH (n) WHERE n.name = $param0 } "
      ),
      new HashSet<>(),
      new HashSet<>()
    );

    searchDAO.wrapQuery(Set.of("/odd"), queryInfo, Streamable.empty(), params);

    /*
     * This covers the else branch in wrapQuery(), where the incoming query
     * does not start with MATCH (n).
     */
    assertTrue(
      queryInfo.query().toString().contains("WHERE (EXISTS"),
      "TC26 failed: WHERE EXISTS should have been wrapped as WHERE (EXISTS. Actual query: " +
        queryInfo.query()
    );
    assertEquals(
      "/odd",
      params.get("base1"),
      "TC26 failed: base parameter was not generated correctly."
    );
    assertEquals(
      "/odd/.*",
      params.get("like1"),
      "TC26 failed: like parameter was not generated correctly."
    );
  }

  @Test
  @DisplayName("TC27: doCount - Builds Count Query")
  public void testTC27_doCount_BuildsCountQuery() {
    searchDAO = new Neo4jRealmSearchDAO(
      realmDAO,
      plainSchemaDAO,
      null,
      null,
      null,
      null,
      realmUtils,
      neo4jTemplate,
      neo4jClient
    ) {
      @Override
      protected QueryInfo getQuery(
        final SearchCond cond,
        final Map<String, Object> parameters
      ) {
        parameters.put("param0", "odd");

        return new QueryInfo(
          new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
          new HashSet<>(),
          new HashSet<>()
        );
      }
    };

    SearchCond cond = mock(SearchCond.class);

    when(
      neo4jTemplate.count(
        argThat(
          (String query) ->
            query.contains("RETURN COUNT(id)") &&
            query.contains("base1") &&
            query.contains("like1")
        ),
        anyMap()
      )
    ).thenReturn(3L);

    long result = searchDAO.doCount(Set.of("/"), cond);

    /*
     * doCount() must wrap the search query and append RETURN COUNT(id).
     */
    assertEquals(
      3L,
      result,
      "TC27 failed: doCount should return the value produced by Neo4jTemplate.count()."
    );
  }

  @Test
  @DisplayName("TC28: doSearch - Unpaged Search Does Not Add SKIP or LIMIT")
  public void testTC28_doSearch_Unpaged() {
    searchDAO = new Neo4jRealmSearchDAO(
      realmDAO,
      plainSchemaDAO,
      null,
      null,
      null,
      null,
      realmUtils,
      neo4jTemplate,
      neo4jClient
    ) {
      @Override
      protected QueryInfo getQuery(
        final SearchCond cond,
        final Map<String, Object> parameters
      ) {
        parameters.put("param0", "odd");

        return new QueryInfo(
          new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
          new HashSet<>(),
          new HashSet<>()
        );
      }
    };

    SearchCond cond = mock(SearchCond.class);

    when(
      neo4jClient
        .query(
          argThat(
            (String query) ->
              query.contains("RETURN id") &&
              !query.contains("SKIP") &&
              !query.contains("LIMIT")
          )
        )
        .bindAll(anyMap())
        .fetch()
        .all()
    ).thenReturn(List.of());

    List<Realm> result = searchDAO.doSearch(
      Set.of("/"),
      cond,
      org.springframework.data.domain.Pageable.unpaged()
    );

    /*
     * This covers the false branch of pageable.isPaged().
     */
    assertTrue(
      result.isEmpty(),
      "TC28 failed: unpaged mocked search should return an empty result list."
    );
  }

  @Test
  @DisplayName(
    "TC29: parseOrderBy - Multiple Non-Unique Plain Schemas Are Invalid"
  )
  public void testTC29_parseOrderBy_MultipleNonUniqueSchemasInvalid() {
    PlainSchema schema1 = mockSchema("tag1", AttrSchemaType.String, false);
    PlainSchema schema2 = mockSchema("tag2", AttrSchemaType.String, false);

    when(realmUtils.getField(anyString())).thenReturn(Optional.empty());

    doReturn(Optional.of(schema1)).when(plainSchemaDAO).findById("tag1");

    doReturn(Optional.of(schema2)).when(plainSchemaDAO).findById("tag2");

    /*
     * TC18 already covers multiple unique schemas. This test covers the
     * symmetric invalid path for multiple non-unique schemas.
     */
    assertThrows(
      SyncopeClientException.class,
      () ->
        searchDAO.parseOrderBy(
          Streamable.of(Sort.Order.asc("tag1"), Sort.Order.asc("tag2"))
        ),
      "TC29 failed: ordering by more than one non-unique plain schema should throw SyncopeClientException."
    );
  }

  @Test
  @DisplayName("TC30: escapeIfString - Both String and Non-String Branches")
  public void testTC30_escapeIfString_BothBranches() {
    String escaped = Neo4jRealmSearchDAO.escapeIfString("Rome", true);
    String notEscaped = Neo4jRealmSearchDAO.escapeIfString("42", false);

    assertEquals(
      "\"Rome\"",
      escaped,
      "TC30 failed: string values should be wrapped with double quotes."
    );
    assertEquals(
      "42",
      notEscaped,
      "TC30 failed: non-string values should not be wrapped."
    );
  }

  @Test
  @DisplayName(
    "TC31: findByFullPath - Blank Path Throws MalformedPathException"
  )
  public void testTC31_findByFullPath_BlankPath() {
    assertThrows(
      MalformedPathException.class,
      () -> searchDAO.findByFullPath(" "),
      "TC31 failed: blank path should throw MalformedPathException."
    );
  }

  @Test
  @DisplayName("TC32: findByFullPath - No Result Returns Empty Optional")
  public void testTC32_findByFullPath_NoResult() {
    when(
      neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()
    ).thenReturn(Optional.empty());

    Optional<Realm> result = searchDAO.findByFullPath("/missing");

    assertTrue(
      result.isEmpty(),
      "TC32 failed: missing full path should return Optional.empty()."
    );
  }

  @Test
  @DisplayName("TC33: getQuery SearchCond - NOT_LEAF AuxClass Condition")
  public void testTC33_getQuery_SearchCond_NotLeafAuxClassCond() {
    AuxClassCond auxClassCond = mock(AuxClassCond.class);
    when(auxClassCond.getAuxClass()).thenReturn("classA");

    SearchCond searchCond = mock(SearchCond.class);

    when(searchCond.getType()).thenReturn(SearchCond.Type.NOT_LEAF);
    when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(
      Optional.of(auxClassCond)
    );
    when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
    when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

    Map<String, Object> params = new HashMap<>();

    Neo4jRealmSearchDAO.QueryInfo queryInfo = searchDAO.getQuery(
      searchCond,
      params
    );

    assertTrue(
      queryInfo.query().toString().contains("WHERE NOT (n)-[]-"),
      "TC33 failed: NOT_LEAF AuxClassCond should generate a negated relationship query. Actual query: " +
        queryInfo.query()
    );
    assertEquals(
      1,
      params.size(),
      "TC33 failed: NOT_LEAF AuxClassCond should generate one parameter."
    );
  }

  @Test
  @DisplayName("TC34: wrapQuery - Order By Id Does Not Add Extra Field")
  public void testTC34_wrapQuery_OrderByIdDoesNotAddExtraField() {
    Map<String, Object> params = new HashMap<>();
    params.put("param0", "odd");

    Neo4jRealmSearchDAO.QueryInfo queryInfo = new Neo4jRealmSearchDAO.QueryInfo(
      new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
      new HashSet<>(),
      new HashSet<>()
    );

    searchDAO.wrapQuery(
      Set.of("/"),
      queryInfo,
      Streamable.of(Sort.Order.asc("id")),
      params
    );

    /*
     * The initial WITH n.id AS id is always present.
     * The important point is that id must not be added again as ", n.id AS id".
     */
    assertTrue(
      !queryInfo.query().toString().contains(", n.id AS id"),
      "TC34 failed: ordering by id should not add id as an extra selected field. Actual query: " +
        queryInfo.query()
    );
  }

  @Test
  @DisplayName(
    "TC35: wrapQuery - Unknown Order Field Is Ignored As Realm Field"
  )
  public void testTC35_wrapQuery_UnknownOrderField() {
    Map<String, Object> params = new HashMap<>();
    params.put("param0", "odd");

    when(realmUtils.getField("unknown")).thenReturn(Optional.empty());

    doReturn(Optional.empty()).when(plainSchemaDAO).findById("unknown");

    Neo4jRealmSearchDAO.QueryInfo queryInfo = new Neo4jRealmSearchDAO.QueryInfo(
      new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
      new HashSet<>(),
      new HashSet<>()
    );

    searchDAO.wrapQuery(
      Set.of("/"),
      queryInfo,
      Streamable.of(Sort.Order.asc("unknown")),
      params
    );

    assertTrue(
      !queryInfo.query().toString().contains(" AS unknown"),
      "TC35 failed: unknown order field should not be added to the WITH clause. Actual query: " +
        queryInfo.query()
    );
  }

  @Test
  @DisplayName("TC36: findDescendants - Root Prefix Uses Root Regex")
  public void testTC36_findDescendants_RootPrefix() {
    when(
      neo4jClient
        .query(anyString())
        .bindAll(
          argThat(
            (Map<String, Object> map) ->
              "/".equals(map.get("prefix")) &&
              "/.*".equals(map.get("likePrefix"))
          )
        )
        .fetch()
        .all()
    ).thenReturn(List.of());

    List<Realm> result = searchDAO.findDescendants("/odd", "/");

    assertTrue(
      result.isEmpty(),
      "TC36 failed: mocked descendants with root prefix should return an empty list."
    );
  }

  @Test
  @DisplayName("TC37: fillAttrQuery AttrCond - ISNULL Branch")
  public void testTC37_fillAttrQuery_AttrCond_ISNULL() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.ISNULL, "city", null);
    PlainAttrValue value = mockValue(null, null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    assertEquals(
      "WHERE ",
      query.toString(),
      "TC37 failed: AttrCond ISNULL branch should leave only the WHERE prefix. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC38: fillAttrQuery AttrCond - GE Double Value")
  public void testTC38_fillAttrQuery_AttrCond_GE_Double() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("score", AttrSchemaType.Double, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.GE, "score", "12.5");
    PlainAttrValue value = mockValue("12.5", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    assertTrue(
      query.toString().contains(" >= 12.5"),
      "TC38 failed: valid Double value should be rendered without quotes. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC39: fillAttrQuery AttrCond - LT Long Value")
  public void testTC39_fillAttrQuery_AttrCond_LT_Long() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.LT, "age", "42");
    PlainAttrValue value = mockValue("42", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    assertTrue(
      query.toString().contains(" < 42"),
      "TC39 failed: LT Long value should be rendered without quotes. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC40: fillAttrQuery AttrCond - Valid Boolean Value")
  public void testTC40_fillAttrQuery_AttrCond_EQ_ValidBoolean() {
    TextStringBuilder query = new TextStringBuilder();
    PlainSchema schema = mockSchema("active", AttrSchemaType.Boolean, true);
    AttrCond cond = mockAttrCond(AttrCond.Type.EQ, "active", "false");
    PlainAttrValue value = mockValue("false", null);

    searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

    assertTrue(
      query.toString().contains(" = false"),
      "TC40 failed: valid Boolean value should be rendered without quotes. Actual query: " +
        query
    );
  }

  @Test
  @DisplayName("TC41: fillAttrQuery AnyCond - ISNULL and ISNOTNULL Branches")
  public void testTC41_fillAttrQuery_AnyCond_NullBranches() {
    PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
    PlainAttrValue value = mockValue(null, null);

    TextStringBuilder isNullQuery = new TextStringBuilder();
    AnyCond isNullCond = mockCond(AnyCond.Type.ISNULL, "city", null);

    searchDAO.fillAttrQuery(
      isNullQuery,
      value,
      schema,
      isNullCond,
      false,
      parameters
    );

    assertTrue(
      isNullQuery.toString().contains("n.city IS NULL"),
      "TC41 failed: AnyCond ISNULL was not translated correctly. Actual query: " +
        isNullQuery
    );

    TextStringBuilder isNotNullQuery = new TextStringBuilder();
    AnyCond isNotNullCond = mockCond(AnyCond.Type.ISNOTNULL, "city", null);

    searchDAO.fillAttrQuery(
      isNotNullQuery,
      value,
      schema,
      isNotNullCond,
      false,
      new HashMap<>()
    );

    assertTrue(
      isNotNullQuery.toString().contains("n.city IS NOT NULL"),
      "TC41 failed: AnyCond ISNOTNULL was not translated correctly. Actual query: " +
        isNotNullQuery
    );
  }

  @Test
  @DisplayName("TC42: fillAttrQuery AnyCond - GE and LT Branches")
  public void testTC42_fillAttrQuery_AnyCond_GE_And_LT() {
    PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);

    TextStringBuilder geQuery = new TextStringBuilder();
    Map<String, Object> geParams = new HashMap<>();
    AnyCond geCond = mockCond(AnyCond.Type.GE, "age", "18");
    PlainAttrValue geValue = mockValue("18", null);

    searchDAO.fillAttrQuery(geQuery, geValue, schema, geCond, false, geParams);

    assertTrue(
      geQuery.toString().contains("n.age>=$param0"),
      "TC42 failed: AnyCond GE was not translated correctly. Actual query: " +
        geQuery
    );
    assertEquals(
      "18",
      geParams.get("param0"),
      "TC42 failed: GE parameter was not stored correctly."
    );

    TextStringBuilder ltQuery = new TextStringBuilder();
    Map<String, Object> ltParams = new HashMap<>();
    AnyCond ltCond = mockCond(AnyCond.Type.LT, "age", "65");
    PlainAttrValue ltValue = mockValue("65", null);

    searchDAO.fillAttrQuery(ltQuery, ltValue, schema, ltCond, false, ltParams);

    assertTrue(
      ltQuery.toString().contains("n.age<$param0"),
      "TC42 failed: AnyCond LT was not translated correctly. Actual query: " +
        ltQuery
    );
    assertEquals(
      "65",
      ltParams.get("param0"),
      "TC42 failed: LT parameter was not stored correctly."
    );
  }
}
