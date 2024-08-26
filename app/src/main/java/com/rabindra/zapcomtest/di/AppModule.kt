package com.rabindra.zapcomtest.di

import com.rabindra.zapcomtest.data.network.ApiService
import com.rabindra.zapcomtest.data.repository.BlockRepositoryImpl
import com.rabindra.zapcomtest.domain.repository.BlockRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideBlockRepository(apiService: ApiService): BlockRepository {
        return BlockRepositoryImpl(apiService)
    }
}