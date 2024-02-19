package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.sample.graphql.generated.DgsConstants
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestParam

@DgsComponent
class FakeAdditionalOnRequestDataResolver {
    @DgsQuery(field = DgsConstants.QUERY.AdditionalOnRequest)
    fun additionalOnRequest(
        @RequestHeader(name = "optionalHeader", required = false) optionalHeader: String?,
        @RequestHeader(name = "mandatoryHeader", required = true) mandatoryHeader: String,
        @RequestParam(name = "optionalParam", required = false) optionalParam: String,
        @RequestParam(name = "mandatoryParam", required = true) mandatoryParam: String,
    ): String {
        return StringBuilder()
            .append("Optional header: $optionalHeader")
            .append(", ")
            .append("Mandatory header: $mandatoryHeader")
            .append(", ")
            .append("Optional param: $optionalParam")
            .append(", ")
            .append("Mandatory param: $mandatoryParam")
            .toString()
    }
}
