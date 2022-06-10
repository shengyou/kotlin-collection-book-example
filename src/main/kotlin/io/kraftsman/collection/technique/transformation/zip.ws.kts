package io.kraftsman.collection.technique.transformation

/**
 * zip() - 把兩個集合元素組成配對
 */

// 建立範例資料
val animals = listOf("fox", "bear", "wolf")
val onlyTwoAnimals = listOf("fox", "bear")
val colors = listOf("red", "brown", "gray")

// 示範使用方式
animals.zip(colors)

animals zip colors

onlyTwoAnimals.zip(colors)

animals.zip(colors) { animal, color ->
    "The $animal is $color"
}

animals.zip(colors)
    .map { (animal, color) ->
        "The $animal is $color"
    }
