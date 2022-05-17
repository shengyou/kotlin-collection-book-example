package io.kraftsman.collection.concept.core

open class Fruit
class Apple: Fruit()
class Pear: Fruit()

class Bowl<T> {
    fun add(element: T){
        // ...
    }

    fun get() {
        // ...
    }
}

fun add(bowl: Bowl<Fruit>, fruit: Fruit) = bowl.add(fruit)

val bowl = Bowl<Apple>()
add(bowl, Pear()) // 無法通過編譯
val apple = bowl.get()
