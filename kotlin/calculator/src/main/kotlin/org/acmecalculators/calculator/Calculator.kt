package org.acmecalculators.calculator

class Calculator {
    
    companion object {
        @JvmStatic
        fun load() {
            System.loadLibrary("arithmetic")
        }
    }

    public fun add(a: Int, b: Int): Unit {
        val result: Int = a + b
        println("You added $a and $b; your result is $result")
    }

    public external fun nativeAdd(a: Int, b: Int): Int
    
    public external fun nativeHello(to: String): String
}
