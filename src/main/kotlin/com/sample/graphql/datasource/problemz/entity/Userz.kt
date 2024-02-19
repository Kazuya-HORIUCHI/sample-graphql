package com.sample.graphql.datasource.problemz.entity

import com.sample.graphql.common.NoArg
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.net.URL
import java.time.LocalDateTime
import java.util.*


@Entity
@Table(name = "userz")
data class Userz(
    @Id
    val id: UUID,
    val username: String,
    val email: String,
    val hashedPassword: String,
    val avatar: URL?,
    @CreationTimestamp
    val creationTimestamp: LocalDateTime,
    val displayName: String?,
    val active: Boolean,
    val userRole: String,
)
