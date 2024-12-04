package com.example.gemahripahtaniapp.Profil

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.verticalScroll
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

class GantiSandi : ComponentActivity() {
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
fun  SandiScreen(navController: NavHostController) {
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
    Surface (
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
                {
                        Image(
                            painter = painterResource(id = R.drawable.kiri),
                            contentDescription = "image description",
                            modifier = Modifier
                                .padding(start = 0.dp, end = 360.dp, top = 30.dp)
                                .width(150.dp)
                                .height(24.dp)
                                .clickable {
                                    navController.navigate("profile")
                                }
                        )
                        Text(
                            text = "Edit Profil",
                            style = TextStyle(
                                fontSize = 18.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFFFFFFFF),
                            ),
                            modifier = Modifier
                                .padding(start = 60.dp, end = 30.dp, top = 33.dp)
                                .width(200.dp)
                                .height(24.dp)
                        )

                }
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 150.dp)
                        .width(132.dp)
                        .height(132.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
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
                    text = "Nama Lengkap",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF262422),
                        letterSpacing = 0.03.sp,
                    ),
                    modifier = Modifier
                        .width(159.dp)
                        .height(17.dp)
                        .padding(start = 30.dp)
                )
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 30.dp, top = 10.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                            .width(358.dp)
                            .height(50.dp)
                            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                    ) {
                        Text(
                            text = "Naufal Nurrohman",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.8.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                                letterSpacing = 0.03.sp,
                            ),
                            modifier = Modifier
                                .width(132.dp)
                                .height(37.dp)
                                .padding(start = 10.dp, top = 7.dp)
                        )

                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Email",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF262422),
                        letterSpacing = 0.03.sp,
                    ),
                    modifier = Modifier
                        .width(159.dp)
                        .height(17.dp)
                        .padding(start = 30.dp)
                )
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 30.dp, top = 12.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                            .width(358.dp)
                            .height(50.dp)
                            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                    ) {
                        Text(
                            text = "esjeruk@gmail.com",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.8.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                                letterSpacing = 0.03.sp,
                            ),
                            modifier = Modifier
                                .width(132.dp)
                                .height(37.dp)
                                .padding(start = 10.dp, top = 7.dp)
                        )

                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "No. Telepon",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF262422),
                        letterSpacing = 0.03.sp,
                    ),
                    modifier = Modifier
                        .width(159.dp)
                        .height(17.dp)
                        .padding(start = 30.dp)
                )
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 30.dp, top = 12.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                            .height(50.dp)
                            .width(358.dp)
                            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                    ) {
                        Text(
                            text = " (+62) 822-8280-2082",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.8.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                                letterSpacing = 0.03.sp,
                            ),
                            modifier = Modifier
                                .width(232.dp)
                                .height(37.dp)
                                .padding(start = 10.dp, top = 7.dp)
                        )

                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Alamat",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF262422),
                        letterSpacing = 0.03.sp,
                    ),
                    modifier = Modifier
                        .width(159.dp)
                        .height(17.dp)
                        .padding(start = 30.dp)
                )
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 30.dp, top = 12.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(12.dp))
                            .width(358.dp)
                            .height(50.dp)
                            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(start = 12.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                    ) {
                        Text(
                            text = "Jl Menganti No.666, Wiyung, Surabaya",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.8.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                                letterSpacing = 0.03.sp,
                            ),
                            modifier = Modifier
                                .width(332.dp)
                                .height(37.dp)
                                .padding(start = 10.dp, top = 5.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("profile")
                    },
                    modifier = Modifier
                        .width(359.dp)
                        .padding(start = 66.dp)
                        .height(52.dp)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                {
                    Text(
                        text = "Save",
                        color = Color.White
                    )
                }




            }
        }
    }



@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GretingPrew() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    SandiScreen(navController = navController)
}