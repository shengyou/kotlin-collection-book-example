package io.kraftsman.collection.technique.retrieving.element

/**
 * find() - 依邏輯搜尋第一個符合條件元素回傳，若找不到就回傳 NULL
 */

// 建立範例資料
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

// 測試 APIs
words.find { it.startsWith("some") }
words.find { it.startsWith("any") }

words.filter { it.startsWith("s") }
words.filter { it.startsWith("i") }
