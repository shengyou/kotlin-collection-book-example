package io.kraftsman.collection.practice.lottery

val result = mutableSetOf<Int>()

while (result.size < 6) {
    result.add((1..49).random())
}

println(result.sorted().joinToString(","))
