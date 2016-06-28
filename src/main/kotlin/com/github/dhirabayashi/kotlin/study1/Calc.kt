package com.github.dhirabayashi.kotlin.study1

/**
 * Created by Daiki on 2016/06/28.
 */
class Calc {
    fun add(x : Int, y : Int) : Int {
        return x + y
    }

    fun subtract(x : Int, y : Int) : Int {
        return x - y
    }

    fun multiply(x : Int, y : Int) : Int {
        return x * y
    }

    fun divide(x : Int, y : Int) : Int? {
        return  if(y == 0) null else x / y
    }
}