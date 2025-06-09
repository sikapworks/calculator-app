package com.example.calculator

import kotlin.math.exp

fun ToggleSign(expression: String): String {
    return if (expression.isEmpty()) {
        "(-"
    }
    else if (expression.startsWith("(-") && expression.endsWith(")")) {
        expression.substring(2, expression.length - 1)
    }
    else {
        "(-$expression)"
    }

}


