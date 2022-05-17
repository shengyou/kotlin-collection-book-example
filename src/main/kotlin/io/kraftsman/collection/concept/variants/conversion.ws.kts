package io.kraftsman.collection.concept.variants

val immutableNumbers = listOf(7, 5, 9, 1, 3)
val convertedList = immutableNumbers.toMutableList()
convertedList.sort()
println(convertedList)
