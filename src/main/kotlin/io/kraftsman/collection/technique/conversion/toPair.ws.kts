package io.kraftsman.collection.technique.conversion

/**
 * toPair() - 將 Map Entry 轉成 Pair
 */

// 建立範例資料
val numberMap = mapOf(
    "one" to 1,
    "two" to 2,
    "three" to 3,
)

// 測試 APIs
numberMap.entries.map {
    it.toPair()
}
numberMap.toList()
