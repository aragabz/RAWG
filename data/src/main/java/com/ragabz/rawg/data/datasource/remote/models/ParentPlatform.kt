package com.ragabz.rawg.data.datasource.remote.models


import com.squareup.moshi.Json

data class ParentPlatform(
    @Json(name = "platform")
    val platform: Platform,
    @Json(name = "released_at")
    val releasedAt: String,
    @Json(name = "requirements")
    val requirements: Requirements
)