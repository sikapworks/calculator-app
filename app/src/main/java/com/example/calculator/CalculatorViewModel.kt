package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

// a view model accepts user events and changes the state
// updates the ui when the state is changed and also saves the data when screen is rotated
class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set   // we can't change the state from outside but can access and read it

}