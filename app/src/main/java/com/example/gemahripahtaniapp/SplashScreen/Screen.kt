package com.example.gemahripahtaniapp.SplashScreen


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import kotlinx.coroutines.delay

class Screen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SplashScreen(navController = navController)
        }
    }
}


@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(Unit) {
        delay(4000)
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .width(360.dp)
                    .height(800.dp)
                    .background(color = Color(0xFFF4F4F4), shape = RoundedCornerShape(28.dp))
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logogemah),
                    contentDescription = "Logo Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                        .align(Alignment.Center)
                        .padding(end = 10.dp, start = 2.dp)
                )
            }
        }
    }
}

@Composable
fun SplashScreenn() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Elemen UI untuk halaman Home
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    SplashScreen(navController = navController)
}
