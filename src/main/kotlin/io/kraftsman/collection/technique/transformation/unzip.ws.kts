package io.kraftsman.collection.technique.transformation

/**
 * unzip() - 把 Collection 裡的 Pair 拆成 Key 跟 Value 兩個獨立的 List
 */

// 建立範例資料
val numberPairs = listOf(
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
)

// 測試 APIs
val (key, value) = numberPairs.unzip()
