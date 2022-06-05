package io.kraftsman.collection.practice.compute

import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import io.kraftsman.collection.practice.compute.models.Registrant
import java.io.File
import java.math.RoundingMode
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val basePath = "/Users/shengyou/IdeaProjects/kotlin-collection-book-example/" +
        "src/main/kotlin/io/kraftsman/collection/practice/compute/dataset"
val filName = "kotlin-meetup-1.csv"
val formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:m:s")

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

// 總報名人數
recordSet.size
recordSet.count()

// 可參加活動的人數
recordSet.filterNot {
    it.hasSymptom ||
            it.hasTravelRecords ||
            it.needQuarantine
}.count()

// 每日報名分佈
recordSet.groupingBy {
    it.registrationAt.toLocalDate()
}.eachCount()

// 參與者的縣市分佈
recordSet.filter { it.city.isNotEmpty() }
    .groupingBy { it.city }
    .eachCount()

// 職位清單
recordSet.filter { it.position.isNotEmpty() }
    .map { it.position }
    .distinct()
    .sorted()

// 職位分佈
recordSet.filter { it.position.isNotEmpty() }
    .map {
        it.copy(
            position = if (
                it.position
                    .lowercase()
                    .contains("android")
            ) {
                "Android 開發者"
            } else {
                it.position
            }
        )
    }
    .groupingBy { it.position }
    .eachCount()

// 報到率
val participants = listOf(
    "雲佳玲",
    "文雅君",
    "宓佳蓉",
    "單鈺婷",
    "江惠玲",
    "黃雅芳",
    "耿佳琪",
    "能惠如",
    "寇美慧",
    "文佳蓉",
    "闞詩婷",
    "韋建志",
    "闕雅琪",
    "糜俊賢",
    "平佩君",
    "宿淑慧",
    "暴淑玲",
    "富家豪",
    "充佳玲",
    "巫雅鈴",
    "阮怡君",
    "索雅萍",
    "儲惠如",
    "浦筱婷",
    "蒙佳慧",
    "扶佩玲",
    "宗馨儀",
    "石惠婷",
    "公佳慧",
    "仇鈺婷",
    "束佳慧",
    "夏侯建文",
    "那心怡",
    "程郁婷",
    "夔佳琪",
    "祖佩芬",
    "黃慧如",
    "井怡伶",
    "全智偉",
    "鄭惠婷",
    "盍嘉慧",
    "益怡君",
    "溥馨儀",
    "虞怡伶",
    "雲惠婷",
    "徐志銘",
    "諸美玲",
    "廉俊豪",
    "茅玉婷",
    "包家榮",
    "應玉婷",
    "卻靜儀",
    "熊佳慧",
    "慎佩玲",
)

val participantRate = recordSet.filter {
    it.name in participants
}.let {
    (it.size.toDouble() / recordSet.size.toDouble() * 100)
        .toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
}

println("報到率：$participantRate %")


val t = Terminal()
recordSet.groupingBy {
    it.registrationAt.toLocalDate().atStartOfDay()
}.eachCount()
    .let {
        t.println(table {
            header { row("Date", "Count") }
            body {
                it.forEach { (date, count) ->
                    row(
                        date.format(DateTimeFormatter.ISO_DATE),
                        count
                    )
                }
            }
        })
    }
