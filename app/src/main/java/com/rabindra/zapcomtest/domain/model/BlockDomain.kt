package com.rabindra.zapcomtest.domain.model

data class BlockDomain(
    val sectionType: String,
    val items: List<ItemDomain>
)

data class ItemDomain(
    val title: String,
    val image: String
)