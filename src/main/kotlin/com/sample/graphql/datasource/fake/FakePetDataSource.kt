package com.sample.graphql.datasource.fake

import com.sample.graphql.common.faker
import com.sample.graphql.generated.types.Cat
import com.sample.graphql.generated.types.Dog
import com.sample.graphql.generated.types.PetFoodType

class FakePetDataSource {
    companion object {
        val PET_LIST = (1..10).map {
            when (it % 2) {
                0 -> Dog(
                    name = faker.dog().name(),
                    food = PetFoodType.OMNIVORE,
                    breed = faker.dog().breed(),
                    size = faker.dog().size(),
                    coatLength = faker.dog().coatLength(),
                )

                else -> Cat(
                    name = faker.cat().name(),
                    food = PetFoodType.CARNIVORE,
                    breed = faker.cat().breed(),
                    registry = faker.cat().registry(),
                )
            }
        }
    }
}
