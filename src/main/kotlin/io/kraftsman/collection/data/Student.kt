package io.kraftsman.collection.data

data class Student(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val email: String,
    val grade: Int,
): Person(id, firstName, lastName)
