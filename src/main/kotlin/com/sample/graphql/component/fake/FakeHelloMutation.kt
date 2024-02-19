package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.InputArgument
import com.sample.graphql.datasource.fake.FakeHelloDataSource
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Hello
import com.sample.graphql.generated.types.HelloInput

@DgsComponent
class FakeHelloMutation {
    @DgsMutation(field = DgsConstants.MUTATION.AddHello)
    fun addHello(@InputArgument(name = "helloInput") input: HelloInput): Int {
        val hello = Hello(
            text = input.text,
            randomNumber = input.number
        )
        FakeHelloDataSource.HELLO_LIST.add(hello)
        return FakeHelloDataSource.HELLO_LIST.size
    }

    @DgsMutation(field = DgsConstants.MUTATION.ReplaceHelloText)
    fun replaceHelloText(@InputArgument(name = "helloInput") input: HelloInput): List<Hello> {
        FakeHelloDataSource.HELLO_LIST.replaceAll {
            if (it.randomNumber == input.number) {
                Hello(text = input.text, randomNumber = input.number)
            } else {
                it
            }
        }
        return FakeHelloDataSource.HELLO_LIST
    }

    @DgsMutation(field = DgsConstants.MUTATION.DeleteHello)
    fun deleteHello(number: Int): Int {
        FakeHelloDataSource.HELLO_LIST.removeIf { it.randomNumber == number }
        return FakeHelloDataSource.HELLO_LIST.size
    }
}
