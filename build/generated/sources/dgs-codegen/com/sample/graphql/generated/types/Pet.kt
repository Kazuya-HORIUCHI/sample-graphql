package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Dog::class, name = "Dog"),
  JsonSubTypes.Type(value = Cat::class, name = "Cat")
])
public interface Pet {
  /**
   * Pet's name, make it <strong>cute</strong>
   */
  public val name: String

  public val food: PetFoodType?

  public val breed: String?

  public companion object
}
