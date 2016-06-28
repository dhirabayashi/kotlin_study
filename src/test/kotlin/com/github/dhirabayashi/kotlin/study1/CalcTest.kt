package com.github.dhirabayashi.kotlin.study1

import org.junit.Assert.*
//import org.hamcrest.CoreMatchers.`is`
import org.assertj.core.api.Assertions.*
import org.junit.Test

/**
 * Created by Daiki on 2016/06/28.
 */
class CalcTest {

    private val sut = Calc()

    @Test
    fun add() {
//        assertThat(sut.add(1, 2), `is`(3))
        assertThat(sut.add(1, 2)).isEqualTo(3)
    }

    @Test
    fun subtract() {
        assertThat(sut.subtract(10, 4)).isEqualTo(6)
    }

    @Test
    fun multiply() {
        assertThat(sut.multiply(4, 5)).isEqualTo(20)
    }

    @Test
    fun divide() {
        assertThat(sut.divide(10, 5)).isEqualTo(2)
        assertThat(sut.divide(1, 0)).isNull()
    }

}