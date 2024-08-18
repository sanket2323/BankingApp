package com.example.bankingapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun TransferScreen(paddingValue:Dp){
    Column(
        modifier = Modifier.fillMaxSize().padding(top = paddingValue)
    ) {
        Text(text = "This is transfer screen")
    }

}