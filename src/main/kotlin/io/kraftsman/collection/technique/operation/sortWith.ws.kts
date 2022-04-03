package io.kraftsman.collection.technique.operation

/**
 * sortWith() - 以傳入的 Comparator 排序
 */

// 建立範例資料
val target = mutableListOf("aaa", "bb", "c")
val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }

// 測試 APIs
target.sortWith(lengthComparator)
target.sortWith(compareBy { it.length })
target.sortWith(compareByDescending { it.length })
