package com.example.ruser.data.remote

import com.example.ruser.data.remote.response.ResponseDto
import retrofit2.http.GET

interface RandomUserApi {

    @GET("api")
    suspend fun fetchRandomUser(): ResponseDto
}