package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CalculatorScreen() {
    Column(
        modifier = Modifier
//            .padding(horizontal = 6.dp)
            .fillMaxWidth()
            .background(
                Color.Black
            ),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = Modifier
                .weight(1f) // top display area get 1/3rd of the screen
                .fillMaxWidth()
        ) {

        }
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
            "="
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .weight(2f)
//                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(buttons) { symbol ->
                val isEqual = symbol == "="
                CalculatorButton(
                    symbol = symbol,
                    modifier = Modifier
                        .aspectRatio(1f) //perfect circle
                        .fillMaxWidth(), //so that it stretches
                    onClick = {},
                    backgroundColor = if (isEqual) Color.Red  else Color.DarkGray                )
            }
        }

//        Column(
//            verticalArrangement = Arrangement.spacedBy(10.dp),
//            horizontalAlignment = Alignment.End
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(10.dp),
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("C", modifier = Modifier) { }
//                CalculatorButton("()", modifier = Modifier) { }
//                CalculatorButton("%", modifier = Modifier) { }
//                CalculatorButton("/", modifier = Modifier) { }
//            }
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(10.dp),
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("7", modifier = Modifier) { }
//                CalculatorButton("8", modifier = Modifier) { }
//                CalculatorButton("9", modifier = Modifier) { }
//                CalculatorButton("x", modifier = Modifier) { }
//            }
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(10.dp),
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("4", modifier = Modifier) { }
//                CalculatorButton("5", modifier = Modifier) { }
//                CalculatorButton("6", modifier = Modifier) { }
//                CalculatorButton("-", modifier = Modifier) { }
//            }
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(10.dp),
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("1", modifier = Modifier) { }
//                CalculatorButton("2", modifier = Modifier) { }
//                CalculatorButton("3", modifier = Modifier) { }
//                CalculatorButton("+", modifier = Modifier) { }
//            }
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(10.dp),
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                CalculatorButton("+/-", modifier = Modifier) { }
//                CalculatorButton("0", modifier = Modifier) { }
//                CalculatorButton(".", modifier = Modifier) { }
//                CalculatorButton("=", modifier = Modifier.background(Color.Red)) { }
//            }
//        }

    }

}
