package com.github.dhirabayashi.kotlin.study1

class WhenSample {
    fun useWhen(obj: Any) = when(obj) {
        1 -> "One"
        "Hello" -> "Hello"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }
}
