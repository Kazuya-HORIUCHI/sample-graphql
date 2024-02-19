package com.sample.graphql.datasource.fake

import com.sample.graphql.common.faker
import com.sample.graphql.generated.types.Address
import com.sample.graphql.generated.types.Author
import com.sample.graphql.generated.types.Book
import com.sample.graphql.generated.types.ReleaseHistory
import java.util.concurrent.ThreadLocalRandom

class FakeBookDataSource {
    companion object {
        val BOOK_LIST = (1..20).map {
            val addresses = (0 until ThreadLocalRandom.current().nextInt(1, 3)).map {
                Address(
                    country = faker.address().country(),
                    city = faker.address().cityName(),
                    street = faker.address().streetAddress(),
                    zipCode = faker.address().zipCode(),
                )
            }
            val author = Author(
                addresses = addresses,
                name = faker.book().author(),
                originCountry = faker.country().name()
            )
            val released = ReleaseHistory(
                printedEdition = faker.bool().bool(),
                releasedCountry = faker.country().name(),
                year = faker.number().numberBetween(2019, 2021),
            )
            Book(
                author = author,
                publisher = faker.book().publisher(),
                title = faker.book().title(),
                released = released,
            )
        }
    }
}
