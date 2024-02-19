package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.net.URL
import java.time.OffsetDateTime
import kotlin.String
import kotlin.collections.List

public data class User(
  @JsonProperty("id")
  public val id: String,
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("email")
  public val email: String,
  @JsonProperty("avatar")
  public val avatar: URL? = null,
  @JsonProperty("createDateTime")
  public val createDateTime: OffsetDateTime,
  @JsonProperty("displayName")
  public val displayName: String? = null,
  @JsonProperty("problems")
  public val problems: List<Problem>? = null,
) {
  public companion object
}
