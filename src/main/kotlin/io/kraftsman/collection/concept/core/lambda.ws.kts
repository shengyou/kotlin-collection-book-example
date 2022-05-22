package io.kraftsman.collection.concept.core

{
    val name = "Shengyou"
    println("Hi, $name")
}()

val sayHi: () -> Unit = {
    val name = "Shengyou"
    println("Hi, $name")
}

sayHi()

fun hello(name: String, greeting: (String) -> String): String {
    return greeting(name)
}

val name = "Shengyou"
val greeting = { name: String -> "Hi, $name" }
hello(name, greeting)

hello("Shengyou", { name -> "Hi, $name" })

hello("Shengyou") { name -> "Hi, $name" }

hello("Shengyou") { "Hi, $it" }

hello("Shengyou") { person ->
    "Hi, $person"
}

hello("Shengyou") { name ->
    name.map {
        it.toString()
    }.fold("") { acc, s ->
        "$s, $acc"
    }
}
