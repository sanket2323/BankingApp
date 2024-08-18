package com.example.bankingapp.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bankingapp.R

@Composable
fun BalanceInOut(name:String, dotImage:Int,dotColor:Color){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = name)
        Icon(
            painter = painterResource(id = dotImage),
            contentDescription = name,
            modifier = Modifier.size(20.dp),
            tint = dotColor
        )
    }
}