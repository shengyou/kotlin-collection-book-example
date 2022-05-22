package io.kraftsman.collection.concept.combo

import kotlin.random.Random

val multiLineLogs = """
    2022-01-04 04:22:24.580 INFO 83900
    2022-02-07 20:36:10.581 WARN 57873
    2022-02-10 03:36:26.629 INFO 20652
    2022-03-11 09:56:30.629 WARN 83593
    2022-03-12 06:03:09.363 WARN 79165
    2022-06-15 21:04:05.373 INFO 14424
    2022-06-18 15:02:01.420 INFO 94741
    2022-10-20 08:32:58.750 ERROR 91389
    2022-10-21 11:10:41.792 ERROR 38602
    2022-11-22 13:05:13.817 WARN 86177
""".trimIndent()

multiLineLogs.lines().forEachIndexed { index, log ->
    println("$index => $log")
}

val singleLineLog = "2022-02-07 20:36:10.581 WARN 57873"

singleLineLog.split(" ").forEach {
    println(it)
}

singleLineLog.split(" ").forEachIndexed { index, piece ->
    if (index == 2 && piece == "WARN") {
        println("Check the log!")
    }
}

val chunks = singleLineLog.split(" ", limit = 3)
println("Date: ${chunks[0]}")
println("Time: ${chunks[1]}")

val slogan = "Have a nice Kotlin"

println(slogan[12])

slogan.forEach {
    println(it)
}

slogan.filter { it.isUpperCase() }
