package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * minWithOrNull() - 依 Comparator 找出最小元素，若是空集合回傳 Null
 */

// 建立範例資料
val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)
val listWithNothing = listOf<OrderItem>()
val emptyList = emptyList<OrderItem>()

// 測試 APIs
cart.minWithOrNull(compareBy{ it.amount })
listWithNothing.minWithOrNull(compareBy { it.amount })
emptyList.minWithOrNull(compareBy { it.amount })