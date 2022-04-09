package io.kraftsman.collection.concept

val numbers = arrayOf<Int>(1, 2, 3, 4, 5)

val arrayOfFiveA = Array(5) { 'a' }

val emptyArrayUsingArrayOf = arrayOf<Int>()
val emptyArrayUsingEmptyArray = emptyArray<Int>()
val emptyArrayOfNull = arrayOfNulls<Int?>(5)

val mixedArray = arrayOf(1, 2, "Hello", null)

val intArray = intArrayOf(1, 2, 3, 4, 5)
val booleanArray = booleanArrayOf(true, false, false, true, true)
val floatArray = floatArrayOf(1.1F, 2.2F, 3.3F, 4.4F, 5.5F)
val doubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5)

numbers[0]
numbers[1]

println(numbers)

for (element in numbers) {
    println(element)
}

numbers.size
numbers.count()

numbers.first()
numbers.last()

numbers.sum()
numbers.average()

numbers.forEach { println(it) }
