package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.String

public data class SolutionVoteInput(
  @JsonProperty("solutionId")
  public val solutionId: String,
  @JsonProperty("voteAsGood")
  public val voteAsGood: Boolean,
) {
  public companion object
}
