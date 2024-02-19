package com.sample.graphql.service.query

import com.sample.graphql.datasource.problemz.repository.ProblemzRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.getOrNull

@Service
class ProblemzQueryService(
    private val repository: ProblemzRepository,
) {
    fun problemzLatestList() = repository.findAllByOrderByCreationTimestampDesc()

    fun problemDetail(problemzId: UUID) = repository.findById(problemzId).getOrNull()

    fun problemzByKeyword(keyword: String) = repository.findByKeyword("%$keyword%")
}
