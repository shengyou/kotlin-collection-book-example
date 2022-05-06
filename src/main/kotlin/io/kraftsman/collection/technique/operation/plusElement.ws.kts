package io.kraftsman.collection.technique.operation

/**
 * plusElement() - 將元素以原本的結構與指定集合相加後回傳
 */

// 建立範例資料
val names = mutableListOf(
    listOf("John", "Tom"),
    listOf("Mary")
)

// 測試 APIs
names.plusElement(listOf("Simon", "Bruce"))

names.plus(listOf("Simon", "Bruce"))
