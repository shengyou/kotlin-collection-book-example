package io.kraftsman.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Meta(
    val currentPage: Int,
    val perPage: Int,
    val lastPage: Int,
    val from: Int,
    val to: Int,
    val total: Int,
)
