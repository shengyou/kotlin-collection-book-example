package io.kraftsman.collection.technique.retrieving.element

/**
 * randomOrNull() - 隨機從 Collection 取出一個元素，若是空 Collection 則回傳 Null
 */

// 建立範例資料
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
emptyList.randomOrNull()
nothingInList.randomOrNull()
