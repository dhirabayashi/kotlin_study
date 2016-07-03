package com.github.dhirabayashi.kotlin.study1

fun main(args: Array<String>) {
    val s = "We are click and hack the type-it brothers!"
    println(s.spaceToCamelCase())
}

fun String.capitalize(): String {
    if(this.length == 0) {
        return this
    }

    return this[0].toUpperCase() + this.substring(1)
}

fun String.spaceToCamelCase(): String {
    return this.split(" ").map { it.capitalize() }.joinToString("")
}
