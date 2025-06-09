package com.example.calculator

import android.widget.Toast

fun handleButtonClick(
    symbol: String,
    expression: String,
    context: android.content.Context,
    onResult: (String) -> Unit
): String {
    return when (symbol) {
        "C" -> {
            onResult("")
            ""
        }
        "=" -> {
            val evaluatedResult = EvaluateExpression(expression)
            onResult(evaluatedResult)   //callback to update result
            expression
        }
        "+/-" -> ToggleSign(expression)
        "()" -> InsertParenthesis(expression)
        "-" -> {
            if (expression.isEmpty()) {
                Toast.makeText(context, "Invalid format used.", Toast.LENGTH_SHORT).show()
                expression
            }
            else {
                "$expression-"
            }
        }
        else -> expression + symbol
    }

}

fun onResult(s: String) {

}
