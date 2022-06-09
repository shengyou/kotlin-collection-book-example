package io.kraftsman.extensions

fun Double.format(digits: Int): Double =
    "%.${digits}f".format(this).toDouble()
