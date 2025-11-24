package com.example.memeapp

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAIService {

    @Headers(
        "Content-Type: application/json"
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
