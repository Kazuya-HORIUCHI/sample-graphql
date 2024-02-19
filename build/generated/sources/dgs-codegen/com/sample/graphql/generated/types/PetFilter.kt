package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class PetFilter(
  @JsonProperty("petType")
  public val petType: String? = null,
) {
  public companion object
}
