package com.example.bankingapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterEnd

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.ui.theme.RedColor

//@Composable
//fun ExpenseItem(Expense: ExpenseList) {
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(
//                painter = painterResource(id = Expense.image),
//                contentDescription = null,
//                modifier = Modifier.size(24.dp)
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Column {
//                Text(
//                    text = Expense.expenseName,
//                    fontSize = 22.sp,
//                    fontWeight = FontWeight.SemiBold
//                )
//            }
//        }
//
//        Text(
//            text = "100 $",
//            color = RedColor,
//            modifier = Modifier.align(CenterEnd),
//            fontSize = 22.sp,
//            fontWeight = FontWeight.SemiBold
//        )
//    }
//
//
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun ExpenseItemPreview() {
//
//}