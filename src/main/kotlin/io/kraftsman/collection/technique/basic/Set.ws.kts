package io.kraftsman.collection.technique.basic

val setOfNames = setOf("Jim", "Sue", "Sue", "Nick", "Nick") // 只存放不重複的 Jim, Sue, Nick
val mutableSetOfNames = mutableSetOf("Jim", "Sue", "Sue", "Nick", "Nick") // 只存放不重複的 Jim, Sue, Nick

val setByBuilder = buildSet {
    add(1)
    addAll(listOf(2, 3))
    addAll(listOf(3, 4, 5))
    add(4)
}

val notNullSet = setOfNotNull(1, null, 2, null, 3, null)

val mixedSet = setOf(1, 2, "Hello", null)

val emptySet = setOf<Int>()
val emptyMutableSet = mutableSetOf<Int>()
val emptySetByEmptySet = emptySet<Int>()

setOfNames.elementAt(0)

for (name in setOfNames) {
    println(name)
}

setOfNames.forEach { println(it) }

setOfNames.size
setOfNames.count()

setOfNames.first()
setOfNames.last()
