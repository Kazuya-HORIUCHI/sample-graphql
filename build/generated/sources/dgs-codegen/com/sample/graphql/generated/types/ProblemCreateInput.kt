package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

public data class ProblemCreateInput(
  @JsonProperty("title")
  public val title: String,
  @JsonProperty("content")
  public val content: String,
  @JsonProperty("tags")
  public val tags: List<String>,
) {
  public companion object
}
