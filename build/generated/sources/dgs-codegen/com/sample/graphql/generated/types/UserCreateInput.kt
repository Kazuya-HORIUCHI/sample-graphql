package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.net.URL
import kotlin.String

public data class UserCreateInput(
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("email")
  public val email: String,
  @JsonProperty("password")
  public val password: String,
  @JsonProperty("displayName")
  public val displayName: String? = null,
  @JsonProperty("avatar")
  public val avatar: URL? = null,
) {
  public companion object
}
