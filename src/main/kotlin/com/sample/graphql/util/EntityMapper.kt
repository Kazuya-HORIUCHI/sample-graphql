package com.sample.graphql.util

import com.sample.graphql.datasource.problemz.entity.Problemz
import com.sample.graphql.datasource.problemz.entity.Solutionz
import com.sample.graphql.datasource.problemz.entity.Userz
import com.sample.graphql.generated.types.ProblemCreateInput
import com.sample.graphql.generated.types.SolutionCreateInput
import com.sample.graphql.generated.types.UserCreateInput
import java.time.LocalDateTime
import java.util.*

fun ProblemCreateInput.mapToProblemz(author: Userz): Problemz {
    return Problemz(
        id = UUID.randomUUID(),
        title = title,
        content = content,
        tags = tags.joinToString(","),
        solutions = emptyList(),
        createdBy = author,
    )
}

fun SolutionCreateInput.mapToSolutionz(author: Userz, problemz: Problemz): Solutionz {
    return Solutionz(
        id = UUID.randomUUID(),
        creationTimestamp = LocalDateTime.now(),
        content = content,
        category = category.name,
        voteGoodCount = 0,
        voteBadCount = 0,
        createdBy = author,
        problemz = problemz,
    )
}

fun UserCreateInput.mapToUserz(): Userz {
    return Userz(
        id = UUID.randomUUID(),
        username = username,
        email = email,
        hashedPassword = HashUtil.hashBcrypt(password),
        avatar = avatar,
        creationTimestamp = LocalDateTime.now(),
        displayName = displayName,
        active = true,
        userRole = "ROLE_MEMBER"
    )
}
