package com.akinci.chatter.feature.dashboard.data.output

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatHistoryResponse(
    val messages: List<Message>
)