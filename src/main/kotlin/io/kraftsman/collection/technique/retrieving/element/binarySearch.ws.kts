package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Product

/**
 * binarySearch() - 依指定元素及 Comparator 在 Collection 以二元搜尋找出 Index
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
    .binarySearch(
        Product("FT-0422", "Watermelon", 150.0),
        compareBy { it.price }
    )