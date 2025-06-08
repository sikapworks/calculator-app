package com.example.calculator

data class CalculatorState (
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null   // the question mark (?) means that operation can also hold a null value
)