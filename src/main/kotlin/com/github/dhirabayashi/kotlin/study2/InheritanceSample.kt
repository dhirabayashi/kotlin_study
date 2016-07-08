package com.github.dhirabayashi.kotlin.study2

open class Base {
    open fun v(): String {
        return "super class"
    }

    fun f(): String {
        return "function"
    }
}

class Derived : Base() {
    override fun v(): String {
        return "sub class"
    }
}