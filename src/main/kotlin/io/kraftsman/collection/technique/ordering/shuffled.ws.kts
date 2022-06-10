package io.kraftsman.collection.technique.ordering

import io.kraftsman.collection.data.LotteryDrawer

/**
 * shuffled() - 隨機排序
 */

// 建立範例資料
val raffle = listOf(
    LotteryDrawer("John"),
    LotteryDrawer("Tom"),
    LotteryDrawer("Mary"),
    LotteryDrawer("Sean"),
    LotteryDrawer("Paul"),
)

// 示範使用方式
raffle.shuffled()

raffle.shuffled()
    .first()
    .name

raffle.shuffled()
    .take(3)
