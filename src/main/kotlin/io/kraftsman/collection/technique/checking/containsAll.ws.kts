package io.kraftsman.collection.technique.checking

/**
 * containsAll() - 檢查集合裡是否包含全部的指定元素
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

// 測試 APIs
fruits.containsAll(listOf("Grape"))
fruits.containsAll(listOf("Banana"))

fruits.containsAll(listOf("Grape", "Pineapple"))
fruits.containsAll(listOf("Papaya", "Banana"))
