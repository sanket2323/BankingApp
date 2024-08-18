package com.example.bankingapp.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bankingapp.navigation.BottomScreenBar
import com.example.bankingapp.navigation.NavigationScreens
import kotlinx.coroutines.delay

@Composable
fun BottomNavigation(navController: NavHostController) {

    LaunchedEffect(Unit) {
        delay(3000)
    }

    Scaffold(bottomBar = {
        BottomAppBar {
            BottomBar(navController = navController)
        }
    }) {
        it.calculateBottomPadding()
        NavigationScreens(navController = navController, paddingValues = it.calculateTopPadding())
    }
}


@Composable
fun BottomBar(navController: NavHostController) {
    val navItems = listOf(
        BottomScreenBar.Home, BottomScreenBar.Cards, BottomScreenBar.Wallet, BottomScreenBar.History,BottomScreenBar.Info
    )

    var selectedItem by rememberSaveable { mutableStateOf(0) }

    NavigationBar {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                alwaysShowLabel = true,
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(it){
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = { Icon(painterResource(id = item.icon), contentDescription = "Icon", modifier = Modifier.size(32.dp)) },
                label = { Text(text = item.label)}
                )
        }
    }


}