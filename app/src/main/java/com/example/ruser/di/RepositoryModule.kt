package com.example.ruser.di

import com.example.ruser.data.remote.response.RandomUserRepositoryImpl
import com.example.ruser.domain.repository.RandomUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRandomUserRepository(randomUserRepositoryImpl: RandomUserRepositoryImpl): RandomUserRepository
}