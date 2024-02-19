package com.sample.graphql.common

import com.fasterxml.jackson.core.type.TypeReference
import graphql.schema.DataFetchingEnvironment

inline fun <reified T> DataFetchingEnvironment.getInputParams(argName: String): T {
    require(argName.isNotEmpty()) { "Argument name is not allowed empty string." }
    return objectMapper.convertValue(this.getArgument(argName) as Map<String, Any>, object : TypeReference<T>() {})
}
