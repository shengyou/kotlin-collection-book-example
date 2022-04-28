package io.kraftsman.collection.technique.checking

/**
 * contains() - 檢查集合裡的是否包含指定元素
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

// 測試 APIs
fruits.contains("Papaya")
fruits.contains("Banana")

"Papaya" in fruits
"Banana" in fruits
