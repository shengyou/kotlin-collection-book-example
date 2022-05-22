package io.kraftsman.collection.technique.grouping

/**
 * filterIndexed() - 在過濾集合時包含索引
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

// 測試 APIs
fruits.filterIndexed { index, element ->
    (index != 0) && (element.length < 5)
}
