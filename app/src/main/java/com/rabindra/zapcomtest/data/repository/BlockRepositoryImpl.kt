package com.rabindra.zapcomtest.data.repository

import com.rabindra.zapcomtest.data.network.ApiService
import com.rabindra.zapcomtest.domain.model.BlockDomain

import com.rabindra.zapcomtest.domain.repository.BlockRepository
import javax.inject.Inject

class BlockRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : BlockRepository {
    override suspend fun getBlocks(): List<BlockDomain> {
        return apiService.getBlocks().map { it.toDomain() }
    }
}
