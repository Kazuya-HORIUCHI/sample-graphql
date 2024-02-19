package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * An individual person or character within the Star Wars universe.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Person(
  /**
   * The name of this person.
   */
  @JsonProperty("name")
  public val name: String? = null,
  /**
   * The birth year of the person, using the in-universe standard of BBY or ABY -
   * Before the Battle of Yavin or After the Battle of Yavin. The Battle of Yavin is
   * a battle that occurs at the end of Star Wars episode IV: A New Hope.
   */
  @JsonProperty("birthYear")
  public val birthYear: String? = null,
  /**
   * The eye color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have an eye.
   */
  @JsonProperty("eyeColor")
  public val eyeColor: String? = null,
  /**
   * The gender of this person. Either "Male", "Female" or "unknown",
   * "n/a" if the person does not have a gender.
   */
  @JsonProperty("gender")
  public val gender: String? = null,
  /**
   * The hair color of this person. Will be "unknown" if not known or "n/a" if the
   * person does not have hair.
   */
  @JsonProperty("hairColor")
  public val hairColor: String? = null,
  /**
   * The height of the person in centimeters.
   */
  @JsonProperty("height")
  public val height: Int? = null,
  /**
   * The mass of the person in kilograms.
   */
  @JsonProperty("mass")
  public val mass: Double? = null,
  /**
   * The skin color of this person.
   */
  @JsonProperty("skinColor")
  public val skinColor: String? = null,
  /**
   * A planet that this person was born on or inhabits.
   */
  @JsonProperty("homeworld")
  public val homeworld: Planet? = null,
  @JsonProperty("filmConnection")
  public val filmConnection: PersonFilmsConnection? = null,
  /**
   * The species that this person belongs to, or null if unknown.
   */
  @JsonProperty("species")
  public val species: Species? = null,
  @JsonProperty("starshipConnection")
  public val starshipConnection: PersonStarshipsConnection? = null,
  @JsonProperty("vehicleConnection")
  public val vehicleConnection: PersonVehiclesConnection? = null,
  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  @JsonProperty("created")
  public val created: String? = null,
  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  @JsonProperty("edited")
  public val edited: String? = null,
  /**
   * The ID of an object
   */
  @JsonProperty("id")
  override val id: String,
) : Node {
  public companion object
}
