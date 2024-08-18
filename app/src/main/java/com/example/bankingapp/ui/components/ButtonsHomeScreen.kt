package com.example.bankingapp.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingapp.R

@Composable
fun ButtonsHomeScreen(name: String, image: Int) {
    Button(
        onClick = {  },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 5.dp
        ),

    ) {
        Icon(
            painter = painterResource(id = image),
            contentDescription = "Add Icon",
            modifier = Modifier.padding(end = 5.dp).size(16.dp)
        )
        Text(text = name)
    }
}


