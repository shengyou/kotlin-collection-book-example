package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * maxBy() - 依 λ 找出最大元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)
val emptyListOfOrderItems = emptyList<OrderItem>()
val listOfNothing = listOf<OrderItem>()

// 示範使用方式
cart.maxBy { it.amount }
emptyListOfOrderItems.maxBy { it.amount }
listOfNothing.maxBy { it.amount }
