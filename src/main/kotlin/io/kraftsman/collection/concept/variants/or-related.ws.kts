package io.kraftsman.collection.concept.variants

val names = listOf("Jim", "Sue", "Sue", "Nick", "Nick")

names.getOrNull(10) ?: "Unknown Person"

names.getOrElse(10) {
    "Unknown Person (index $it is not exist)"
}

val mapOfFruit = mapOf(
    "Apple" to 7,
    "Banana" to 5,
    "Orange" to 7,
)

mapOfFruit.getOrDefault("Grape", 10)
