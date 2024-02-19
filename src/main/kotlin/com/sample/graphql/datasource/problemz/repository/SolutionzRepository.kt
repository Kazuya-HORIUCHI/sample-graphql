package com.sample.graphql.datasource.problemz.repository

import com.sample.graphql.datasource.problemz.entity.Solutionz
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SolutionzRepository : CrudRepository<Solutionz, UUID> {
    @Query(nativeQuery = true, value = "select * from solutionz where upper(content) like upper(:keyword)")
    fun findByKeyword(@Param("keyword") keyword: String): List<Solutionz>

    @Transactional
    @Modifying
    @Query(
        nativeQuery = true,
        value = "update solutionz set vote_bad_count = vote_bad_count + 1 where id = :solutionzId"
    )
    fun addVoteBadCount(@Param("solutionzId") id: UUID)

    @Transactional
    @Modifying
    @Query(
        nativeQuery = true,
        value = "update solutionz set vote_good_count = vote_good_count + 1 where id = :solutionzId"
    )
    fun addVoteGoodCount(@Param("solutionzId") id: UUID)
}
