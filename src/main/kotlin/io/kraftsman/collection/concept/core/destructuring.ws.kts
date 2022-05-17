package io.kraftsman.collection.concept.core

class Person(val firstName: String, val lastName: String) {

    operator fun component1(): String {
        return "$firstName return by component method"
    }

    operator fun component2(): String {
        return "$lastName return by component method"
    }
}

val (firstName, lastName) = Person("Shengyou", "Fan")

println(firstName)
println(lastName)

data class PersonDataClass(val firstName: String, val lastName: String)

val (firstNameFromDataClass, lastNameFromDataClass) = PersonDataClass("Shengyou", "Fan")

println(firstNameFromDataClass)
println(lastNameFromDataClass)
