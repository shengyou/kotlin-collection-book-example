package io.kraftsman.collection.practice.statistics

import java.io.File

val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
        "src/main/kotlin/io/kraftsman/collection/practice/statistics/dataset"

File(basePath).listFiles { file -> file.extension == "csv" }
    ?.map { file ->
        file.readLines().drop(1).map { it.split(",")[0] }
    }
    ?.flatten()
    ?.groupingBy { it }
    ?.eachCount()
    ?.toList()
    ?.sortedByDescending { it.second }
    ?.take(3)
    ?.toMap()
    .let(::println)
