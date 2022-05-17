package io.kraftsman.collection.concept.core

val numbers = listOf(1, 2, 3, 4, 5)
for (item in numbers) {
    println(item)
}

val numbersIterator = numbers.iterator()
while (numbersIterator.hasNext()) {
    println(numbersIterator.next())
}

val listIterator = numbers.listIterator()
while (listIterator.hasNext()) println(listIterator.next())
while (listIterator.hasPrevious()) println(listIterator.previous())
