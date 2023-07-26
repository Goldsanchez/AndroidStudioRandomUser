package com.example.ruser.domain.repository

import com.example.ruser.domain.model.RandomUser
import com.example.ruser.domain.util.Resource

interface RandomUserRepository {

    suspend fun fetchRandomUser(): Resource<RandomUser>
}