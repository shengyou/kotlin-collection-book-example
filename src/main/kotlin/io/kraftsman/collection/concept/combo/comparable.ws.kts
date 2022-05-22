package io.kraftsman.collection.concept.combo

import io.kraftsman.collection.data.ComparableItem
import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product
import io.kraftsman.collection.data.Version

val orderItemCart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)

orderItemCart.sortedByDescending { it.amount }

val comparableItemCart = listOf(
    ComparableItem(1, Product("FT-0342", "Apple", 80.0), 2),
    ComparableItem(2, Product("FT-0851", "Banana", 10.0), 8),
    ComparableItem(3, Product("FT-0952", "Orange", 60.0), 3),
)

comparableItemCart.sortedDescending()

comparableItemCart.maxOrNull()
comparableItemCart.minOrNull()

val versions = listOf(
    Version(2, 1, 1),
    Version(1, 1, 1),
    Version(1, 0, 1),
    Version(1, 2, 0)
)

versions.sorted()

versions.sortedDescending()
