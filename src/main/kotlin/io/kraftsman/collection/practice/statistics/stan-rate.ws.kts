package io.kraftsman.collection.practice.statistics

import java.io.File

val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
        "src/main/kotlin/io/kraftsman/collection/practice/statistics/dataset"

val registrantsPerEvents = File(basePath).listFiles { file -> file.extension == "csv" }
    ?.map { file ->
        file.readLines().drop(1).map { it.split(",")[0] }
    }

val stanRate = registrantsPerEvents?.flatten()
    ?.distinct()
    ?.associate { it to 0 }
    ?.toMutableMap()

stanRate?.forEach { (registrant, _) ->
    registrantsPerEvents?.forEach {
        if (registrant in it) {
            stanRate[registrant] = stanRate.getOrDefault(registrant, 0) + 1
        }
    }
}

stanRate?.toList()
    ?.sortedByDescending { it.second }
    ?.take(3)
    ?.toMap()
    .let(::println)