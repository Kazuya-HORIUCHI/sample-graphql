package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty

public data class ProblemResponse(
  @JsonProperty("problem")
  public val problem: Problem? = null,
) {
  public companion object
}
