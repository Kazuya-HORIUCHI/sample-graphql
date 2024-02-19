package com.sample.graphql.datasource.problemz.repository

import com.sample.graphql.datasource.problemz.entity.UserzToken
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserzTokenRepository:CrudRepository<UserzToken, UUID>
