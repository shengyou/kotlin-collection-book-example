package io.kraftsman.collection.practice.statistics

import java.io.File
import java.math.RoundingMode

val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
        "src/main/kotlin/io/kraftsman/collection/practice/statistics/dataset"

File(basePath).listFiles { file -> file.extension == "csv" }
    ?.mapIndexed { index, file ->
        val registrants = file.readLines()
        val participants = File("$basePath/meetup-checkin-${index + 1}.txt").readLines()
        (participants.size.toDouble() / registrants.size.toDouble() * 100)
            .toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    }?.forEachIndexed { index, participantRate ->
        println("Kotlin Meetup #${index+1} 報到率: $participantRate %")
    }
