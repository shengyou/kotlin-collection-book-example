package io.kraftsman.collection.concept.combo

import io.kraftsman.collection.data.Student
import kotlin.random.Random

for (i in 1..10) {
    println(i)
}

for (char in 'a'..'z') {
    println(char)
}

for (i in 1.rangeTo(10)) {
    println(i)
}
for (char in 'a'.rangeTo('z')) {
    println(char)
}

for (i in 10 downTo 1 ) {
    println(i)
}

for (i in 1 until 10) {
    println(i)
}

for (i in 1..10 step 2) {
    println(i) // 印出 1 3 5 7 9
}

(1..100).map {
    Student(
        id = it,
        firstName = "User",
        lastName = "No.$it",
        email = "student$it@example.com",
        grade = Random.nextInt(1, 6)
    )
}

(1..100).associateWith {
    Student(
        id = it,
        firstName = "User",
        lastName = "No.$it",
        email = "student$it@example.com",
        grade = Random.nextInt(1, 6)
    )
}

(1..100).average()

(1 ..100 step 2).sum()

(1..100).filter { (it % 2) == 0 }

(1..100).partition { (it % 2) == 0 }

(1..10).toList()
(1..10).toMutableList()

(1..15).toSet()
(1..15).toMutableSet()

(1..5).toList().toIntArray().contentToString()
(1..10).toList().toTypedArray().contentToString()
