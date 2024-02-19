package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String

public data class Stock(
  @JsonProperty("symbol")
  public val symbol: String,
  @JsonProperty("price")
  public val price: Int? = null,
  @JsonProperty("lastTradeDateTime")
  public val lastTradeDateTime: OffsetDateTime? = null,
) {
  public companion object
}
