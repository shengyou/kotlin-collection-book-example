package io.kraftsman.collection.technique.operation

/**
 * retainAll() - 在 Collection 裡保留指定的元素
 */

// 建立範例資料
val cart = mutableListOf("Tea", "Eggs", "Sugar")
val names = mutableListOf("Eli", "Mordoc", "Sophie")

// 測試 APIs
cart.retainAll(listOf("Tea", "Sugar"))
names.retainAll { it.contains('l') }
