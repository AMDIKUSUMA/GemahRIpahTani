package com.example.gemahripahtaniapp.Edukasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp


class Notifikasi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                NotifScreen()
            }
        }
    }
}


@Composable
fun NotifScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {
        Text(
            text = "Notifikasi",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(323.dp)
                .height(26.dp)
                .padding(start = 51.dp, top = 51.dp, end = 38.dp, bottom = 750.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.notice),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(start = 30.dp,top =130.dp, end = 332.dp, bottom = 660.dp)
        )
        Text(
            text = "Produk baru untuk kebutuhan hidroponik Anda sudah tersedia! Segera cek di halaman toko.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(283.dp)
                .height(78.dp)
                .padding(start = 88.dp, top = 131.dp, end = 40.dp, bottom = 630.dp)
        )
        Text(
            text = "28/10/2024, 09.00                                             ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(275),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(112.dp)
                .height(26.dp)
                .padding(start = 88.dp, top = 210.dp, end = 180.dp, bottom = 600.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sampah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 350.dp, end = 20.dp, top = 210.dp, bottom = 600.dp)
                .width(20.dp)
                .height(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.chat),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(start = 30.dp,top =260.dp, end = 332.dp, bottom = 530.dp)
        )
        Text(
            text =  "Pertanyaan anda berhasil diposting! Siap menerima tanggapan yang baik dari anggota komunitas.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(283.dp)
                .height(78.dp)
                .padding(start = 88.dp, top = 260.dp, end = 40.dp, bottom = 500.dp)
        )
        Text(
            text = "28/10/2024, 09.00                                             ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(275),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(112.dp)
                .height(26.dp)
                .padding(start = 88.dp, top = 340.dp, end = 180.dp, bottom = 470.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sampah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 350.dp, end = 20.dp, top = 340.dp, bottom = 470.dp)
                .width(20.dp)
                .height(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.shopping),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(start = 30.dp,top =390.dp, end = 332.dp, bottom = 400.dp)
        )
        Text(
            text =  "Pembayaran Anda sebesar Rp 66.000 telah diterima, Terima kasih atas kepercayaan Anda.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(283.dp)
                .height(78.dp)
                .padding(start = 88.dp, top = 390.dp, end = 40.dp, bottom = 370.dp)
        )
        Text(
            text = "28/10/2024, 09.00                                             ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(275),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(112.dp)
                .height(26.dp)
                .padding(start = 88.dp, top = 470.dp, end = 180.dp, bottom = 340.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sampah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 350.dp, end = 20.dp, top = 470.dp, bottom = 340.dp)
                .width(20.dp)
                .height(20.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.key),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(start = 30.dp,top =520.dp, end = 332.dp, bottom = 270.dp)
        )
        Text(
            text =  "Password Anda berhasil diubah, Silakan masuk kembali.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(283.dp)
                .height(78.dp)
                .padding(start = 88.dp, top = 520.dp, end = 40.dp, bottom = 250.dp)
        )
        Text(
            text = "28/10/2024, 09.00                                             ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(275),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(112.dp)
                .height(26.dp)
                .padding(start = 88.dp, top = 590.dp, end = 180.dp, bottom = 220.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sampah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 350.dp, end = 20.dp, top = 590.dp, bottom = 220.dp)
                .width(20.dp)
                .height(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.bell),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .padding(start = 30.dp,top =640.dp, end = 332.dp, bottom = 152.dp)
        )
        Text(
            text =   "Selamat, akun Anda berhasil dibuat! Anda dapat masuk sekarang.",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(283.dp)
                .height(78.dp)
                .padding(start = 88.dp, top = 640.dp, end = 40.dp, bottom = 130.dp)
        )
        Text(
            text = "28/10/2024, 09.00                                             ",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(275),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(112.dp)
                .height(26.dp)
                .padding(start = 88.dp, top = 710.dp, end = 180.dp, bottom = 100.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sampah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 350.dp, end = 20.dp, top = 710.dp, bottom = 100.dp)
                .width(20.dp)
                .height(20.dp)
        )

    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
        NotifScreen()
    }