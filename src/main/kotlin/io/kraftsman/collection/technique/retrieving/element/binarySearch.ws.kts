package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Product

/**
 * binarySearch() - 依指定元素及 Comparator 在集合裡以二元搜尋找出索引值
 */

// 建立範例資料
val products = listOf(
    Product("FT-0851", "Banana", 10.0),
    Product("FT-0422", "Watermelon", 150.0),
    Product("FT-0342", "Apple", 80.0),
    Product("FT-0982", "Grapes", 200.0),
    Product("FT-0952", "Orange", 60.0),
)

// 示範使用方式
products.sortedBy { it.price }
    .binarySearch(
        Product("FT-0422", "Watermelon", 150.0),
        compareBy { it.name }
    )
