package com.piccionialessio.nine.model

import kotlin.math.min

data class Match(
    val permutation: IntArray = IntArray(9),
    val firstTry: IntArray = IntArray(9),
    val secondTry: IntArray = IntArray(9),
    val distance: IntArray = IntArray(9)
    ) {
    //di ogni tentativo memorizziamo la permutazione da indovinare, i 2 tentativi e il vettore delle distanze

    init {
        var rnd: Int
        for (i in permutation.indices) {
            do {
                rnd = (1..9).random()
            } while (rnd in permutation)
            permutation[i] = rnd
        }
    }

    fun setFirst(ftry: IntArray) {
        ftry.copyInto(firstTry)
        computeDistance()
    }

    fun computeDistance() {
        var pos: Int
        for (i in distance.indices) {
            pos = permutation.find { it == firstTry[i] }!!
            distance[i] = min((i - pos) % 9, (pos - i) % 9)
        }
    }

}