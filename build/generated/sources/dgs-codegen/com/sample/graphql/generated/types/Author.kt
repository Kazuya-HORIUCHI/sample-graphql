package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

public data class Author(
  @JsonProperty("name")
  public val name: String,
  @JsonProperty("originCountry")
  public val originCountry: String? = null,
  @JsonProperty("addresses")
  public val addresses: List<Address>,
) {
  public companion object
}
