package io.kraftsman.collection.technique.operation

/**
 * plus() - 將元素與指定集合相加
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names.plus("Simon")
names.plus(listOf("Sue", "Terry"))

names + "Simon"
