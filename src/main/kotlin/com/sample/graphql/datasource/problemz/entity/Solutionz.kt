package com.sample.graphql.datasource.problemz.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "solutionz")
data class Solutionz(
    @Id
    val id: UUID,
    @CreationTimestamp
    val creationTimestamp: LocalDateTime,
    val content: String,
    val category: String,
    val voteGoodCount: Int,
    val voteBadCount: Int,

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    val createdBy: Userz,

    @ManyToOne
    @JoinColumn(name = "problemz_id", nullable = false)
    val problemz: Problemz,
)
