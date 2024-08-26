package com.rabindra.zapcomtest.presentation.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.rabindra.zapcomtest.domain.model.ItemDomain

@Composable
fun BannerSection(item: ItemDomain) {
    Image(
        painter = rememberAsyncImagePainter(item.image),
        contentDescription = item.title,
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
        contentScale = ContentScale.Crop
    )
}