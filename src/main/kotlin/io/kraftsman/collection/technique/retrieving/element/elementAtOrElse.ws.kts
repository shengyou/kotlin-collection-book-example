package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAtOrElse() - 取出指定位置的元素，若 Index 不存在可指定回傳預設值的邏輯
 */

// 建立範例資料
val setOfNames = setOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
setOfNames.elementAtOrElse(1) { "Unknown Person" }
setOfNames.elementAtOrElse(100) {
    if (it > 50) "Out of range" else "Unknown Person"
}
