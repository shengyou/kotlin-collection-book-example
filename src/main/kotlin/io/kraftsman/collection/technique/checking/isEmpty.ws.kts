package io.kraftsman.collection.technique.checking

/**
 * isEmpty() - 偵測集合是否有元素
 */

// 建立範例資料
val numbers = mutableListOf(1, 2, 3, 4, 5)

// 使用 size 做判斷
if (numbers.size == 0) {
    println("集合不含任何元素")
} else {
    println("集合裡有元素")
}

// 使用 count() 做判斷
if (numbers.count() == 0) {
    println("集合不含任何元素")
} else {
    println("集合裡有元素")
}

// 使用 isEmpty() 做判斷
if (numbers.isEmpty()) {
    println("集合不含任何元素")
} else {
    println("集合裡有元素")
}

// 試著清空集合
numbers.isEmpty()
numbers.clear()
numbers.isEmpty()

// 測試以 empty 函式建立的集合
val emptyNumbers = emptyList<Int>()
emptyNumbers.isEmpty()
