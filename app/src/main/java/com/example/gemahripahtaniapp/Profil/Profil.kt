package com.example.gemahripahtaniapp.Profil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class Profiil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
               MainApp()
            }
        }
    }
}


@Composable
fun ProfilScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background)
    {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)

        ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(93.dp)
                        .background(color = Color(0xFF109179)),
                )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.naufal2),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(start = 150.dp)
                    .width(132.dp)
                    .height(132.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Naufal Nurrohman",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(28.dp)
                    .padding(start = 30.dp)
            )
            //            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Product Design",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF979797),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(22.dp)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Akun Saya",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 15.6.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF262422),
                    letterSpacing = 0.03.sp,
                ),
                modifier = Modifier
                    .width(169.dp)
                    .height(16.dp)
                    .padding(start = 40.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(34.dp)
                        .height(24.dp)
                        .padding(start = 8.dp)
                )
                ClickableText(
                    text = AnnotatedString("Edit Profil"),
                    onClick = {
                        navController.navigate("gantiSandi")
                    },
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 15.dp, top = 5.dp)
                )

            }
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.lock),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(34.dp)
                        .height(24.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Ganti Kata Sandi",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 15.dp, top = 5.dp)
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Lainnya",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 15.6.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF262422),
                    letterSpacing = 0.03.sp,
                ),
                modifier = Modifier
                    .width(169.dp)
                    .height(16.dp)
                    .padding(start = 40.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.shopp),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(34.dp)
                        .height(24.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Pesanan Saya",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 15.dp, top = 5.dp)
                )

            }
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(34.dp)
                        .height(24.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Bantuan",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 15.dp, top = 5.dp)
                )

            }
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(34.dp)
                        .height(24.dp)
                        .padding(start = 8.dp)
                )
                ClickableText(
                    text = AnnotatedString("Tentang Kami"),
                    onClick = {
                        navController.navigate("gantiSandi")
                    },
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 15.dp, top = 5.dp)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize() // Mengisi seluruh area layar
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .border(width = 1.dp, color = Color(0xFF109179), shape = RoundedCornerShape(12.dp))
                        .width(308.dp)
                        .height(50.dp)
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                        .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                        .align(Alignment.BottomCenter) // Menyelaraskan ke bawah dan tengah
                ) {
                    ClickableText(
                        text = AnnotatedString("Log Out"),
                        onClick = { navController.navigate("profile") },
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 19.2.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF000000),
                            letterSpacing = 0.03.sp,
                        ),
                        modifier = Modifier
                            .width(332.dp)
                            .height(37.dp)
                            .padding(start = 110.dp, top = 5.dp)
                    )
                }
            }


        }
    }
}


//    }
//object Variables {
//    val radiLg: Dp = 12.dp
//    val spacingMd: Dp = 16.dp
//    val spacingSmd: Dp = 12.dp
//}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greting() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    ProfilScreen(navController = navController)
}