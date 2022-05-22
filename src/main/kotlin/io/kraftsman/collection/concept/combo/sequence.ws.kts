package io.kraftsman.collection.concept.combo

import java.time.LocalDate

val sentence = "The quick brown fox jumps over the lazy dog"
sentence.split(" ")
    .filter { it.length > 3 }
    .map { it.length }
    .take(4)

sentence.split(" ")
    .asSequence()
    .filter { it.length > 3 }
    .map { it.length }
    .take(4)
    .toList()

var counter = 5
generateSequence { counter-- }
    .take(10)
    .toList()

generateSequence(2) { it + 2 }
    .take(5)
    .toList()

generateSequence(
    LocalDate.of(2022, 5, 1)
) {
    it.plusDays(7)
}.take(5).toList()

generateSequence(1) {
    if (it < 8) {
        it + 2
    } else {
        null
    }
}.toList()
