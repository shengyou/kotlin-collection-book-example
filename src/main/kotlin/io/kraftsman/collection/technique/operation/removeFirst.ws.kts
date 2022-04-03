package io.kraftsman.collection.technique.operation

/**
 * removeFist() - 移除第一個元素，若是空 Collection 則拋 NoSuchElementException
 */

// 建立範例資料
val cart = mutableListOf("Tea", "Eggs", "Sugar")

// 測試 APIs
cart.removeFirst()
