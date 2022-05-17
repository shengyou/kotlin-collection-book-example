package io.kraftsman.collection.concept.variants

val numbers = listOf(1, 3, 5, 7, 9)

numbers.forEach { println(it) }

numbers.forEachIndexed { index, value ->
    println("index=$index, value=$value")
}
