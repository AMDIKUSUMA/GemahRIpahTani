package com.example.gemahripahtaniapp.Navigation

import com.example.gemahripahtaniapp.R

data class BottomNavItem(
    val title: String,
    val icon: Int,
    val route: String
)

var bottomNavItem = listOf(
    BottomNavItem(
        title = "Home",
        icon = R.drawable.home,
        route = "home"
    ),
    BottomNavItem(
        title = "Komunitas",
        icon = R.drawable.menuhome,
        route = "komunitas"
    ),
    BottomNavItem(
        title = "Ecommerce",
        icon = R.drawable.shop,
        route = "Ecommerce"
    ),
    BottomNavItem(
        title = "Profile",
        icon = R.drawable.keranjang,
        route = "profile"
    ),
    BottomNavItem(
        title = "Profile",
        icon = R.drawable.usr,
        route = "profile"
    )

    )