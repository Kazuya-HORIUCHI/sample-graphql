package com.sample.graphql.client.request

data class GraphqlRestRequest(
    val query: String,
    val variables: Map<String, Any>
)
