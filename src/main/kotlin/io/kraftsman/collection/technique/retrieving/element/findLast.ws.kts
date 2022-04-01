package io.kraftsman.collection.technique.retrieving.element

/**
 * findLast() - 依邏輯搜尋最後一個符合條件元素回傳，若找不到就回傳 NULL
 */

// 建立範例資料
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

// 測試 APIs
words.findLast { it.startsWith("some") }
words.findLast { it.startsWith("any") }
