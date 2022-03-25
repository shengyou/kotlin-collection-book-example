package io.kraftsman.collection.technique.aggregation

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

/**
 * maxOf() - 找出 λ 結果的最大元素，若是空集合會拋出 NoSuchElementException
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
cart.maxOf { it.product.price }
//listWithNothing.maxOf { it.product.price }
//emptyList.maxOf { it.product.price }

cart.maxOrNull()
cart.maxByOrNull { it.product.price }
cart.maxWithOrNull(compareBy { it.product.price})
cart.maxOf { it.product.price }
cart.maxOfOrNull { it.product.price }
cart.maxOfWith(compareBy{ it.price}) {it.product}
cart.maxOfWithOrNull(compareBy{ it.price}) {it.product}
