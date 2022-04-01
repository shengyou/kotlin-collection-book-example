package io.kraftsman.collection.technique.retrieving.element

/**
 * getOrElse() - 取出指定位置的元素，若 Index 不存在可指定回傳預設值的邏輯
 */

// 建立範例資料
val listOfNames = listOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.getOrElse(1) { "Unknown Person" }
listOfNames.getOrElse(100) { "Unknown Person" }
