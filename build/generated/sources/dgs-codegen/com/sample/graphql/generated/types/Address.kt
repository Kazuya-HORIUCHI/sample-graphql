package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class Address(
  @JsonProperty("street")
  public val street: String,
  @JsonProperty("city")
  public val city: String,
  @JsonProperty("zipCode")
  public val zipCode: String? = null,
  @JsonProperty("country")
  public val country: String,
) {
  public companion object
}
