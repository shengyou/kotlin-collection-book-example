package io.kraftsman.collection.technique.retrieving.parts

/**
 * dropLastWhile() - 依 λ 條件反向丟棄集合元素直到無法通過條件時停下
 */

// 建立範例資料
val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

// 測試 APIs
fruits.dropLastWhile {
    it.length > 4
}

fruits.dropLastWhile {
    it.contains('a') or it.contains('e')
}
