package com.sample.graphql.datasource.fake

import com.sample.graphql.common.faker
import com.sample.graphql.generated.types.Hello

class FakeHelloDataSource {
    companion object {
        val HELLO_LIST = (1..20).map {
            Hello(
                text = faker.company().name(),
                randomNumber = faker.random().nextInt(5000),
            )
        }.toMutableList()
    }
}
