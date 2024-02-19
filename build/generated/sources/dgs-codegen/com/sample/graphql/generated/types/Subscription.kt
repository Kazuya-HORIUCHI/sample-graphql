package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty

public data class Subscription(
  @JsonProperty("randomStock")
  public val randomStock: Stock? = null,
  @JsonProperty("problemAdded")
  public val problemAdded: Problem,
  @JsonProperty("solutionVoteChanged")
  public val solutionVoteChanged: Solution,
) {
  public companion object
}
