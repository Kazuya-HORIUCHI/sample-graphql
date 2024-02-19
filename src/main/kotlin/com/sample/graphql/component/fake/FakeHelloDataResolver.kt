package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.sample.graphql.datasource.fake.FakeHelloDataSource
import com.sample.graphql.generated.types.Hello
import java.util.concurrent.ThreadLocalRandom

@DgsComponent
class FakeHelloDataResolver {
    @DgsQuery
    fun allHellos(): List<Hello> = FakeHelloDataSource.HELLO_LIST

    @DgsQuery
    fun oneHello(): Hello =
        FakeHelloDataSource.HELLO_LIST[ThreadLocalRandom.current().nextInt(FakeHelloDataSource.HELLO_LIST.size)]
}
