package io.kraftsman.collection.technique.operation

/**
 * removeAll() - 在 Collection 裡移除指定的數個元素
 */

// 建立範例資料
val cart = mutableListOf("Tea", "Eggs", "Sugar")
val names = mutableListOf("Eli", "Mordoc", "Sophie")

// 測試 APIs
cart.removeAll(listOf("Milk", "Sugar"))
names.removeAll { it.contains('o') }
