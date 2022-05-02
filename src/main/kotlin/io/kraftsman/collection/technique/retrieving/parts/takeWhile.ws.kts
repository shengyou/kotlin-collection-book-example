package io.kraftsman.collection.technique.retrieving.parts

/**
 * takeWhile() - 依 λ 條件取出集合元素直到無法通過條件時停下
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

// 測試 APIs
fruits.takeWhile {
    it.length > 4
}

fruits.takeWhile {
    it.startsWith('A')
}
