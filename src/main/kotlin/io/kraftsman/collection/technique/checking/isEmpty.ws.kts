package io.kraftsman.collection.technique.checking

/**
 * isEmpty() - 檢查 Collection 是否為空？
 */

// 建立範例資料
val numbers = mutableListOf(1, 2, 3, 4, 5)

// 使用長度做判斷
if (numbers.size == 0) {
    println("Collection 是空的")
} else {
    println("Collection 不是空的")
}

if (numbers.count() == 0) {
    println("Collection 是空的")
} else {
    println("Collection 不是空的")
}

// 使用 isEmpty() 做判斷
if (numbers.isEmpty()) {
    println("Collection 是空的")
} else {
    println("Collection 不是空的")
}

// 試著清空 Collection
numbers.isEmpty()
numbers.clear()
numbers.isEmpty()

// 測試空的 Collection
val emptyNumbers = emptyList<Int>()
emptyNumbers.isEmpty()
