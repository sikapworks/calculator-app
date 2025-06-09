package com.example.calculator

import kotlin.math.exp


fun InsertParenthesis(expression: String): String {
    val open = expression.count { it == '('}
    val close = expression.count { it == ')'}
    return if (open > close) {
        "$expression)"
    }
    else {
        "$expression("
    }
}
