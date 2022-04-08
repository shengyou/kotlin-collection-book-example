package io.kraftsman.collection.practice.lottery

(1..6).map {
    (1..49).random()
}.sorted()
    .joinToString(",")
    .let { println(it) }
