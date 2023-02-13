package com.demo.cryptoapp.util

class Utils {
    fun getRandom(min: Int, max: Int): Double {
        require(min < max) { "Invalid range [$min, $max]" }
        return min + kotlin.random.Random.nextDouble() * (max - min)
    }
}