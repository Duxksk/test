package com.example.memeapp

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAIService {

    @Headers(
        "Content-Type: application/json",
        // 여기에 네 API 키 직접 입력 (절대 실제 키를 공개 X)
        "Authorization: Bearer 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"
    )
    @POST("v1/videos")
    suspend fun createVideo(
        @Body body: VideoRequest
    ): VideoResponse
}

data class VideoRequest(
    val model: String = "gpt-4o-mini",
    val prompt: String
)
