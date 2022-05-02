package io.kraftsman.collection.technique.retrieving.element

import kotlin.random.Random

/**
 * random() - 從集合隨機取出一個元素，若是 Empty 集合則拋出 NoSuchElementException
 */

// 建立範例資料
val numbers = listOf(2, 3, 5, 6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

// 測試 APIs
numbers.random()
numbers[Random.nextInt(numbers.size)]

emptyList.random()
nothingInList.random()
