package com.cryptoapp.util

import android.graphics.Bitmap
import android.graphics.Color

class Utils {
    fun getRandom(min: Int, max: Int): Double {
        require(min < max) { "Invalid range [$min, $max]" }
        return min + kotlin.random.Random.nextDouble() * (max - min)
    }
}