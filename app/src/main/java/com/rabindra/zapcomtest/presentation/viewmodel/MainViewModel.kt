package com.rabindra.zapcomtest.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rabindra.zapcomtest.domain.model.BlockDomain
import com.rabindra.zapcomtest.domain.usecase.GetBlockUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class MainViewModel @Inject constructor(
    private val getBlocksUseCase: GetBlockUseCase
) : ViewModel() {

    private val _blocks = MutableStateFlow<List<BlockDomain>>(emptyList())
    val blocks: StateFlow<List<BlockDomain>> = _blocks

    init {
        fetchBlocks()
    }

    private fun fetchBlocks() {
        viewModelScope.launch {
            try {
                val result = getBlocksUseCase.execute()
                _blocks.value = result
            } catch (e: Exception) {
                // Handle exceptions
            }
        }
    }
}