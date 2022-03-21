package io.kraftsman.collection.technique.grouping

/**
 * filterNotNullTo() - 過濾出非 Null 值後寫入指定 Collection
 */

// 建立範例資料
var list = listOf("A", null, "B", null, "C")
val mutableList = mutableListOf<String>()

// 測試 APIs
list.filterNotNullTo(mutableList)

mutableList.add("D")
