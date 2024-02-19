package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class ReleaseHistory(
  @JsonProperty("year")
  public val year: Int,
  @JsonProperty("printedEdition")
  public val printedEdition: Boolean? = null,
  @JsonProperty("releasedCountry")
  public val releasedCountry: String? = null,
) {
  public companion object
}
