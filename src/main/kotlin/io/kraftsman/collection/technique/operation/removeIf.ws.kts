package io.kraftsman.collection.technique.operation

/**
 * removeIf() - 依條件移除元素
 */

// 建立範例資料
val names = mutableListOf("Eli", "Mordoc", "Sophie")

// 測試 APIs
names.removeIf { it.contains('o') }
