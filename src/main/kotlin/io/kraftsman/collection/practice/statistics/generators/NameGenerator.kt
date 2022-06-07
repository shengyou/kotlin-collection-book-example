package io.kraftsman.collection.practice.statistics.generators

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.fakerConfig

object NameGenerator {
    private val config = fakerConfig { locale = "zh-TW" }
    private val faker = Faker(config)

    fun generate(): String = faker.name.name()
}
