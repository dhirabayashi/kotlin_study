package com.github.dhirabayashi.kotlin.study1

import org.junit.Test
import org.assertj.core.api.Assertions.*
import java.util.*

/**
 * Created by daiki on 2016/06/29.
 */
class WhenSampleTest {

    private val sut = WhenSample()

    @Test
    fun testWhen1() {
        assertThat(sut.useWhen(1)).isEqualTo("One")
    }

    @Test
    fun testWhenHello() {
        assertThat(sut.useWhen("Hello")).isEqualTo("Hello")
    }

    @Test
    fun testWhenLong() {
        assertThat(sut.useWhen(1L)).isEqualTo("Long")
    }

    @Test
    fun testWhenNotString() {
        assertThat(sut.useWhen(Date())).isEqualTo("Not a String")
    }

    @Test
    fun testWhenUnknown() {
        assertThat(sut.useWhen("abcde")).isEqualTo("Unknown")
    }
}
