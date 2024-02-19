package com.sample.graphql.component.fake

import com.jayway.jsonpath.TypeRef
import com.netflix.graphql.dgs.DgsQueryExecutor
import com.sample.graphql.datasource.fake.FakeHelloDataSource
import com.sample.graphql.generated.types.Hello
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import org.intellij.lang.annotations.Language
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FakeHelloDataResolverTest(
    private val dgsQueryExecutor: DgsQueryExecutor,
) : FunSpec({
    test("allHellos") {
        @Language("GraphQL")
        val queryString = """
            {
              allHellos {
                text
                randomNumber
              }
            }
        """.trimIndent()

        val hellos = dgsQueryExecutor.executeAndExtractJsonPathAsObject(
            queryString, "data.allHellos", object : TypeRef<List<Hello>>() {}
        )

        hellos.size shouldBe FakeHelloDataSource.HELLO_LIST.size
    }

    test("oneHello") {
        @Language("GraphQL")
        val queryString = """
            {
              oneHello {
                text
                randomNumber
              }
            }
        """.trimIndent()

        val hello = dgsQueryExecutor.executeAndExtractJsonPathAsObject(
            queryString, "data.oneHello", Hello::class.java
        )

        hello.text.isBlank() shouldBe false
        hello.randomNumber!! shouldBeGreaterThan 0
    }
})
