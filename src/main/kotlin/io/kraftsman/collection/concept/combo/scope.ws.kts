package io.kraftsman.collection.concept.combo

val fruits = mutableSetOf("Grape", "Muskmelon", "Kumquat", "Pear")

val parsedFruitResult = fruits.map { it.length }
    .filter { it > 4 }
println(parsedFruitResult)

fruits.map { it.length }
    .filter { it > 4 }
    .let {
        println(it)
    }

val countEndsWithE = fruits.run {
    add("Papaya")
    add("Pineapple")
    count { it.endsWith("e") }
}
println("$countEndsWithE 個水果名稱以 e 結尾")

val countStartWithP = with(fruits) {
    add("Papaya")
    add("Pineapple")
    count { it.startsWith("P") }
}
println("$countStartWithP 個水果名稱以 P 開頭")

fruits.apply {
    add("Papaya")
    add("Pineapple")
}

fruits.map { it.length }
    .filter { it > 4 }
    .also { println(it) }
    .take(2)
