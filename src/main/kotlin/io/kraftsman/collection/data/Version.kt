package io.kraftsman.collection.data

data class Version(val major: Int, val minor: Int, val patch: Int) : Comparable<Version> {
    override fun compareTo(other: Version): Int = when {
        this.major != other.major -> this.major compareTo other.major
        this.minor != other.minor -> this.minor compareTo other.minor
        this.patch != other.patch -> this.patch compareTo other.patch
        else -> 0
    }
}
