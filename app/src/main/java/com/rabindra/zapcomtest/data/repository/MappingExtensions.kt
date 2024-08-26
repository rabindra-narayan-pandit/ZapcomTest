package com.rabindra.zapcomtest.data.repository

import com.rabindra.zapcomtest.data.model.Block
import com.rabindra.zapcomtest.data.model.Item
import com.rabindra.zapcomtest.domain.model.BlockDomain
import com.rabindra.zapcomtest.domain.model.ItemDomain

fun Block.toDomain(): BlockDomain {
    return BlockDomain(
        sectionType = this.sectionType,
        items = this.items.map { it.toDomain() }
    )
}

fun Item.toDomain(): ItemDomain {
    return ItemDomain(
        title = this.title,
        image = this.image
    )
}