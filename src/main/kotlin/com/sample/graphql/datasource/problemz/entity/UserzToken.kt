package com.sample.graphql.datasource.problemz.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "userz_token")
data class UserzToken(
    @Id
    val userId: UUID,
    val authToken: String,
    @CreationTimestamp
    val creationTimestamp: LocalDateTime,
    val expiryTimestamp: LocalDateTime
)
