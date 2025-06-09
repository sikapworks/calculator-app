package com.example.calculator

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    backgroundColor: Color = Color.DarkGray,
    contentColor: Color = Color.White,
    isIcon: Boolean = false
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = backgroundColor
        ),
        contentPadding = PaddingValues(2.dp),
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(),

    ) {
        Text(
            text = symbol,
            fontSize = 24.sp,
            color = contentColor
//            color = MaterialTheme.colorScheme.background
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorButtonPreview() {
    CalculatorButton(
        "+",
        modifier = Modifier,
        onClick = {},
        contentColor = Color.LightGray,
        isIcon = true
    )
}