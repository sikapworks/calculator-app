package com.example.calculator

import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.math.exp


fun EvaluateExpression(expression: String): String {
    return try {
        val result = ExpressionBuilder(expression).build().evaluate()
        if (result%1.0 == 0.0) {
            result.toInt().toString()
        }
        else {
            result.toString()
        }
//        val result = EvaluateExpression(expression)
//        result.toString()
    }
    catch (e: Exception) {
        "Error"
    }
}