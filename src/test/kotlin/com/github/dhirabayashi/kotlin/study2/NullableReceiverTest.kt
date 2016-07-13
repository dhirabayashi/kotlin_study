package com.github.dhirabayashi.kotlin.study2

import org.junit.Test
import org.assertj.core.api.Assertions.*
import java.util.*

class NullableReceiverTest {
    fun Any?.toString(): String {
        if(this == null) return "null!!"

        return toString()
    }

    @Test
    fun testNullable() {
        val s: String? = null
        assertThat(s.toString()).isEqualTo("null!!")

        val i: Int? = null
        assertThat(i.toString()).isEqualTo("null!!")

        val d: Date? = null
        assertThat(d.toString()).isEqualTo("null!!")
    }
}