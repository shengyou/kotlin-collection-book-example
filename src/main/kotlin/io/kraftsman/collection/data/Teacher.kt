package io.kraftsman.collection.data

data class Teacher(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val level: Int,
): Person(id, firstName, lastName)
