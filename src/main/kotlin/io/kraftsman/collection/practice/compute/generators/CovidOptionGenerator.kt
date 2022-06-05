package io.kraftsman.collection.practice.compute.generators

object CovidOptionGenerator {
    private val stub = listOf(
        false, false, false, false, false,
        false, false, false, false, true,
    )

    fun generate(): Boolean = stub.random()
}
