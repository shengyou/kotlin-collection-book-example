package io.kraftsman.collection.concept.variants

val mutableNumbers = mutableListOf(10, 2, 6, 4, 8)
val immutableNumbers = listOf(7, 5, 9, 1, 3)

println("mutableNumbers before sort(): $mutableNumbers")
val sortMutableNumbers = mutableNumbers.sort()
println("mutableNumbers after sort(): $mutableNumbers")
println("sortMutableNumbers: $sortMutableNumbers")

println("immutableNumbers before sorted(): $immutableNumbers")
val sortedImmutableNumbers = immutableNumbers.sorted()
println("immutableNumbers after sorted(): $immutableNumbers")
println("sortedImmutableNumbers: $sortedImmutableNumbers")
