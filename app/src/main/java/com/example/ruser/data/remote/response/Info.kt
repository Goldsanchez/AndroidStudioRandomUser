package com.example.ruser.data.remote.response

data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)