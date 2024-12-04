package com.example.gemahripahtaniapp.ProsesPembelian.Pembayaran

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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

class KonfirmasiPemabayaran : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp ()
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
fun  KonfirScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    Surface (modifier = Modifier
        .fillMaxSize(),
        color = MaterialTheme.colorScheme.background)
    {
        Column(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Image(
                painter = painterResource(id = R.drawable.clos),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(1.dp)
                    .width(94.dp)
                    .height(44.dp)
                    .padding(start = 20.dp, top = 30.dp, end = 20.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Lakukan pembayaran Mandiri Virtual Account Anda melalui Mobile bangking, ATM, atau Internet Bangking dalam waktu",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 21.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .width(354.dp)
                    .padding(start = 70.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "23 jam 59 menit 50 detik\n\n",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(350.dp)
                    .height(54.dp)
                    .padding(start = 80.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Jatuh tempo 27 Okt 2024, 09:29",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(319.dp)
                    .height(21.dp)
                    .padding(start = 100.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Transfer ke",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF40434D),
                ),
                modifier = Modifier
                    .width(222.dp)
                    .height(22.dp)
                    .padding(start = 40.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier
                .padding(start = 30.dp, top = 5.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                        .width(358.dp)
                        .height(70.dp)
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                        .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mandiri),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(2.dp)
                            .width(48.dp)
                            .height(48.dp)
                    )
                    Text(
                        text = "8860000000000000\nMandiri Virtual Account",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 26.4.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                            letterSpacing = 0.08.sp,
                        ),
                        modifier = Modifier
                            .width(275.dp)
                            .height(46.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Jumlah Pembayaran",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF40434D),
                ),
                modifier = Modifier
                    .width(222.dp)
                    .height(22.dp)
                    .padding(start = 40.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier
                .padding(start = 30.dp, top = 5.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                        .width(358.dp)
                        .height(70.dp)
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                        .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.money),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(2.dp)
                            .width(48.dp)
                            .height(48.dp)
                    )
                    Text(
                        text = "Rp 66.000",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 26.4.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                            letterSpacing = 0.08.sp,
                        ),
                        modifier = Modifier
                            .width(275.dp)
                            .height(36.dp)
                            .padding(top = 14.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(308.dp))
            Column (  modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("upload")
                    },
                    modifier = Modifier
                        .width(339.dp)
//                    .padding(top = 30.dp, start = 26.dp, end = 0.dp)
                        .height(52.dp)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                {
                    Text(
                        text = "Selesai",
                        color = Color.White
                    )
                }
            }
        }

    }
}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
        KonfirScreen(navController = navController)
    }
