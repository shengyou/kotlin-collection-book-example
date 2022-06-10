package io.kraftsman.collection.technique.retrieving.element

import io.kraftsman.collection.data.Product

/**
 * binarySearchBy() - 依 Key 及選擇器在集合裡以二元搜尋找出索引值
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
    .binarySearchBy(80.0) {
        it.price
    }
