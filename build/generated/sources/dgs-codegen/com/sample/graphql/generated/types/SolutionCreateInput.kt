package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class SolutionCreateInput(
  @JsonProperty("content")
  public val content: String,
  @JsonProperty("category")
  public val category: SolutionCategory,
  @JsonProperty("problemId")
  public val problemId: String,
) {
  public companion object
}
