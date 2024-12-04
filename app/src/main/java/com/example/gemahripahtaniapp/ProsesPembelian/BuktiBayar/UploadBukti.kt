package com.example.gemahripahtaniapp.ProsesPembelian.BuktiBayar

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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class UploadBukti : ComponentActivity() {
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
fun UploadScreen(navController: NavHostController) {
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
    )
    {
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
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 0.dp, end = 330.dp,)
                        .width(200.dp)
                        .height(24.dp)
                        .clickable {
                            navController.navigate("upload")}
                )
                Text(
                    text = "Upload",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 26.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier
                        .width(323.dp)
                        .height(20.dp)
                        .padding(start = 21.dp, end = 38.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Unggah Bukti Pembayaran",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(340.dp)
                        .height(31.dp)
                        .padding(start = 80.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Silakan unggah bukti transfer untuk menyelesaikan pesanan Anda.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 21.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(320.dp)
                        .height(51.dp)
                        .padding(start = 100.dp)
                )
            }
            Column(
                modifier = Modifier
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Unggah Bukti Pembayaran",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(300.dp)
                        .height(31.dp)
                        .padding(start = 5.dp)
                )
                Text(
                    text = "Unggah bukti transfer dalam format JPEG, PNG, atau PDF.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 21.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(390.dp)
                        .height(41.dp)
                        .padding(start = 30.dp)
                )
            }
            Column(verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                .padding(start = 40.dp)
            ) {
                Box(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFF109179),
                            shape = RoundedCornerShape(size = Variables.radiMlg)
                        )
                        .width(344.dp)
                        .height(186.dp)
                        .background(
                            color = Variables.bgColorLight,
                            shape = RoundedCornerShape(size = Variables.radiMlg)
                        )
                        .padding(
                            start = Variables.spacingLg,
                            top = Variables.spacingLg,
                            end = Variables.spacingLg,
                            bottom = Variables.spacingLg
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.upload),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(350.dp)
                            .height(42.dp)
                    )
                    Column (
                        modifier = Modifier
                            .padding(start = 50.dp, top = 60.dp)
                    ){
                        Text(
                            text = "Seret & lepas file atau Telusuri",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight(400),

                            ),
                            modifier = Modifier
                                .width(211.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "ATAU",
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 18.sp,
                                fontWeight = FontWeight(400),
                                textAlign = TextAlign.Center,
                            ),
                            modifier = Modifier
                                .width(131.dp)
                                .height(18.dp)
                                .padding(start = 65.dp, top = 5.dp)
                        )
                        Row (
                            horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .padding(start = 40.dp, top = 5.dp)
                                .border(width = 1.dp, color = Color(0xFF109179), shape = RoundedCornerShape(12.dp))
                                .width( 130.dp)
                                .height(40.dp)
                                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))
                                .padding(start = 32.dp, top = 11.dp, end = 16.dp, bottom = 11.dp)
                        )
                        {
                            Text(
                                text = "Pilih File",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 18.sp,
                                    fontWeight = FontWeight(600),
                                    color = Color(0xFF109179),
                                ),
                                modifier = Modifier
                                    .width(139.dp)
                                    .height(128.dp)
                                    .padding(start = 5.dp)
                            )
                        }

                    }
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
                        navController.navigate("bayar1")
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
object Variables {
    val bgColorLight: Color = Color(0xFFFFFFFF)
    val radiMlg: Dp = 8.dp
    val spacingLg: Dp = 24.dp
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greting() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    UploadScreen(navController = navController)
}