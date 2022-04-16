package io.kraftsman.collection.technique.basic

val listOfNumbers = listOf(1, 3, 5, 7, 9)
val mutableListOfNumbers = mutableListOf(2, 4, 6, 8, 10)

val listOfA = List(3) { it * 2 }
val mutableListOfA = MutableList(3) { 'b' }

val listByBuilder = buildList {
    add('a')
    addAll(listOf('b', 'c'))
    add('d')
}

val notNullList = listOfNotNull(1, null, 2, null, 3, null)

val emptyList = listOf<Int>()
val emptyMutableList = mutableListOf<Int>()
val emptyListByEmptyList = emptyList<Int>()

val mixedList = listOf(1, 2, "Hello", null)

listOfNumbers[0]
listOfNumbers.getOrNull(1)
listOfNumbers.getOrNull(10)

for (item in listOfNumbers) {
    println(item)
}

for ((index, item) in listOfNumbers.withIndex()) {
    println("$index: $item")
}

println(listOfNumbers)

listOfNumbers.size
listOfNumbers.count()

listOfNumbers.first()
listOfNumbers.last()

listOfNumbers.sum()
listOfNumbers.average()

listOfNumbers.forEach { println(it) }

listOfNumbers.forEachIndexed { index, item ->
    println("$index: $item")
}

val (one, two, three) = listOf(1, 2, 3)

mutableListOfNumbers[0] = 1
mutableListOfNumbers.add(12)

val duplicateElementInList = listOf(1, 1, 2, 2, 3, 3)
println(duplicateElementInList)
