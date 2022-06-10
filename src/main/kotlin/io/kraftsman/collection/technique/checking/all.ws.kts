package io.kraftsman.collection.technique.checking

/**
 * all() - 檢查集合裡的元素是否全部通過條件
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

// 示範使用方式
fruits.all { it.endsWith("e") }

// Vacuous Truth
emptyList.all { it == "anything" }
