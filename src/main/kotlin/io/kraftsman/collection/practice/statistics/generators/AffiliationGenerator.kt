package io.kraftsman.collection.practice.statistics.generators

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.fakerConfig

object AffiliationGenerator {
    private val config = fakerConfig { locale = "zh-TW" }
    private val faker = Faker(config)

    private val stub = listOf("有限公司", "股份有限公司", "銀行", "人壽", "網", "電腦", "證券", "企業")

    fun generate(): String =
        if (listOf(false, false, false, false, true).random()) {
            val prefix = faker.name.name()
            val postfix = stub.random()
            prefix + postfix
        } else {
            ""
        }
}
