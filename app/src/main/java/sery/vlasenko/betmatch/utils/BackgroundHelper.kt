package sery.vlasenko.betmatch.utils

import sery.vlasenko.betmatch.R
import kotlin.random.Random

object BackgroundHelper {
    private val backgroundIds =
        intArrayOf(R.drawable.background_1, R.drawable.background_2, R.drawable.background_3)

    fun getRandomBackgroundId(): Int {
        return backgroundIds[Random.nextInt(0, 2)]
    }
}