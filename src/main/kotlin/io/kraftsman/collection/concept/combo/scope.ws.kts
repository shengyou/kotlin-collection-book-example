package io.kraftsman.collection.concept.combo

val fruits = listOf("Grape", "Muskmelon", "Kumquat", "Pear")

val parsedFruitResult = fruits.map { it.length }
    .filter { it > 4 }

println(parsedFruitResult)

fruits.map { it.length }
    .filter { it > 4 }
    .let { println(it) }

fruits.map { it.length }
    .filter { it > 4 }
    .let(::println)

val fruitsSet = mutableSetOf("Grape", "Muskmelon", "Kumquat", "Pear")

val countEndsWithE = fruitsSet.run {
    add("Papaya")
    add("Pineapple")
    count { it.endsWith("e") }
}

println("$countEndsWithE 個水果名稱以 e 結尾")

with(fruits) {
    println("清單裡有：$this")
    println("總共有 $size 種水果")
}

val statistics = with(fruits) {
    "清單裡的第一個水果是 ${first()}，" +
    "清單裡的最後一個水果是 ${last()}"
}

println(statistics)

val fruitsList = mutableListOf("Papaya", "Banana", "Orange")

fruitsList.apply {
    add("Apple")
    add("Grape")
}.sort()

println(fruitsList)

fruits.also(::println)
    .map { it.length }
    .also(::println)
    .filter { it > 4 }
    .also(::println)
    .take(2)
    .also(::println)
