package io.kraftsman.collection.practice.compute.generators

object MobilePhoneGenerator {

    fun generate(): String {
        val numbers = (1..8).map {
            (0..9).random()
        }

        return "09${numbers.joinToString("")}"
    }
}
