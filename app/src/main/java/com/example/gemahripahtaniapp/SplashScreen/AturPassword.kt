package com.example.gemahripahtaniapp.SplashScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class AturPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniAppTheme {  }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AturScreen()
                }
            }
        }
    }


@Composable
fun AturScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )


    {
        Column {


            Spacer(modifier = Modifier.height(16.dp)
            )


            Text(
                text = "Simpan",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 510.dp)
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
            text = "Lupa Password",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 50.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(252.dp)
                .height(50.dp)
                .padding(start = 40.dp, end = 120.dp, top = 292.dp, bottom = 500.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 35.dp, top =370.dp, end = 38.dp, bottom = 425.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "••••••••••",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(58.dp)
                .height(21.dp)
                .padding(start = 64.dp, end = 251.dp, top = 381.dp, bottom = 435.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 35.dp, top =435.dp, end = 38.dp, bottom = 360.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "••••••••••",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(58.dp)
                .height(21.dp)
                .padding(start = 64.dp, end = 251.dp, top = 448.dp, bottom = 370.dp)
        )

        Text(
            text = "Coba masuk? Masuk sekarang",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(191.dp)
                .height(18.dp)
                .padding(start = 111.dp, end = 110.dp, top = 700.dp, bottom = 100.dp)
        )


    }

}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPr() {
    GemahRipahTaniApp()
    AturScreen()
    }
