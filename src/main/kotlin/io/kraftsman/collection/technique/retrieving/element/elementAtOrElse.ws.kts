package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAtOrElse() - 取出指定位置的元素，若索引不存在可指定回傳預設值的 λ
 */

// 建立範例資料
val setOfNames = setOf("Tom", "John", "Allen", "Sean")

// 示範使用方式
setOfNames.elementAtOrElse(1) { "Unknown Person" }
setOfNames.elementAtOrElse(100) {
    if (it > 50) "Out of range" else "Unknown Person"
}
