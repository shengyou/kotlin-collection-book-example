package io.kraftsman.collection.technique.operation

/**
 * minusElement() - 將元素以原本的結構與指定 Collection 相減後回傳
 */

// 建立範例資料
val names = mutableListOf(
    listOf("Simon", "Bruce"),
    listOf("John", "Tom", "Mary"),
)

// 測試 APIs
names.minusElement(listOf("Simon", "Bruce"))
names.minus(listOf("Simon", "Bruce"))
