package io.kraftsman.collection.technique.checking

/**
 * any() - 檢查集合裡是否有任一元素通過條件
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

// 測試集合是否有任一元素通過條件
fruits.any()
fruits.isEmpty()
fruits.isNotEmpty()

emptyList.any()
emptyList.isEmpty()
emptyList.isNotEmpty()

// 使用 λ 條件測試
fruits.any { it.endsWith("e") }
fruits.any { it.endsWith("z") }
