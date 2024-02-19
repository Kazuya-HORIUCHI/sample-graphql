package com.sample.graphql.service.command

import com.sample.graphql.datasource.problemz.entity.Problemz
import com.sample.graphql.datasource.problemz.repository.ProblemzRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Sinks

@Service
class ProblemzCommandService(
    private val repository: ProblemzRepository,
) {
    private val problemzSink = Sinks.many().multicast().onBackpressureBuffer<Problemz>()

    fun createProblemz(p: Problemz): Problemz {
        val created = repository.save(p)
        problemzSink.tryEmitNext(created)
        return created
    }

    fun problemzFlux() = problemzSink.asFlux()
}
