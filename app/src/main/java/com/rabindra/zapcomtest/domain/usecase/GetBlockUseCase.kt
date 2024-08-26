package com.rabindra.zapcomtest.domain.usecase

import com.rabindra.zapcomtest.domain.model.BlockDomain
import com.rabindra.zapcomtest.domain.repository.BlockRepository
import javax.inject.Inject

class GetBlockUseCase  @Inject constructor(
    private val repository: BlockRepository
) {
    suspend fun execute(): List<BlockDomain> {
        return repository.getBlocks()
    }
}