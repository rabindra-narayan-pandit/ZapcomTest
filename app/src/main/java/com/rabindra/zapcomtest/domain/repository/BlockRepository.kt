package com.rabindra.zapcomtest.domain.repository

import com.rabindra.zapcomtest.domain.model.BlockDomain

interface BlockRepository {
    suspend fun getBlocks(): List<BlockDomain>

}