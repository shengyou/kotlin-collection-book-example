package io.kraftsman.collection.technique.aggregation

/**
 * eachCountTo() - 計算 Grouping 後每一組子 Collection 裡的數量並寫入指定 Collection
 */

// 建立範例資料
val numberStrings = listOf("one", "two", "three", "four", "five", "six")
val mutableMap = mutableMapOf<Int, Int>()

// 測試 APIs
numberStrings.groupingBy { it.length }.eachCountTo(mutableMap)
