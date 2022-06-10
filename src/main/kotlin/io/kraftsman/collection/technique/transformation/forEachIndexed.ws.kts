package io.kraftsman.collection.technique.transformation

/**
 * forEachIndexed() - 逐一取出集合裡的索引及內容
 */

// 建立範例資料
val numbers = listOf(1, 3, 5, 7, 9)

// 示範使用方式
numbers.forEachIndexed { index, element ->
    println("index=$index, element=$element")
}
