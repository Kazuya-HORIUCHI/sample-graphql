package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty

public data class Root(
  @JsonProperty("allFilms")
  public val allFilms: FilmsConnection? = null,
  @JsonProperty("film")
  public val film: Film? = null,
  @JsonProperty("allPeople")
  public val allPeople: PeopleConnection? = null,
  @JsonProperty("person")
  public val person: Person? = null,
  @JsonProperty("allPlanets")
  public val allPlanets: PlanetsConnection? = null,
  @JsonProperty("planet")
  public val planet: Planet? = null,
  @JsonProperty("allSpecies")
  public val allSpecies: SpeciesConnection? = null,
  @JsonProperty("species")
  public val species: Species? = null,
  @JsonProperty("allStarships")
  public val allStarships: StarshipsConnection? = null,
  @JsonProperty("starship")
  public val starship: Starship? = null,
  @JsonProperty("allVehicles")
  public val allVehicles: VehiclesConnection? = null,
  @JsonProperty("vehicle")
  public val vehicle: Vehicle? = null,
  /**
   * Fetches an object given its ID
   */
  @JsonProperty("node")
  public val node: Node? = null,
) {
  public companion object
}
