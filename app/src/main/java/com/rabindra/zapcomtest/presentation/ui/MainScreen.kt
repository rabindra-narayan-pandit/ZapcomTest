package com.rabindra.zapcomtest.presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.rabindra.zapcomtest.presentation.ui.composable.BannerSection
import com.rabindra.zapcomtest.presentation.ui.composable.HorizontalFreeScrollSection
import com.rabindra.zapcomtest.presentation.ui.composable.SplitBannerSection
import com.rabindra.zapcomtest.presentation.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    val blocks by viewModel.blocks.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        blocks.forEach { block ->
            item {
                when (block.sectionType) {
                    "banner" -> BannerSection(block.items.first())
                    "horizontalFreeScroll" -> HorizontalFreeScrollSection(block.items)
                    "splitBanner" -> SplitBannerSection(block.items)
                }
            }
        }
    }
}