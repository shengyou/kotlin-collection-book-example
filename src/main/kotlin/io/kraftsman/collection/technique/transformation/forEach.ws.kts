package io.kraftsman.collection.technique.transformation

/**
 * forEach() - 逐一取出 Collection 裡的內容
 */

// 建立範例資料
val numbers = listOf(1, 3, 5, 7, 9)
val numberMap = mapOf(1 to "one", 2 to "two", 3 to "three")

// 測試 APIs
for (number in numbers) {
    println(number)
}
for (index in numbers.indices) {
    println("$index: ${numbers[index]}")
}
for ((index, value) in numbers.withIndex()) {
    println("$index: $value")
}

numbers.forEach { println(it) }
numbers.forEach { number ->
    println(number)
}

numberMap.forEach {
    println("key=${it.key}, value=${it.value}")
}
numberMap.forEach { (key, value) ->
    println("key=$key, value=$value")
}
