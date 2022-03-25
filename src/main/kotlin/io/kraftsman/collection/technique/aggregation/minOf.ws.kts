package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * minOf() - 找出 λ 結果的最小元素，若是空集合會拋出 NoSuchElementException
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
cart.minOf { it.product.price }
listWithNothing.minOf { it.product.price }
emptyList.minOf { it.product.price }
