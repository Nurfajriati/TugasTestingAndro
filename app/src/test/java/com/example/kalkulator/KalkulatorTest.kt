package com.example.kalkulator

import org.junit.Test

class KalkulatorTest {

//TTD -> test driven development
    /**
     * the input are not empty
     * one of the input are 0
     * **/

    val calculate = Kalkulator()

    @Test
    fun addtest() {
        val result = calculate.minus(10,2)
    }

    @Test
    fun addtest2(){
        val result = calculate.minus(10,0)

    }
}