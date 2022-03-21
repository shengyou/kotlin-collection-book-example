package io.kraftsman.collection.technique.grouping

/**
 * filterTo() - 依條件過濾後寫入指定 Collection
 */

// 建立範例資料
val numbers = listOf("one", "two", "three", "four")
val mutableList = mutableListOf<String>()

// 測試 APIs
numbers.filterTo(mutableList) {
    it.length > 3
}

mutableList.add("five")
