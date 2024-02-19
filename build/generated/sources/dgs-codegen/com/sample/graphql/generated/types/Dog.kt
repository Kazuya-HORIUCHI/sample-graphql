package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Dog(
  @JsonProperty("name")
  override val name: String,
  @JsonProperty("food")
  override val food: PetFoodType? = null,
  @JsonProperty("breed")
  override val breed: String? = null,
  @JsonProperty("size")
  public val size: String? = null,
  @JsonProperty("coatLength")
  public val coatLength: String? = null,
) : Pet {
  public companion object
}
