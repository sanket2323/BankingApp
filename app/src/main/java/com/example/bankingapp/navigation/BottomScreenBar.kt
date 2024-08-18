package com.example.bankingapp.navigation

import com.example.bankingapp.R

sealed class BottomScreenBar(
    val route: String,
    val icon: Int,
    val label:String
) {
    object Home : BottomScreenBar("home", R.drawable.ic_home,"Home")
    object Cards : BottomScreenBar("transfer", R.drawable.ic_cards,"Cards")
    object History : BottomScreenBar("history", R.drawable.ic_history,"History")
    object Wallet : BottomScreenBar("wallet", R.drawable.ic_wallet,"Wallet")
    object Info: BottomScreenBar(route = "info",R.drawable.ic_info_icons,"Info")
}