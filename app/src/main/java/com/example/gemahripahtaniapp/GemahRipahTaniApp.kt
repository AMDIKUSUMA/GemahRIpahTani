package com.example.gemahripahtaniapp
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import com.example.gemahripahtaniapp.Component.BottomBar
//import com.example.gemahripahtaniapp.Navigation.Screen
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun GemahRipahTaniApp(
//    modifier: Modifier = Modifier,
//    navController: NavHostController = rememberNavController() // Corrected instance type
//) {
//    val navBackStackEntry = navController.currentBackStackEntryAsState()
//    val currentRoute = navBackStackEntry.value?.destination?.route
//    val context = LocalContext.current
//
//
//    Scaffold(
//
//        topBar = {
//
//            Box(
//                modifier = Modifier
//                    .width(500.dp)
//                    .height(133.dp)
//                    .background(color = Color(0xFF109179))
//            )
//
//        },
//        bottomBar = {
//            BottomBar(navController = navController) // Pass actual navController instance
//        }
//    )
//    { contentPadding ->
//        NavHost(
//            navController = navController, // Pass actual navController instance
//            startDestination = Screen.Home.route,
//            modifier = modifier.padding(contentPadding)
//        ) {
//            composable(Screen.Home.route) {
//                Text(text = "Home Screen") // Replace with your actual Home screen content
//            }
//            composable(Screen.Komunitas.route) {
//                Text(text = "komunitas")
//            }
//            composable(Screen.Ecommerce.route) {
//                Text(text = "ecommerce")
//            }
//            composable(Screen.keranjang.route) {
//                Text(text = "keranjang")
//            }
//            composable(Screen.Profile.route) {
//                Text(text = "profile")
//            }
//
//        }
//    }
//}
