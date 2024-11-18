package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class OpsiBayar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenBayar()
                }
            }
        }
    }


@Composable
fun ScreenBayar() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )


    {
        Column {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .background(color = Color(0xFF109179)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Pilih Pembayaran",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    modifier = Modifier.padding(start = 48.dp, end = 200.dp, top = 30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 8.dp, end = 330.dp, top = 30.dp)
                        .width(24.dp)
                        .height(24.dp)
                )

            }

            Spacer(modifier = Modifier.height(16.dp)
            )


            Text(
                text = "Selesai",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 640.dp)
                    .width(358.dp)
                    .height(52.dp)
                    .background(
                        color = Color(0xFF109179),  // Warna latar belakang hijau
                        shape = RoundedCornerShape(12.dp)
                        // Sudut melengkung
                    )
                    .padding(vertical = 12.dp)  // Padding untuk menyesuaikan posisi teks
            )
        }

        Text(
            text = "E - Wallet",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 20.dp, top = 120.dp, bottom = 690.dp, end = 300.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =150.dp, end = 27.dp, bottom = 640.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "DANA",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 51 .dp, top = 160.dp, bottom = 650.dp, end = 300.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radio),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 330 .dp, top = 160.dp, bottom = 650.dp, end = 30.dp)
                .width(16.dp)
                .height(16.dp)

        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =190.dp, end = 27.dp, bottom = 600.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "OVO",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 51.dp, top = 200.dp, bottom = 610.dp, end = 300.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.radio),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 330 .dp, top = 200.dp, bottom = 610.dp, end = 30.dp)
                .width(16.dp)
                .height(16.dp)

        )


        Text(
            text = "Virtual Account",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 20.dp, top = 235.dp, bottom = 575.dp, end = 300.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =270.dp, end = 27.dp, bottom = 520.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "MANDIRI",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 51.dp, top = 280.dp, bottom = 530.dp, end = 280.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radiohitam),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 330 .dp, top = 280.dp, bottom = 530.dp, end = 30.dp)
                .width(16.dp)
                .height(16.dp)

        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =310.dp, end = 27.dp, bottom = 480.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "BRI",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(22.dp)
                .padding(start = 51.dp, top = 320.dp, bottom = 490.dp, end = 280.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radio),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 330 .dp, top = 320.dp, bottom = 490.dp, end = 30.dp)
                .width(16.dp)
                .height(16.dp)

        )
    }

}




@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrev() {
    GemahRipahTaniApp ()
        ScreenBayar()
    }
