package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.Int

public data class ReleaseHistoryInput(
  @JsonProperty("year")
  public val year: Int? = null,
  @JsonProperty("printedEdition")
  public val printedEdition: Boolean? = null,
) {
  public companion object
}
