package io.kraftsman.collection.practice.statistics.models

import java.time.LocalDateTime

data class Registrant(
    val id: Int,
    val name: String,
    val email: String,
    val mobile: String,
    val city: String,
    val affiliation: String,
    val position: String,
    val hasSymptom: Boolean,
    val hasTravelRecords: Boolean,
    val needQuarantine: Boolean,
    val registrationAt: LocalDateTime,
)
