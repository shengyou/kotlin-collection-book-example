package io.kraftsman.collection.concept.variants

import io.kraftsman.collection.data.Employee
import io.kraftsman.collection.data.OrderItem
import io.kraftsman.collection.data.Product

val cart = listOf(
    OrderItem(1, Product("FT-0342", "Apple", 80.0), 2),
    OrderItem(2, Product("FT-0851", "Banana", 10.0), 8),
    OrderItem(3, Product("FT-0952", "Orange", 60.0), 3),
)

cart.maxOfOrNull { it.amount }

val employees = listOf(
    Employee(1, "Tom", "Backend", listOf("DB", "API")),
    Employee(2, "John", "IT", listOf("Network", "Hardware")),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design", listOf("Graphic")),
)

employees.firstNotNullOf { it.skills }
