package io.kraftsman.collection.technique.ordering

/**
 * sortedWith() - 依傳入的 Comparator 排序
 */

// 建立範例資料
val target = listOf("aaa", "bb", "c")
val lengthComparator = Comparator { str1: String, str2: String ->
    str1.length - str2.length
}

// 測試 APIs
target.sortedWith(lengthComparator)

target.sortedWith(compareBy { it.length })
target.sortedWith(compareByDescending { it.length })
