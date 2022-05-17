package io.kraftsman.collection.concept.variants

import io.kraftsman.collection.data.Teacher

val schoolStuffs = mutableListOf(
    Teacher(1, "Tommy", "Wong", 3)
)

val newTeachers = listOf(1, 2, 3, 4, 5).map {
    Teacher(it, "Teacher",  "#$it", it)
}

schoolStuffs.addAll(newTeachers)

listOf(1, 2, 3, 4, 5).mapTo(schoolStuffs) {
    Teacher(it, "Teacher",  "#$it", it)
}
