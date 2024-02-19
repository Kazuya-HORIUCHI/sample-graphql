package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty

public data class SolutionResponse(
  @JsonProperty("solution")
  public val solution: Solution? = null,
) {
  public companion object
}
