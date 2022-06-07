package io.kraftsman.collection.practice.statistics.generators

object CovidOptionGenerator {
    private val stub = listOf(
        false, false, false, false, false,
        false, false, false, false, true,
    )

    fun generate(): Boolean = stub.random()
}
