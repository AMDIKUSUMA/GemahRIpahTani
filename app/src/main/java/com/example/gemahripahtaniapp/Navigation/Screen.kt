package com.example.gemahripahtaniapp.Navigation

sealed class Screen (val route: String){


    data object Home : Screen("Home")
    data object Komunitas: Screen("Komunitas")
    data object Ecommerce: Screen("Ecommerce")
    data object keranjang: Screen("Keranjang")
    data object Profile: Screen("Profile")


}