package io.kraftsman.collection.practice.statistics.generators

import io.kraftsman.collection.practice.statistics.models.Registrant
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.BufferedWriter
import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
            "src/main/kotlin/io/kraftsman/collection/practice/statistics/dataset"
    val fileName = "kotlin-meetup-1.csv"

    val amount = 61

    val startDate = LocalDateTime.of(2021, 3, 23, 19, 30, 0).minusWeeks(2)
    var targetDate = startDate
    var counter = 0
    val formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:m:s")

    val seeds = (1..amount).map {
        if (listOf(false, false, false, false, true).random()) {
            if (counter < 14) {
                counter++
                targetDate = startDate.plusDays(counter.toLong())
                    .withHour((1..23).random())
                    .withMinute((1..59).random())
                    .withSecond((1..59).random())
            }
        }

        targetDate = targetDate.withHour((1..23).random())
            .withMinute((1..59).random())
            .withSecond((1..59).random())

        Registrant(
            id = (it + 1),
            name = NameGenerator.generate(),
            email = EmailGenerator.generate(),
            mobile = MobilePhoneGenerator.generate(),
            city = CityGenerator.generate(),
            affiliation = AffiliationGenerator.generate(),
            position = PositionGenerator.generate(),
            hasSymptom = CovidOptionGenerator.generate(),
            hasTravelRecords = CovidOptionGenerator.generate(),
            needQuarantine = CovidOptionGenerator.generate(),
            registrationAt = targetDate,
        )
    }

    val writer = BufferedWriter(File("$basePath/$fileName").bufferedWriter());
    val format = CSVFormat.Builder.create().setHeader(
        "?????? (????????????????????????)",
        "Email",
        "??????",
        "????????????",
        "????????????",
        "??????",
        "?????? 14 ??????????????????????????????????????????????????????????????????????????????????????????",
        "?????? 14 ??????????????????????????????????????????",
        "???????????????????????????????????????????????????",
        "Timestamp",
    ).build()
    val csvPrinter = CSVPrinter(writer, format)

    seeds.sortedBy { it.registrationAt }.forEach {
        csvPrinter.printRecord(
            listOf(
                it.name,
                it.email,
                it.mobile,
                it.city,
                it.affiliation,
                it.position,
                if (it.hasSymptom) "???" else "???",
                if (it.hasTravelRecords) "???" else "???",
                if (it.needQuarantine) "???" else "???",
                it.registrationAt.format(formatter).replace("T", " ")
            )
        )
    }

    csvPrinter.flush()
    csvPrinter.close()
}
