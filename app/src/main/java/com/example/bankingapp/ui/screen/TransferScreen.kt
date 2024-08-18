package com.example.bankingapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.R
import com.example.bankingapp.ui.theme.backgroundColorWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransferScreen(paddingValue: Dp) {

    var amount by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = paddingValue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColorWhite),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            centerTopBar()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(backgroundColorWhite),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = amount.toString(),
                    onValueChange = {
                        amount = it.toInt()
                    },
                    label = {
                        Text(text = "Amount", fontSize = 10.sp,)
                    },
                    modifier = Modifier.width(100.dp),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Phone
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Transfer")
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Balance : 22222289$", fontSize = 12.sp)

            }
        }

    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun centerTopBar() {
    CenterAlignedTopAppBar(title = {
        Text(
            text = "Transfer", fontWeight = FontWeight.W500
        )
    }, navigationIcon = {
        Icon(
            painter = painterResource(id = R.drawable.icons8_back_50),
            contentDescription = "Close",
            modifier = Modifier
                .padding(8.dp)
                .size(25.dp)
        )
    },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = backgroundColorWhite
        )
    )

}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TransferScreenPreview() {
    TransferScreen(paddingValue = 0.dp)
}