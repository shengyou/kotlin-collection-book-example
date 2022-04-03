package io.kraftsman.collection.technique.operation

/**
 * plus() - 將元素與指定 Collection 相加後回傳
 */

// 建立範例資料
val names = mutableListOf("John", "Tom", "Mary")

// 測試 APIs
names + "Simon"
names.plus("Simon")
names.plus(listOf("Sue", "Terry"))
