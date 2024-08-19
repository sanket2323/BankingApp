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
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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
        mutableStateOf("0")
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
            centerTopBar() //this can be modified to row

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(backgroundColorWhite),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(

                    value = amount,
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_rupee_24),
                            contentDescription = "null",
                            modifier = Modifier.size(40.dp)
                        )
                    },

                    onValueChange = {
                        amount = it
                    },
                    label = {
                        Text(text = "Amount", fontSize = 16.sp, fontWeight = FontWeight.W500)
                    },
                    textStyle = TextStyle.Default.copy(fontSize = 45.sp),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(130.dp),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Phone
                    ),
                    colors = TextFieldColors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        disabledTextColor = Color.Black,
                        errorTextColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        errorContainerColor = Color.Transparent,
                        cursorColor = Color.Transparent,
                        errorCursorColor = Color.Transparent,
                        textSelectionColors = TextSelectionColors(
                            Color.Transparent, Color.Transparent
                        ),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedLeadingIconColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        disabledLeadingIconColor = Color.Black,
                        errorLeadingIconColor = Color.Black,
                        focusedTrailingIconColor = Color.Black,
                        unfocusedTrailingIconColor = Color.Black,
                        disabledTrailingIconColor = Color.Black,
                        errorTrailingIconColor = Color.Black,
                        focusedLabelColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        disabledLabelColor = Color.Black,
                        errorLabelColor = Color.Transparent,
                        focusedPlaceholderColor = Color.Transparent,
                        unfocusedPlaceholderColor = Color.Transparent,
                        disabledPlaceholderColor = Color.Transparent,
                        errorPlaceholderColor = Color.Transparent,
                        focusedSupportingTextColor = Color.Transparent,
                        unfocusedSupportingTextColor = Color.Transparent,
                        disabledSupportingTextColor = Color.Transparent,
                        errorSupportingTextColor = Color.Transparent,
                        focusedPrefixColor = Color.Transparent,
                        unfocusedPrefixColor = Color.Transparent,
                        disabledPrefixColor = Color.Transparent,
                        errorPrefixColor = Color.Transparent,
                        unfocusedSuffixColor = Color.Transparent,
                        focusedSuffixColor = Color.Transparent,
                        disabledSuffixColor = Color.Transparent,
                        errorSuffixColor = Color.Transparent,
                    ),


                    )

                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Balance : 22222289$", fontSize = 14.sp, fontWeight = FontWeight.W400)
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(text = "Transfer")
                }


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


@Composable
fun CustomTextField() {
    TextFieldColors(
        focusedTextColor = Color.Black,
        unfocusedTextColor = Color.Black,
        disabledTextColor = Color.Black,
        errorTextColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,
        disabledContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        cursorColor = Color.Transparent,
        errorCursorColor = Color.Transparent,
        textSelectionColors = TextSelectionColors(
            Color.Transparent, Color.Transparent
        ),
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        focusedLeadingIconColor = Color.Transparent,
        unfocusedLeadingIconColor = Color.Transparent,
        disabledLeadingIconColor = Color.Transparent,
        errorLeadingIconColor = Color.Transparent,
        focusedTrailingIconColor = Color.Transparent,
        unfocusedTrailingIconColor = Color.Transparent,
        disabledTrailingIconColor = Color.Transparent,
        errorTrailingIconColor = Color.Transparent,
        focusedLabelColor = Color.Transparent,
        unfocusedLabelColor = Color.Transparent,
        disabledLabelColor = Color.Transparent,
        errorLabelColor = Color.Transparent,
        focusedPlaceholderColor = Color.Transparent,
        unfocusedPlaceholderColor = Color.Transparent,
        disabledPlaceholderColor = Color.Transparent,
        errorPlaceholderColor = Color.Transparent,
        focusedSupportingTextColor = Color.Transparent,
        unfocusedSupportingTextColor = Color.Transparent,
        disabledSupportingTextColor = Color.Transparent,
        errorSupportingTextColor = Color.Transparent,
        focusedPrefixColor = Color.Transparent,
        unfocusedPrefixColor = Color.Transparent,
        disabledPrefixColor = Color.Transparent,
        errorPrefixColor = Color.Transparent,
        unfocusedSuffixColor = Color.Transparent,
        focusedSuffixColor = Color.Transparent,
        disabledSuffixColor = Color.Transparent,
        errorSuffixColor = Color.Transparent,
    )
}