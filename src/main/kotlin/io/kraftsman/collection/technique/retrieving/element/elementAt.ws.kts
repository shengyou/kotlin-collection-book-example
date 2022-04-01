package io.kraftsman.collection.technique.retrieving.element

/**
 * elementAt() - 取出指定位置的元素，若 Index 不存在則拋出 IndexOutOfBoundsException
 */

// 建立範例資料
val listOfNames = setOf("Tom", "John", "Allen", "Sean")

// 測試 APIs
listOfNames.elementAt(1)
