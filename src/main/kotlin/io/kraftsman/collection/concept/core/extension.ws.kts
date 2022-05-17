package io.kraftsman.collection.concept.core

fun String.surprise(amount: Int = 3): String {
    return this + "!".repeat(amount)
}

"Wow".surprise()
