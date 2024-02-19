package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Cat(
  @JsonProperty("name")
  override val name: String,
  @JsonProperty("food")
  override val food: PetFoodType? = null,
  @JsonProperty("breed")
  override val breed: String? = null,
  @JsonProperty("registry")
  public val registry: String? = null,
) : Pet {
  public companion object
}
