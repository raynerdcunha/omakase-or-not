package com.example.omakase_or_not

import kotlin.random.Random

class Restaurant {
    private var count = 0

    fun addCount() {
        count++
    }

    fun restaurantProb(prob : Int) : String {
        val random = Random.nextInt(1, 101)
        return if (random <= prob) {
            "Yep =)"
        } else {
            "Noo =("
        }
    }
}