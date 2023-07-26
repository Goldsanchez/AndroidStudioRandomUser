package com.example.ruser.data.remote.response

import com.example.ruser.data.mappers.toDomain
import com.example.ruser.data.remote.RandomUserApi
import com.example.ruser.domain.model.RandomUser
import com.example.ruser.domain.repository.RandomUserRepository
import com.example.ruser.domain.util.Resource
import java.lang.Exception
import javax.inject.Inject

class RandomUserRepositoryImpl @Inject constructor(private val randomUserApi: RandomUserApi): RandomUserRepository {
    override suspend fun fetchRandomUser(): Resource<RandomUser>{
        return try {
            Resource.Success(
                data = randomUserApi.fetchRandomUser().results.first().toDomain()
            )
        } catch (e: Exception) {
            Resource.Error(
                message = "Unknown error"
            )
        }
    }
}