package com.example.calculator


sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()  // list of numbers on the screen
    object Clear: CalculatorActions()  // to clear everything
    object Delete: CalculatorActions()  // to delete the last character
    object Decimal: CalculatorActions()  // to enter decimal numbers
    object Calculate: CalculatorActions()  // to calculate the expression
    data class Operation(val operation: CalculatorOperation): CalculatorActions()

}