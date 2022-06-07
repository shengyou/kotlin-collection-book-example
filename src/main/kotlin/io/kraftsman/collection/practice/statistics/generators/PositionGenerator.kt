package io.kraftsman.collection.practice.statistics.generators

object PositionGenerator {
    private val stubs = listOf(
        "技術總監" to 1,
        "前端開發者" to 7,
        "後端開發者" to 7,
        "總工程師" to 1,
        "副工程師" to 2,
        "助理工程師" to 2,
        "Android 開發者" to 5,
        "Android App Developer" to 3,
        "Android Developer" to 2,
        "Android 工程師" to 2,
        "iOS 開發者" to 5,
        "實習生" to 3,
    )

    fun generate(): String =
        if (listOf(false, false, true).random()) {
            val seeds = mutableListOf<String>()
            stubs.forEach { stub ->
                repeat(stub.second) {
                    seeds.add(stub.first)
                }
            }
            seeds.random()
        } else {
            ""
        }
}
