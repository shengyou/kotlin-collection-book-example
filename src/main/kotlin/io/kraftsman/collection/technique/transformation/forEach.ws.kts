package io.kraftsman.collection.technique.transformation

/**
 * forEach() - 逐一取出集合元素
 */

// 建立範例資料
val numbers = listOf(1, 3, 5, 7, 9)
val warehouse = mapOf(
    "Apple" to 10,
    "Banana" to 20,
    "Orange" to 5,
)

// 示範使用方式
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

warehouse.forEach {
    println("key=${it.key}, value=${it.value}")
}

warehouse.forEach { (key, value) ->
    println("key=$key, value=$value")
}

warehouse.forEach { (fruit, amount) ->
    println("fruit=$fruit, amount=$amount")
}
