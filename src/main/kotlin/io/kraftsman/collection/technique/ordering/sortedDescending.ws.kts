package io.kraftsman.collection.technique.ordering

/**
 * sortedDescending() - 依自然排序反向排序
 */

// 建立範例資料
val numbers = listOf(4, 1, 3, 5, 2)
val chars = setOf('b', 'y', 'p', 'x', 'h')
val strings = setOf("Grape", "Muskmelon", "Kumquat", "Pear")

// 測試 APIs
numbers.sortedDescending()
chars.sortedDescending()
strings.sortedDescending()
