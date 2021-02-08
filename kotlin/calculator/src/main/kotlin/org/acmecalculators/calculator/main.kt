package org.acmecalculators.calculator

fun main() {
    
    val a: Int = 19
    val b: Int = 2

    // create calculator object and test local Kotlin add() method
    val calculator: Calculator = Calculator()
    calculator.add(a, b)
    
    // load native library
    Calculator.load()

    // use Rust native method addNative()
    val result: Int = calculator.nativeAdd(a, b)
    println("You added $a and $b using the native calculator; your result is $result")

    // use Rust native method helloNative()
    val message: String = calculator.nativeHello("Kotlin")
    println(message)
}
