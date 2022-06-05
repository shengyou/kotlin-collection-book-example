package io.kraftsman.collection.practice.compute.generators

import io.github.serpro69.kfaker.faker

object EmailGenerator {
    private val faker = faker {  }

    fun generate(): String = faker.internet.email()
}
