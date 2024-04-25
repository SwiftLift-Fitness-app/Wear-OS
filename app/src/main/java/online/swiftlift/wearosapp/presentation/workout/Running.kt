package online.swiftlift.wearosapp.presentation.workout

import kotlin.math.round

data class Running(
    val startTime: String,
    val endingTime: String,
    val distance: Double,
    val duration: Time
) {
    fun calculateSpeed() =
        round(distance / (duration.hours + ((duration.minutes / 3) * 5) + ((duration.seconds / 3) * 5)))
}