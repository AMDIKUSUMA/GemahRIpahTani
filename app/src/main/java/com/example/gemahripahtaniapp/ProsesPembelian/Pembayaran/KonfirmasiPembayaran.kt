package com.example.gemahripahtaniapp.ProsesPembelian.Pembayaran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
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
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class KonfirmasiPemabayaran : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    KonfirScreen()
                }
            }
        }
    }


@Composable
fun  KonfirScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {

        Image(
            painter = painterResource(id = R.drawable.cross),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 28.dp, top = 60.dp, end = 350.dp, bottom = 750.dp)
        )
        Text(
            text = "Lakukan pembayaran Mandiri Virtual Account Anda melalui Mobile bangking, ATM, atau Internet Bangking dalam waktu",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 21.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(324.dp)
                .height(63.dp)
                .padding(start = 50.dp, top = 113.dp, end = 50.dp, bottom = 650.dp)
        )
        Text(
            text = "23 jam 59 menit 50 detik\n\n",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(250.dp)
                .height(70.dp)
                .padding(start = 81.dp, top = 200.dp, end = 81.dp, bottom = 590.dp)
        )
        Text(
            text = "Jatuh tempo 27 Okt 2024, 09:29",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(219.dp)
                .height(21.dp)
                .padding(start = 96.dp, top = 250.dp, end = 97.dp, bottom = 560.dp)
        )
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
                .padding(start = 26.dp, top = 290.dp, end = 280.dp, bottom = 520.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =315.dp, end = 27.dp, bottom = 440.dp )
                .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Text(
            text = "Selesai",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(66.dp)
                .height(27.dp)
                .padding(start = 173.dp, top = 770.dp, bottom = 20.dp, end = 160.dp)
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
                .padding(start = 96.dp, top = 330.dp, end = 97.dp, bottom = 450.dp)
        )
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
                .padding(start = 26.dp, top = 420.dp, end = 180.dp, bottom = 390.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =445.dp, end = 27.dp, bottom = 315.dp )
                .border(width = 1.dp, color = Color(0xFF28303F), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
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
                .height(26.dp)
                .padding(start = 96.dp, top = 468.dp, end = 180.dp, bottom = 335.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mandiri),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(2.dp)
                .width(48.dp)
                .height(48.dp)
                .padding(start = 40.dp, top = 325.dp, end = 300.dp, bottom = 450.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.money),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 40.dp, top = 457.dp, end = 300.dp, bottom = 330.dp)
        )


    }

}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
        KonfirScreen( )
    }
