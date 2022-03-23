package io.kraftsman.collection.data

data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val skills: List<String>? = null
)
