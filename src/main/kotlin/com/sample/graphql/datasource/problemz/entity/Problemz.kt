package com.sample.graphql.datasource.problemz.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OrderBy
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "problemz")
data class Problemz(
    @Id
    val id: UUID,
    @CreationTimestamp
    val creationTimestamp: LocalDateTime = LocalDateTime.MIN,
    val title: String,
    val content: String,
    val tags: String,

    @OneToMany(mappedBy = "problemz")
    @OrderBy("creationTimestamp DESC")
    val solutions: List<Solutionz>,

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    val createdBy: Userz,
)
