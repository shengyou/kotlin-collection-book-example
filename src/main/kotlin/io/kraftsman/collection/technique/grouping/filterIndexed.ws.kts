package io.kraftsman.collection.technique.grouping

/**
 * filterIndexed() - 在過濾邏輯裡取得 Collection 的 index
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")

// 測試 APIs
numbers.filterIndexed { index, item ->
    (index != 0) && (item.length < 5)
}
