package io.kraftsman.collection.technique.retrieving.parts

/**
 * dropWhile() - 依 λ 條件丟棄集合元素直到無法通過條件時停下
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

// 示範使用方式
fruits.dropWhile {
    it.length > 4
}

fruits.dropWhile {
    it.startsWith('A')
}
