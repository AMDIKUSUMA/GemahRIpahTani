package com.example.gemahripahtaniapp.SplashScreen

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
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class Masuk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniAppTheme {  }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MasukScreen()
                }
            }
        }
    }


@Composable
fun MasukScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
        Column {
            Spacer(modifier = Modifier.height(16.dp)
            )

        }
        Text(
            text = "Masuk",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .padding(start = 27.dp, end = 27.dp, top = 420.dp, bottom = 360.dp)
                .width(358.dp)
                .height(52.dp)
                .background(
                    color = Color(0xFF109179),  // Warna latar belakang hijau
                    shape = RoundedCornerShape(12.dp)
                    // Sudut melengkung
                )
                .padding(vertical = 12.dp)  // Padding untuk menyesuaikan posisi teks
        )
        Text(
            text = "Selamat Datang di HidroTani",
            style = TextStyle(
                fontSize = 36.sp,
                lineHeight = 50.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),

        ),
            modifier = Modifier
                .width(252.dp)
                .height(50.dp)
                .padding(start = 35.dp, end = 100.dp, top = 153.dp, bottom = 581.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 35.dp, top =293.dp, end = 38.dp, bottom = 490.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "esjeruk@gmail.com",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF979797),
            ),
            modifier = Modifier
                .width(139.dp)
                .height(21.dp)
                .padding(start = 53.dp, end = 191.dp, top = 307.dp, bottom = 505.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 35.dp, top =359.dp, end = 38.dp, bottom = 421.dp )
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
                color = Color(0xFF979797),
            ),
            modifier = Modifier
                .width(58.dp)
                .height(21.dp)
                .padding(start = 53.dp, end = 263.dp, top = 374.dp, bottom = 435.dp)
        )
        Text(
            text = "Lupa Password? ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(34.dp)
                .height(16.dp)
                .padding(start = 65.dp, end = 65.dp, top = 512.dp, bottom = 298.dp)

        )
        Text(
            text = "Atau ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(34.dp)
                .height(16.dp)
                .padding(start = 13.dp, end = 13.dp, top = 572.dp, bottom = 238.dp)

        )
        Text(
            text = "Sudah punya akun? Masuk",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(166.dp)
                .height(18.dp)
                .padding(start = 123.dp, end = 123.dp, top = 755.dp, bottom = 60.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 200.dp, top =600.dp, end = 45.dp, bottom = 165.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "image description",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .padding(start = 250.dp, top = 610.dp, end = 100.dp, bottom = 170.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 45.dp, top =600.dp, end = 200.dp, bottom = 165.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(23.dp)
                .height(23.dp)
                .padding(start = 101.dp, top = 615.dp, end = 260.dp, bottom = 180.dp)
        )

    }

}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greetingg() {
    GemahRipahTaniAppTheme {  }
    MasukScreen()
    }
