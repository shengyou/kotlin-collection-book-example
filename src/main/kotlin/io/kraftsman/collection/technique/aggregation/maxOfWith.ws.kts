package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * maxOfWith() - 找出 λ 回傳物件後依 Comparator 找出最大元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)

// 測試 APIs
cart.maxOfWith(
    compareBy{ it.amount }
) { it }

cart.maxOfWith(
    compareBy{ it.price }
) { it.product }
