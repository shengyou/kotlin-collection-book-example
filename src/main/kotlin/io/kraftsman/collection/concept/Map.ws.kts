package io.kraftsman.collection.concept

val mapOfFruit = mapOf(
    "Apple" to 7,
    "Banana" to 5,
    "Orange" to 7,
)
val mutableMapOfFruit = mutableMapOf(
    "Apple" to 7,
    "Banana" to 5,
    "Orange" to 7,
)

val mapOfFruitByPair = mapOf(
    Pair("Apple", 7),
    Pair("Banana", 5),
    Pair("Orange", 7),
)
val mutableMapOfFruitByPair = mutableMapOf(
    Pair("Apple", 7),
    Pair("Banana", 5),
    Pair("Orange", 7),
)

val mapByBuilder = buildMap {
    put("Banana", 5)
    putAll(mapOf(
        "Apple" to 7,
        "Banana" to 5,
        "Orange" to 7,
    ))
    put("Apple", 7)
}

val emptyMap = mapOf<String, Int>()
val mutableEmptyMap = mutableMapOf<String, Int>()
val emptyMapByEmptyMap = emptyMap<String, Int>()

mapOfFruit["Apple"]
mapOfFruit.getValue("Apple")
mapOfFruit.getOrDefault("Apple", 0)

for (fruit in mapOfFruit) {
    println("${fruit.key}: ${fruit.value}")
}

for ((key, value) in mapOfFruit) {
    println("$key: $value")
}

mapOfFruit.forEach { println("${it.key}: ${it.value}") }

mapOfFruit.forEach { (key, value) ->
    println("$key: $value")
}

mutableMapOfFruit["Apple"] = 100
mutableMapOfFruit.put("Grapes", 200)

mapOfFruit.size
mapOfFruit.count()

mapOfFruit.keys
mapOfFruit.values
