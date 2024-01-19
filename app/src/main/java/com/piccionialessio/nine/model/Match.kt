package com.piccionialessio.nine.model

import kotlin.math.abs

class Match {
    //di ogni tentativo memorizziamo la permutazione da indovinare, i 2 tentativi e il vettore delle distanze
    private var permutation = ArrayList<Int>(9)
    private var firstTry = ArrayList<Int>(9)
    private var secondTry = ArrayList<Int>(9)
    private var distance = ArrayList<Int>(9)

    init {
        var rnd: Int
        for (i in permutation.indices) {
            do {
                rnd = (1..9).random()
            } while (rnd in permutation)
            permutation[i] = rnd
        }
    }

    fun getPermutation(): ArrayList<Int>{
        return permutation
    }

    fun setFirst(ftry: ArrayList<Int>) {
        firstTry = ftry
        computeDistance()
    }

    fun computeDistance() {
        for (i in distance.indices) {
            distance[i] = abs(i - permutation.find { it == firstTry[i] }!!)
        }
    }

}