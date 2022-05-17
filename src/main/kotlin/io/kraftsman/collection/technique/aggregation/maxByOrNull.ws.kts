package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * maxByOrNull() - 依 λ 找出最大元素，若是 Empty 集合則回傳 Null
 */

// 建立範例資料
val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)
val emptyListOfOrderItems = emptyList<OrderItem>()
val listOfNothing = listOf<OrderItem>()

// 測試 APIs
cart.maxByOrNull { it.amount }
emptyListOfOrderItems.maxByOrNull { it.amount }
listOfNothing.maxByOrNull { it.amount }
