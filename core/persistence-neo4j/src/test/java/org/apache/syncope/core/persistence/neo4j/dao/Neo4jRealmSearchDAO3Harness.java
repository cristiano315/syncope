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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.springframework.data.domain.Sort;
import org.springframework.data.util.Streamable;

/**
 * Randoop harness for {@link Neo4jRealmSearchDAO3}.
 *
 * <p>The real DAO requires Spring Data Neo4j collaborators and persistent
 * entities. This harness deliberately exposes small, deterministic entry
 * points and converts dependency-related failures into strings, so generated
 * tests compile and remain focused on branch exploration instead of Spring
 * bootstrapping.</p>
 */
public final class Neo4jRealmSearchDAO3Harness {

    private Neo4jRealmSearchDAO3Harness() {
        // Utility class for Randoop: do not instantiate.
    }

    public static Neo4jRealmSearchDAO3 newDaoWithNullDependencies() {
        return new Neo4jRealmSearchDAO3(null, null, null, null, null, null, null, null, null);
    }

    public static String setParameterOnNewMap(final Object parameter) {
        Map<String, Object> parameters = new HashMap<>();
        String name = Neo4jRealmSearchDAO3.setParameter(parameters, parameter);
        return name + "=" + parameters.get(name) + ";size=" + parameters.size();
    }

    public static String setParameterOnMap(final Map<String, Object> parameters, final Object parameter) {
        Map<String, Object> safeParameters = parameters == null ? new HashMap<>() : parameters;
        try {
            String name = Neo4jRealmSearchDAO3.setParameter(safeParameters, parameter);
            return name + "=" + safeParameters.get(name) + ";size=" + safeParameters.size();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String escapeIfString(final String value, final boolean stringValue) {
        try {
            return Neo4jRealmSearchDAO3.escapeIfString(value, stringValue);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String appendPlainAttrCond(final String cond) {
        try {
            TextStringBuilder query = new TextStringBuilder();
            Neo4jRealmSearchDAO3.appendPlainAttrCond(query, null, cond);
            return query.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String queryOp(final String op, final String leftQuery, final String rightQuery) {
        try {
            TextStringBuilder query = new TextStringBuilder();
            Neo4jRealmSearchDAO3.queryOp(query, op, queryInfo(leftQuery, null), queryInfo(rightQuery, null));
            return query.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String wrapQuery(final Set<String> bases, final String innerQuery, final String orderProperty) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            Streamable<Sort.Order> orderBy = orderProperty == null
                    ? Streamable.of(Collections.<Sort.Order>emptyList())
                    : Streamable.of(Collections.singletonList(Sort.Order.asc(orderProperty)));
            Neo4jRealmSearchDAO3.QueryInfo queryInfo = queryInfo(innerQuery, null);

            newDaoWithNullDependencies().wrapQuery(
                    bases == null ? Collections.emptySet() : new HashSet<>(bases),
                    queryInfo,
                    orderBy,
                    parameters);

            return queryInfo.query().toString() + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getSearchCondQuery(final SearchCond cond) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            Neo4jRealmSearchDAO3.QueryInfo queryInfo = newDaoWithNullDependencies().getQuery(cond, parameters);
            return queryInfo.query().toString() + ";fields=" + queryInfo.fields() + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getAttrCondQuery(final AttrCond cond, final boolean not) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            Neo4jRealmSearchDAO3.AttrCondQuery query = newDaoWithNullDependencies().getQuery(cond, not, parameters);
            return query.query() + ";schema=" + Optional.ofNullable(query.schema()).map(Object::toString).orElse("null")
                    + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getAnyCondQuery(final AnyCond cond, final boolean not) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            Neo4jRealmSearchDAO3.AnyCondQuery query = newDaoWithNullDependencies().getQuery(cond, not, parameters);
            return query.query() + ";field=" + query.field() + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getAuxClassCondQuery(final AuxClassCond cond, final boolean not) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            String query = newDaoWithNullDependencies().getQuery(cond, not, parameters);
            return query + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getResourceCondQuery(final ResourceCond cond, final boolean not) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            String query = newDaoWithNullDependencies().getQuery(cond, not, parameters);
            return query + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String getCustomCondsQuery(final SearchCond cond, final boolean not) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            TextStringBuilder query = new TextStringBuilder();
            newDaoWithNullDependencies().getQueryForCustomConds(cond, parameters, not, query);
            return query.toString() + ";params=" + sortedMap(parameters);
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeFindByFullPath(final String fullPath) {
        try {
            return newDaoWithNullDependencies().findByFullPath(fullPath).map(Object::toString).orElse("empty");
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static List<Realm> safeFindByName(final String name) {
        try {
            return newDaoWithNullDependencies().findByName(name);
        } catch (RuntimeException e) {
            return Collections.emptyList();
        }
    }

    public static List<Realm> safeFindChildren(final Realm realm) {
        try {
            return newDaoWithNullDependencies().findChildren(realm);
        } catch (RuntimeException e) {
            return Collections.emptyList();
        }
    }

    public static List<Realm> safeFindDescendants(final String base, final String prefix) {
        try {
            return newDaoWithNullDependencies().findDescendants(base, prefix);
        } catch (RuntimeException e) {
            return Collections.emptyList();
        }
    }

    private static Neo4jRealmSearchDAO3.QueryInfo queryInfo(final String query, final Set<String> fields) {
        return new Neo4jRealmSearchDAO3.QueryInfo(
                new TextStringBuilder(query == null ? "" : query),
                fields == null ? new HashSet<>() : new HashSet<>(fields),
                new HashSet<>());
    }

    private static String sortedMap(final Map<String, Object> map) {
        return map.entrySet().stream().
                sorted(Map.Entry.comparingByKey()).
                map(entry -> entry.getKey() + "=" + entry.getValue()).
                collect(Collectors.joining(",", "{", "}"));
    }

    private static String failure(final RuntimeException e) {
        return "EX:" + e.getClass().getSimpleName()
                + (e.getMessage() == null ? "" : ":" + e.getMessage());
    }
}
