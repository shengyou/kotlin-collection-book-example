package io.kraftsman.collection.technique.operation

/**
 * removeLastOrNull() - 移除最後一個元素，若是空 Collection 則回傳 Null
 */

// 建立範例資料
val cart = mutableListOf("Tea", "Eggs", "Sugar")
val emptyCart = mutableListOf<String>()

// 測試 APIs
cart.removeLastOrNull()
emptyCart.removeLastOrNull()
