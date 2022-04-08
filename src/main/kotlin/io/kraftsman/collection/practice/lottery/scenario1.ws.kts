package io.kraftsman.collection.practice.lottery

(1..49)
    .shuffled()
    .take(6)
    .sorted()
    .joinToString(",")
    .let { println(it) }
