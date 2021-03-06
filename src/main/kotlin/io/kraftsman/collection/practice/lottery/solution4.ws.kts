package io.kraftsman.collection.practice.lottery

(1..49)
    .subtract(listOf(13, 5, 17, 44, 12, 31, 7, 9, 8, 29))
    .shuffled()
    .windowed(4, 4, partialWindows = false)
    .shuffled()
    .take(3)
    .let { groups ->
        val mustHave = listOf(12, 31, 7, 9, 8, 29)
            .shuffled()
            .chunked(2)
        groups.forEachIndexed { index, group ->
            group.union(mustHave[index])
                .sorted()
                .joinToString()
                .let(::println)
        }
    }

val lotteryNumbersList = (1..49)
    .subtract(listOf(13, 5, 17, 44, 12, 31, 7, 9, 8, 29))
    .shuffled()
    .windowed(4, 4, partialWindows = false)
    .shuffled()
    .take(3)
    .let { groups ->
        val mustHave = listOf(12, 31, 7, 9, 8, 29)
            .shuffled()
            .chunked(2)
        groups.mapIndexed { index, group ->
            group.union(mustHave[index])
                .sorted()
        }
    }
