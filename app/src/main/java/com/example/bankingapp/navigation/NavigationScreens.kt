package com.example.bankingapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.navigation.compose.NavHost

import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.bankingapp.ui.screen.CardScreen
import com.example.bankingapp.ui.screen.HistoryScreen
import com.example.bankingapp.ui.screen.HomeScreen
import com.example.bankingapp.ui.screen.InfoScreen
import com.example.bankingapp.ui.screen.WalletScreen

@Composable
fun NavigationScreens(navController: NavHostController, paddingValues: Dp) {
    NavHost(navController, startDestination = BottomScreenBar.Home.route) {
        composable(route = BottomScreenBar.Home.route){
            HomeScreen(paddingValue = paddingValues)
        }
        composable(route = BottomScreenBar.Cards.route){
            CardScreen()
        }
        composable(route = BottomScreenBar.Wallet.route){
            WalletScreen()
        }
        composable(route = BottomScreenBar.History.route){
            HistoryScreen()
        }
        composable(route = BottomScreenBar.Info.route){
            InfoScreen()
        }


    }
}