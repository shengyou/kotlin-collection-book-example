package io.kraftsman.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val sku: String,
    val name: String,
    val description: String,
    val price: Int,
    val rating: Double,
    val thumbnail: String,
    val createdAt: String,
    val updatedAt: String,
)
