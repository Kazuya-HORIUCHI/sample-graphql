package com.sample.graphql.datasource.problemz.repository

import com.sample.graphql.datasource.problemz.entity.Problemz
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProblemzRepository : CrudRepository<Problemz, UUID> {
    fun findAllByOrderByCreationTimestampDesc(): List<Problemz>

    @Query(
        nativeQuery = true,
        value = """
            select * from problemz p
            where upper(content) like upper(:keyword)
            or upper(title) like upper(:keyword)
            or upper(tags) like upper(:keyword)
        """
    )
    fun findByKeyword(@Param("keyword") keyword: String): List<Problemz>
}
