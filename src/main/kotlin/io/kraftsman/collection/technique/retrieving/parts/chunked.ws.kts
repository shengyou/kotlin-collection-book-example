package io.kraftsman.collection.technique.retrieving.parts

/**
 * chunked() - 依指定尺寸將集合切塊
 */

// 建立範例資料
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val chars = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g')

// 測試 APIs
numbers.chunked(3)

numbers.chunked(3) { it.sum() }

chars.chunked(2) {
    it.joinToString(
        separator = "+",
        prefix = "(",
        postfix = ")"
    )
}
