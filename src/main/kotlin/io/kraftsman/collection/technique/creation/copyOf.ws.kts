package io.kraftsman.collection.technique.creation

/**
 * copyOf() - 從來源 Array 複製元素成新 Array
 */

// 建立範例資料
val arrayOfNumbers = arrayOf(1, 2, 3, 4, 5)
val arrayOfStrings = arrayOf("Apple", "Banana", "Orange")

// 測試 APIs
arrayOfNumbers.copyOf(2).contentToString()
arrayOfNumbers.copyOf(6).contentToString()

arrayOfStrings.copyOf(2).contentToString()
arrayOfStrings.copyOf(5).contentToString()
