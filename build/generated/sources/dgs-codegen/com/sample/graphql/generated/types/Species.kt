package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A type of person or character within the Star Wars Universe.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Species(
  /**
   * The name of this species.
   */
  @JsonProperty("name")
  public val name: String? = null,
  /**
   * The classification of this species, such as "mammal" or "reptile".
   */
  @JsonProperty("classification")
  public val classification: String? = null,
  /**
   * The designation of this species, such as "sentient".
   */
  @JsonProperty("designation")
  public val designation: String? = null,
  /**
   * The average height of this species in centimeters.
   */
  @JsonProperty("averageHeight")
  public val averageHeight: Double? = null,
  /**
   * The average lifespan of this species in years, null if unknown.
   */
  @JsonProperty("averageLifespan")
  public val averageLifespan: Int? = null,
  /**
   * Common eye colors for this species, null if this species does not typically
   * have eyes.
   */
  @JsonProperty("eyeColors")
  public val eyeColors: List<String?>? = null,
  /**
   * Common hair colors for this species, null if this species does not typically
   * have hair.
   */
  @JsonProperty("hairColors")
  public val hairColors: List<String?>? = null,
  /**
   * Common skin colors for this species, null if this species does not typically
   * have skin.
   */
  @JsonProperty("skinColors")
  public val skinColors: List<String?>? = null,
  /**
   * The language commonly spoken by this species.
   */
  @JsonProperty("language")
  public val language: String? = null,
  /**
   * A planet that this species originates from.
   */
  @JsonProperty("homeworld")
  public val homeworld: Planet? = null,
  @JsonProperty("personConnection")
  public val personConnection: SpeciesPeopleConnection? = null,
  @JsonProperty("filmConnection")
  public val filmConnection: SpeciesFilmsConnection? = null,
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
