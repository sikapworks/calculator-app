package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.evaluateY
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun CalculatorScreen() {
    var expression by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current
    var result by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier
//            .padding(horizontal = 6.dp)
            .fillMaxSize()
            .background(
                Color.Black
            ),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = Modifier
                .weight(1f) // top display area get 1/3rd of the screen
                .fillMaxWidth()
//                .fillMaxHeight(0.33f)
                .padding(16.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Column() {
                Text(
                    text = expression,
                    fontSize = 36.sp,
                    color = Color.LightGray
                )
                Text(
                    text = result,
                    fontSize = 48.sp,
                    color = Color.White
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 8.dp, top = 8.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {
            CalculatorButton(
                "⌫",
                onClick = {
                    if (expression.isNotEmpty()) {
                        expression = expression.dropLast(1)
                    }
                },
                backgroundColor = Color.Transparent,
                contentColor = Color.LightGray,
                isIcon = true
            )
        }

//    }
//        Spacer(Modifier.height(100.dp))

        val buttons = listOf(
            "C",
            "()",
            "%",
            "/",
            "7",
            "8",
            "9",
            "*",
            "4",
            "5",
            "6",
            "-",
            "1",
            "2",
            "3",
            "+",
            "+/-",
            "0",
            ".",
            "=",
//            "⌫",
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .fillMaxWidth()
//            .fillMaxHeight(0.67f)
                .weight(2f)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(buttons) { symbol ->
                CalculatorButton(
                    symbol = symbol,
                    modifier = Modifier
                        .aspectRatio(1f) //perfect circle
                        .fillMaxWidth(), //so that it stretches
                    onClick = {
                        expression = handleButtonClick(
                            symbol,
                            expression,
                            context
                        ) { evaluatedResult ->
                            result = evaluatedResult
                        }
                    },
                    backgroundColor = when (symbol) {
                        "C", "=" -> Color.Unspecified
                        else -> Color.DarkGray
                    },
                    contentColor = Color.LightGray,
                )
            }
        }
    }
}

