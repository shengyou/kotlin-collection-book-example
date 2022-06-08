package io.kraftsman.collection.practice.statistics

import io.kraftsman.collection.practice.statistics.models.Registrant
import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
        "src/main/kotlin/io/kraftsman/collection/practice/statistics/dataset"
val filName = "kotlin-meetup-1.csv"
val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy H:m:s")

val recordSet = File("$basePath/$filName").readLines()
    .drop(1)
    .mapIndexed { index, line ->
        val columns = line.split(",")
        Registrant(
            id = (index + 1),
            name = columns[0].trim(),
            email = columns[1].trim(),
            mobile = columns[2].trim(),
            city = columns[3].trim(),
            affiliation = columns[4].trim(),
            position = columns[5].trim(),
            hasSymptom = (columns[6].trim() == "是"),
            hasTravelRecords = (columns[7].trim() == "是"),
            needQuarantine = (columns[8].trim() == "是"),
            registrationAt = LocalDateTime.parse(columns[9].trim(), formatter),
        )
    }

recordSet.size
recordSet.count()
