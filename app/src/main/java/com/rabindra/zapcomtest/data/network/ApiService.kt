package com.rabindra.zapcomtest.data.network

import com.rabindra.zapcomtest.data.model.Block
import retrofit2.http.GET

interface ApiService {
    @GET("b/5BEJ")
    suspend fun getBlocks(): List<Block>
}