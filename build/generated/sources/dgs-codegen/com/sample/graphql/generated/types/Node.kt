package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

/**
 * An object with an ID
 */
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Film::class, name = "Film"),
  JsonSubTypes.Type(value = Species::class, name = "Species"),
  JsonSubTypes.Type(value = Planet::class, name = "Planet"),
  JsonSubTypes.Type(value = Person::class, name = "Person"),
  JsonSubTypes.Type(value = Starship::class, name = "Starship"),
  JsonSubTypes.Type(value = Vehicle::class, name = "Vehicle")
])
public interface Node {
  /**
   * The id of the object.
   */
  public val id: String

  public companion object
}
