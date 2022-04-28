package io.kraftsman.collection.technique.checking

/**
 * none() - 檢查集合裡的元素是否全部沒有通過條件
 */

// 建立範例資料
val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

// 測試集合是否沒有元素通過條件
fruits.none()
fruits.isEmpty()
fruits.isNotEmpty()

emptyList.none()
emptyList.isEmpty()
emptyList.isNotEmpty()

// 使用 λ 條件測試
fruits.none { it.endsWith("z") }
fruits.none { it.endsWith("a") }
