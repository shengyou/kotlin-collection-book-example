package io.kraftsman.collection.practice.lottery

val numbers = mutableSetOf<Int>()

while (numbers.size < 6) {
    numbers.add((1..49).random())
}

numbers.sorted().joinToString().let(::println)
