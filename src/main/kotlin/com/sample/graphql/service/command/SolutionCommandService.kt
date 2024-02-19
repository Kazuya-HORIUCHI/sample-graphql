package com.sample.graphql.service.command

import com.sample.graphql.datasource.problemz.entity.Solutionz
import com.sample.graphql.datasource.problemz.repository.SolutionzRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Sinks
import java.util.*
import kotlin.jvm.optionals.getOrNull

@Service
class SolutionCommandService(
    private val repository: SolutionzRepository,
) {
    private val solutionSink = Sinks.many().multicast().onBackpressureBuffer<Solutionz>()

    fun createSolutionz(s: Solutionz): Solutionz {
        return repository.save(s)
    }

    fun voteBad(solutionId: UUID): Solutionz? {
        repository.addVoteBadCount(solutionId)
        val updated = repository.findById(solutionId).getOrNull()
        updated?.let { solutionSink.tryEmitNext(updated) }
        return updated
    }

    fun voteGood(solutionId: UUID): Solutionz? {
        repository.addVoteGoodCount(solutionId)
        val updated = repository.findById(solutionId).getOrNull()
        updated?.let { solutionSink.tryEmitNext(updated) }
        return updated
    }

    fun solutionFlux() = solutionSink.asFlux()
}
