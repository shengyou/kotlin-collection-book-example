package io.kraftsman.dtos

import kotlinx.serialization.Serializable

@Serializable
data class ProductApiResponse(
    val data: List<Product>,
    val meta: Meta,
)
