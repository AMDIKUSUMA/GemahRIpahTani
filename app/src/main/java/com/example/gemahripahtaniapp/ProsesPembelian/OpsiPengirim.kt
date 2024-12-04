package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class OpsiPengirim : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp()
                // A surface container using the 'background' color from the theme
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
fun OpsiScreen(navController: NavHostController) {
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
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .background(color = Color(0xFF109179)),
            ) {
                Text(
                    text = "Pilih Pengiriman",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    modifier = Modifier
                        .padding(start = 48.dp, end = 210.dp, top = 41.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",

                    modifier = Modifier
                        .padding(start = 8.dp, end = 330.dp, top = 40.dp)
                        .width(24.dp)
                        .height(24.dp)
                        .clickable {
                            navController.navigate("prosesBeli")}
                )
            }
            Spacer(modifier = Modifier.height(38.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.radio),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 5.dp, top = 5.dp)
                        .width(80.dp)
                        .height(16.dp)
                )
                // Spacer(modifier = Modifier.height(18.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(77.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp)
                            .height(37.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Pengiriman standar",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            )
                        )
                        Text(
                            text = "Gratis",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            ),
                            modifier = Modifier
                                .width(128.dp)
                                .height(57.dp)
                                .padding(start = 40.dp, top = 17.dp)

                        )
                    }
                    Text(
                        text = "Tersedia hingga 3 hari setelah pemesanan",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 22.4.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF40434D),
                        ),
                        modifier = Modifier
                            .width(190.dp)
                            .height(44.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(38.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.radiohitam),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 5.dp, top = 5.dp)
                        .width(80.dp)
                        .height(16.dp)
                )
                // Spacer(modifier = Modifier.height(18.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(77.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp)
                            .height(37.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Pengiriman standar",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            )
                        )
                        Text(
                            text = "Rp 2.500",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            ),
                            modifier = Modifier
                                .width(128.dp)
                                .height(57.dp)
                                .padding(start = 40.dp, top = 17.dp)

                        )
                    }
                    Text(
                        text = "Pengiriman pada Senin, 28 Oktober",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 22.4.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF40434D),
                        ),
                        modifier = Modifier
                            .width(150.dp)
                            .height(44.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(38.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.radio),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 5.dp, top = 5.dp)
                        .width(80.dp)
                        .height(16.dp)
                )
                // Spacer(modifier = Modifier.height(18.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(77.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp)
                            .height(37.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Pengiriman Express",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            )
                        )
                        Text(
                            text = "Rp 35.00",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF232323),
                            ),
                            modifier = Modifier
                                .width(128.dp)
                                .height(57.dp)
                                .padding(start = 40.dp, top = 17.dp)

                        )
                    }
                    Text(
                        text = "Pengiriman di hari yang sama",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 22.4.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF40434D),
                        ),
                        modifier = Modifier
                            .width(153.dp)
                            .height(44.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(390.dp))
            Column (  modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("pemesanan")
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
fun GreetingPreview() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    OpsiScreen(navController = navController)
    }
