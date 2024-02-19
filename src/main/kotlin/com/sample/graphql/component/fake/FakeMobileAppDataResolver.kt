package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.sample.graphql.datasource.fake.FakeMobileAppDataSource
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.MobileApp
import com.sample.graphql.generated.types.MobileAppFilter

@DgsComponent
class FakeMobileAppDataResolver {
    @DgsQuery(field = DgsConstants.QUERY.MobileApps)
    fun getMobileApps(@InputArgument(name = "mobileAppFilter") filter: MobileAppFilter?): List<MobileApp> {
        if (filter == null) {
            return FakeMobileAppDataSource.MOBILE_APP_LIST
        }
        return FakeMobileAppDataSource.MOBILE_APP_LIST.filter {
            matchFilter(filter, it)
        }
    }

    private fun matchFilter(filter: MobileAppFilter, mobileApp: MobileApp): Boolean {
        if (!filter.name.isNullOrEmpty()) {
            if (!mobileApp.name.contains(filter.name, true)) {
                return false
            }
        }

        if (!filter.version.isNullOrEmpty()) {
            if (mobileApp.version == null || !mobileApp.version.contains(filter.version, true)) {
                return false
            }
        }

        if (filter.releasedAfter != null) {
            if (mobileApp.releaseDate == null || !mobileApp.releaseDate.isAfter(filter.releasedAfter)) {
                return false
            }
        }

        if (filter.minimumDownload != null) {
            if (mobileApp.downloaded < filter.minimumDownload) {
                return false
            }
        }

        if (!filter.platform.isNullOrEmpty()) {
            if (mobileApp.platform == null || !mobileApp.platform.contains(filter.platform.lowercase())) {
                return false
            }
        }

        filter.author?.let {
            if (!it.name.isNullOrEmpty()) {
                if (mobileApp.author?.name == null || mobileApp.author.name.contains(it.name, true)) {
                    return false
                }
            }
        }

        if (filter.category != null) {
            if (mobileApp.category == null || mobileApp.category != filter.category) {
                return false
            }
        }

        return true
    }
}
