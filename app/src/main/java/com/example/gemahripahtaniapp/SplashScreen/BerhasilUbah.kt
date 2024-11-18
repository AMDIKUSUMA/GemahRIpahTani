package com.example.gemahripahtaniapp.SplashScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

class BerhasilUbah : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniAppTheme {  }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UbahScreen()
                }
            }
        }
    }


@Composable
fun UbahScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )


    {
        Column {


            Spacer(modifier = Modifier.height(16.dp)
            )


            Text(
                text = "Masuk",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 570.dp)
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


        Image(
            painter = painterResource(id = R.drawable.akun),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(375.dp)
                .height(449.dp)
                .padding(start = 19.dp, top = 130.dp, end = 18.dp, bottom = 338.dp)
        )
        Text(
            text = "Password berhasil di ubah",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 50.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(252.dp)
                .height(50.dp)
                .padding(start = 37.dp, top = 500.dp, end = 41.dp, bottom = 27.dp)
        )
        Text(
            text = "Anda akan dialihkan ke halaman login dengan mengetuk tombol masuk",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(339.dp)
                .height(30.dp)
                .padding(start = 37.dp, top = 535.dp, end = 46.dp, bottom = 257.dp)
        )

    }

}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreviw() {
    GemahRipahTaniApp()
    UbahScreen()
    }
