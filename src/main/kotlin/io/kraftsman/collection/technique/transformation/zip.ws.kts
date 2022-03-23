package io.kraftsman.collection.technique.transformation

/**
 * zip() - 把兩個 Collection 黏在一起
 */

// 建立範例資料
val colors = listOf("red", "brown", "gray")
val animals = listOf("fox", "bear", "wolf")
val onlyTwoAnimals = listOf("fox", "bear")

// 測試 APIs
colors.zip(animals)

colors zip animals

colors.zip(onlyTwoAnimals)
onlyTwoAnimals.zip(colors)

colors.zip(animals) { color, animal -> "The $animal is $color" }
colors.zip(animals).map { (color, animal) ->
    "The $animal is $color"
}
