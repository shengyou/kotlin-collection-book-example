package io.kraftsman.collection.technique.transformation

/**
 * forEachIndexed() - 逐一取出 Collection 裡的 index 及內容
 */

// 建立範例資料
val numbers = listOf(1, 3, 5, 7, 9)

// 測試 APIs
numbers.forEachIndexed { index, value ->
    println("index=$index, value=$value")
}
