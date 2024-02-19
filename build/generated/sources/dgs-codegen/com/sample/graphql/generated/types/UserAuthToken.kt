package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.time.OffsetDateTime
import kotlin.String

public data class UserAuthToken(
  @JsonProperty("authToken")
  public val authToken: String? = null,
  @JsonProperty("expiryTime")
  public val expiryTime: OffsetDateTime? = null,
) {
  public companion object
}
