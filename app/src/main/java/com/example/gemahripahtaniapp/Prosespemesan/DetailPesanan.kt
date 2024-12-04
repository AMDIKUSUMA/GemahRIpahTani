package com.example.gemahripahtaniapp.Prosespemesan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

class DetailPesanan : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                DetailScreen()
            }
        }
    }
}


@Composable
fun DetailScreen( ) {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {
        Text(
            text = "Pilih Pengiriman",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(323.dp)
                .height(26.dp)
                .padding(start = 51.dp, top = 51.dp, bottom = 745.dp, end = 180.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hidroponik),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 125.dp, end = 239.dp, bottom = 600.dp)
                .width(90.dp)
                .height(90.dp)
        )
        Text(
            text = "Kit Hidroponik Pemula",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(208.dp)
                .height(21.dp)
                .padding(start = 170.dp,top = 126.dp, end = 80.dp, bottom = 680.dp)
        )
        Text(
            text = "Rp 62.500",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(208.dp)
                .height(24.dp)
                .padding(start = 170.dp,top = 160.dp, end = 80.dp, bottom = 645.dp)
        )
        Text(
            text = "JUMLAH",

            // label/regular
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF232323),
                textAlign = TextAlign.Center,
                letterSpacing = 0.6.sp,
            ),
            modifier = Modifier
                .width(50.dp)
                .height(18.dp)
                .padding(start = 170.dp,top = 200.dp, end = 170.dp, bottom = 615.dp)
        )
        Text(
            text = "1",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(6.dp)
                .height(21.dp)
                .padding(start = 230.dp,top = 198.dp, end = 150.dp, bottom = 615.dp)
        )
        Text(
            text = "Lihat Detail Pesanan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(237.dp)
                .height(24.dp)
                .padding(start = 68.dp,top = 246.dp, end = 107.dp, bottom = 565.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.down),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 321.dp, top = 246.dp, end = 50.dp, bottom = 565.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Nomor Referensi                           000085752257\nStatus Pembayaran                                Berhasil\nWaktu Pembayaran               26-10-2024, 09:30\nTotal Pembayaran                               Rp 66.000\nEstimasi Sampai                                28-10-2023",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(318.dp)
                .height(150.dp)
                .padding(start = 48.dp, end = 48.dp,top = 299.dp, bottom = 390.dp)
        )
        Text(
            text = "Info Pengiriman Barang",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(167.dp)
                .height(21.dp)
                .padding(start = 49.dp, top = 485.dp, end = 196.dp, bottom = 325.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.pesawat),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 1.dp, color = Color(0xFF000000))
                .border(width = 1.dp, color = Color(0xFF000000))
                .padding(start = 49.dp, end = 315.dp,top= 510.dp, bottom = 290.dp)
                .width(25.dp)
                .height(25.dp)
        )
        Text(
            text = "Pesanan sedang diantar menuju alamat tujuan.\n27-10-2024  10.30",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(272.dp)
                .height(60.dp)
                .padding(start = 95.dp, end = 60.dp,top= 510.dp, bottom = 260.dp)
        )
        Text(
            text = "Alamat Pengirim",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(119.dp)
                .height(30.dp)
                .padding(start = 49.dp, top = 600.dp, end = 220.dp, bottom = 210.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.lokas),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 51.dp, end = 315.dp,top = 625.dp, bottom = 180.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Jl Menganti No.666, Wiyung, Surabaya",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(281.dp)
                .height(30.dp)
                .padding(start = 95.dp, end = 60.dp,top = 625.dp, bottom = 180.dp)
        )

    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp()
    DetailScreen( )
}
