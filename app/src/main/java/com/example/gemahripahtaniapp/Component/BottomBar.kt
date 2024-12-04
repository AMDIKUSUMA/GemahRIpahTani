package com.example.gemahripahtaniapp.Component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Store
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.Navigation.NavigationItem
import com.example.gemahripahtaniapp.Navigation.Screen
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

@Composable
fun BottomBar(
    navController: NavController, // Corrected type
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = "Home",
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = "Komunitas",
                icon = Icons.Default.Store,
                screen = Screen.Komunitas
            ),
            NavigationItem(
                title = "E-Commerce",
                icon = Icons.Default.ShoppingCart,
                screen = Screen.Ecommerce
            ),
            NavigationItem(
                title = "Keranjang",
                icon = Icons.Default.ShoppingCart,
                screen = Screen.keranjang
            ),
            NavigationItem(
                title = "Profile",
                icon = Icons.Default.Person,
                screen = Screen.Profile
            )
        )

        navigationItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    BottomBar(navController = navController)
}
