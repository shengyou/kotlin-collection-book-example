package io.kraftsman.collection.technique.grouping

/**
 * filter() - 依條件過濾
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val numberMap = mapOf(
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4
)

// 測試 APIs
numbers.filter { it.length > 3 }
numberMap.filter { (key, value) ->
    key.contains("t") && value >= 1
}
