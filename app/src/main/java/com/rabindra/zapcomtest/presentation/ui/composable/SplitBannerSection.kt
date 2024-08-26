package com.rabindra.zapcomtest.presentation.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.rabindra.zapcomtest.domain.model.ItemDomain

@Composable
fun SplitBannerSection(items: List<ItemDomain>) {
    if (items.size == 2) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
        ) {
            items.forEach { item ->
                Image(
                    painter = rememberAsyncImagePainter(item.image),
                    contentDescription = item.title,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    } else {
        Text("Error: SplitBannerSection requires exactly 2 items", color = Color.Red)
    }
}