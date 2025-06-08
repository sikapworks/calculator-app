package com.example.calculator

import android.text.style.LineBackgroundSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    backgroundColor: Color = Color.DarkGray
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = backgroundColor
        ),
        contentPadding = PaddingValues(2.dp),
        modifier = modifier,
//            .background(Color.Black)
//            .height(84.dp)
//            .width(84.dp),
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation()

    ) {
        Text(
            text = symbol,
            fontSize = 36.sp,
//            color = MaterialTheme.colorScheme.background
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorButtonPreview() {
    CalculatorButton("+", modifier = Modifier, onClick = {})
}