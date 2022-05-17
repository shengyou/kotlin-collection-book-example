package io.kraftsman.collection.concept.variants

import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)

cart.maxWithOrNull(compareBy{ it.amount })

val fruits = listOf("Grape", "Muskmelon", "Kumquat", "Pear")

fruits.associateWith { it.length }
fruits.associateBy({ it }, { it.length })
