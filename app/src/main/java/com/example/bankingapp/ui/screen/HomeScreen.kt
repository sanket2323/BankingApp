package com.example.bankingapp.ui.screen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.R
import com.example.bankingapp.TransferMoneyActivity
import com.example.bankingapp.model.Statement
import com.example.bankingapp.ui.components.BalanceInOut
import com.example.bankingapp.ui.components.ButtonsHomeScreen
import com.example.bankingapp.ui.components.StatementItem
import com.example.bankingapp.ui.theme.GreenColor
import com.example.bankingapp.ui.theme.RedColor
import com.example.bankingapp.ui.theme.backgroundColorWhite
import com.example.bankingapp.util.ListStatement
import java.lang.ProcessBuilder.Redirect

@Composable
fun HomeScreen(paddingValue: Dp) {

    val context = LocalContext.current
    val scrollState = rememberScrollState()


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = paddingValue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColorWhite)
//                .verticalScroll(
//                    rememberScrollState()
//                )
        ) {
            Row(
                modifier = Modifier
                    .shadow(5.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp))
                    .background(Color.White)
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Welcome back,\nJohn! ",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 30.sp,
                    )
                    Text(
                        text = "April 20-2024", color = Color.Gray, fontSize = 14.sp
                    )
                }

                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account Circle",
                    modifier = Modifier.size(50.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "$8*******",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 40.sp,
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "USA Account Balance", color = Color.Gray, fontSize = 18.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    ButtonsHomeScreen("Add", R.drawable.ic_add_icon, modifier = Modifier)
                    ButtonsHomeScreen("Send", R.drawable.ic_up_right_icon, modifier = Modifier.clickable {
                        val intent = Intent(context,TransferMoneyActivity::class.java)
                        context.startActivity(intent)
                    })
                    ButtonsHomeScreen("Exchange", R.drawable.ic_exchange, modifier = Modifier)
                }
            }

            Row(
                modifier = Modifier
                    .shadow(5.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White)
                    .padding(16.dp)

            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Add Balance",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                fontSize = 22.sp
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null
                            )


                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(text = "LAST 3 MONTH")
                            Icon(
                                imageVector = Icons.Filled.ArrowDropDown,
                                contentDescription = "Drop Down"
                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Column {
                            BalanceInOut(name = "In", dotImage = R.drawable.green_dot_ic, GreenColor)
                            Text(text = "$100000",fontWeight = FontWeight.W500)
                        }
                        Spacer(modifier = Modifier.width(100.dp))
                        Column {
                            BalanceInOut(name = "Out", dotImage = R.drawable.red_dot_ic, RedColor)
                            Text(text = "$8000", fontWeight = FontWeight.W500)
                        }

                    }


                    //Graph will be added here


                    //Here lazy coloum is there
                    //For Now dummy data is there(Component is  ready)
                    BalanceInOutList(ListStatement.list)

                }


            }

        }

    }


}

@Composable
fun BalanceInOutList(statementList:List<Statement>){
    
    LazyColumn {
       items(statementList) {
           StatementItem(statement = it)
       }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
//    HomeScreen()
}