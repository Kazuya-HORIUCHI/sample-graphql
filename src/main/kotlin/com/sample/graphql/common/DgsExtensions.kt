package com.sample.graphql.common

import com.netflix.graphql.dgs.DgsQueryExecutor
import org.intellij.lang.annotations.Language

fun DgsQueryExecutor.executeAndExtractJsonPathAsMap(
    @Language("GraphQL") query: String,
    @Language("JSONPath") path: String
): Map<String, Any> = this.executeAndExtractJsonPath(query, path)

