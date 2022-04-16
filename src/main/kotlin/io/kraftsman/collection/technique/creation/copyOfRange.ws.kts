package io.kraftsman.collection.technique.creation

/**
 * copyOfRange() - 從來源 Array 複製指定區間的元素成新 Array
 */

// 建立範例資料
val arrayOfNumbers = arrayOf(1, 2, 3, 4, 5)
val arrayOfStrings = arrayOf("Apple", "Banana", "Orange")

// 測試 APIs
arrayOfNumbers.copyOfRange(2, 4).contentToString()
arrayOfStrings.copyOfRange(1, 3).contentToString()
