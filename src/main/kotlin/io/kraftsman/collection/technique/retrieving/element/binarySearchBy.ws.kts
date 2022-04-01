package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Product

/**
 * binarySearchBy() - 依 Key 及 Selector 在 Collection 以二元搜尋找出 Index
 */

// 建立範例資料
val products = listOf(
    Product("FT-0851", "Banana", 10.0),
    Product("FT-0422", "Watermelon", 150.0),
    Product("FT-0342", "Apple", 80.0),
    Product("FT-0982", "grapes", 200.0),
    Product("FT-0952", "Orange", 60.0),
)

// 測試 APIs
products.sortedBy { it.price }
    .binarySearchBy(80.0) {
        it.price
    }
