package io.kraftsman.collection.technique.grouping

/**
 * filterIndexedTo() - 在過濾邏輯裡取得 Collection 的 index 後寫入指定 Collection
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val mutableList = mutableListOf<String>()

// 測試 APIs
numbers.filterIndexedTo(mutableList) { index, item ->
    (index != 0) && (item.length < 5)
}

mutableList.add("five")
