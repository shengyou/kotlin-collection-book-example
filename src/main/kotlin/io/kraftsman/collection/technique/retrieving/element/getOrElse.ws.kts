package io.kraftsman.collection.technique.retrieving.element

/**
 * getOrElse() - 依索引取出集合內元素，若索引超出範圍可指定回傳預設值的邏輯
 */

// 建立範例資料
val listOfNames = listOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.getOrElse(1) { "Unknown Person" }
listOfNames.getOrElse(100) {
    if (it > 50) "Out of range" else "Unknown Person"
}
