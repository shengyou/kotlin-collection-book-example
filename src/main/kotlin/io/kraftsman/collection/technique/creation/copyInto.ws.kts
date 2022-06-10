package io.kraftsman.collection.technique.creation

/**
 * copyInto() - 把來源 Array 的內容複製到指定的 Array 裡
 */

// 建立範例資料
val arrayOfFruits = arrayOf("Apple", "Banana", "Orange")
val destinationArray = arrayOf("Blackberry", "Coconut", "Cherry", "Peach", "Avocado")

// 示範使用方式
arrayOfFruits.copyInto(destinationArray, 1, 1, 3).contentToString()
