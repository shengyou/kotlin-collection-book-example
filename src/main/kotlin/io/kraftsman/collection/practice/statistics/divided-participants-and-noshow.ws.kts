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

recordSet.partition {
    it.name in participants
}.let {
    println("報到人數：${it.first.count()}")
    println("未出席人數：${it.second.count()}")
}
