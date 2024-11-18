package com.example.gemahripahtaniapp.ProsesPembelian.SuksesPembayaran

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
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class SuksesBayar2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Bayar2Screen()
            }
        }
    }
}


@Composable
fun Bayar2Screen( ) {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
        Column {
            {
            }
            Spacer(modifier = Modifier.height(16.dp)
            )
            Text(
                text = "Kembali ke Beranda",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 740.dp)
                    .width(358.dp)
                    .height(52.dp)
                    .background(
                        color = Color(0xFF109179),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(vertical = 12.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.centang),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(0.dp)
                .width(62.dp)
                .height(62.dp)
                .padding(start = 190.dp, top = 60.dp, end = 190.dp, bottom = 750.dp)
        )
        Text(
            text = "Pembayaran Berhasil!",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(313.dp)
                .height(28.dp)
                .padding(start = 50.dp, top = 125.dp, end = 50.dp, bottom = 660.dp)
        )
        Text(
            text = "Pembayaran Anda telah berhasil dilakukan.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF979797),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(313.dp)
                .height(22.dp)
                .padding(start = 50.dp, top = 159.dp, end = 50.dp, bottom = 630.dp)
        )
        Text(
            text = "Total Pembayaran",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(297.dp)
                .height(22.dp)
                .padding(start = 58.dp, top = 230.dp, end = 57.dp, bottom = 575.dp)
        )
        Text(
            text = "Rp 66.000",
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(297.dp)
                .height(32.dp)
                .padding(start = 58.dp, top = 260.dp, end = 57.dp, bottom = 540.dp)
        )
        Text(
            text = "Detail Pembayaran",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(237.dp)
                .height(24.dp)
                .padding(start = 68.dp, top = 333.dp, end = 167.dp, bottom = 475.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.panah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 298.dp, top = 333.dp, end = 60.dp, bottom = 470.dp)
        )
        Text(
            text = "Nomor Referensi",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(164.dp)
                .height(18.dp)
                .padding(start = 68.dp, top = 370.dp, end = 167.dp, bottom = 440.dp)
        )
        Text(
            text = "Status Pembayaran",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(186.dp)
                .height(18.dp)
                .padding(start = 68.dp, top = 400.dp, end = 167.dp, bottom = 410.dp)
        )
        Text(
            text = "Waktu Pembayaran",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(127.dp)
                .height(36.dp)
                .padding(start = 68.dp, top = 430.dp, end = 250.dp, bottom = 360.dp)
        )
        Text(
            text = "Total Pembayaran\n",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(180.dp)
                .height(36.dp)
                .padding(start = 68.dp, top = 480.dp, end = 200.dp, bottom = 330.dp)
        )
        Text(
            text = "Detail Pengiriman",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(237.dp)
                .height(24.dp)
                .padding(start = 68.dp, top = 530.dp, end = 100.dp, bottom = 270.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.down),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 298.dp, top = 530.dp, end = 60.dp, bottom = 270.dp)
        )


    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
    Bayar2Screen( )
}