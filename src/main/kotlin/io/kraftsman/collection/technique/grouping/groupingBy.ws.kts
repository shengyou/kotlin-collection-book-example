package io.kraftsman.collection.technique.grouping

/**
 * groupingBy() - 分群後再做二次操作
 */

// 建立範例資料
val languages = listOf("java", "scala", "kotlin", "javascript", "groovy", "ruby", "react", "swift")

// 測試 APIs
languages.groupBy { it.first() }
languages.groupingBy { it.first() }.eachCount()
languages.groupingBy { it.first() }.fold(0) { total, word -> total + word.length }
