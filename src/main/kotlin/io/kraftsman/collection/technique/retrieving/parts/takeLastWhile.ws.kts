package io.kraftsman.collection.technique.retrieving.parts

/**
 * takeLastWhile() - 依 λ 條件反向取出集合元素直到無法通過條件時停下
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

// 示範使用方式
fruits.takeLastWhile {
    it.length > 4
}

fruits.takeLastWhile {
    it.startsWith('Z')
}
