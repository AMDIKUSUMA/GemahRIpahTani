package com.example.gemahripahtaniapp.Edukasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.shadow
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
//import com.example.gemahripahtaniapp.Variables

class InfoEdukasi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ScreenEdukasi()
            }

        }
    }
}


@Composable
fun ScreenEdukasi() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            // Top Bar
            Box(
                modifier = Modifier
                    .width(412.dp)
                    .height(93.dp)
                    .background(color = Color(0xFF109179))
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 205.dp, top = 105.dp, end = 30.dp, bottom = 665.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 17.69458.dp))

        )
        Text(
            text = "Forum",
            style = TextStyle(
                fontSize = 15.48.sp,

                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(61.dp)
                .height(23.dp)
                .padding(start = 74.dp, top = 125.dp, end = 250.dp, bottom = 670.dp)
        )

        Text(
            text = "Edukasi",
            style = TextStyle(
                fontSize = 15.48.sp,

                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier
                .width(61.dp)
                .height(23.dp)
                .padding(start = 260.dp, top = 125.dp, end = 74.dp, bottom = 670.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hidro4),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp, top = 181.dp, bottom = 470.dp)
                .width(382.dp)
                .height(214.dp)
        )
        Text(
            text = "Pengantar Hidroponik",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF1A1A1A),
            ),
            modifier = Modifier
                .width(201.dp)
                .height(27.dp)
                .padding(start = 30.dp, top = 370.dp, end = 120.dp, bottom = 430.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.share),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 320.dp,top = 370.dp, end = 40.dp, bottom = 430.dp)
                .width(18.dp)
                .height(18.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 285.dp,top = 370.dp, end = 75.dp, bottom = 430.dp)
                .width(18.dp)
                .height(18.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 30.dp, end = 340.dp, top = 400.dp, bottom = 400.dp)
                .width(16.dp)
                .height(16.dp)
        )
        Text(
            text = "50 Reviews",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF979797),
            ),
            modifier = Modifier
                .width(78.dp)
                .height(21.dp)
                .padding(start = 55.dp, end = 260.dp, top = 405.dp, bottom = 400.dp)
        )
        Text(
            text = "Hidroponik merupakan inovasi teknologi pertanian modern yang memungkinkan kita bercocok tanam tanpa menggunakan media tanah konvensional. Metode ini menggunakan larutan nutrisi yang kaya akan mineral esensial sebagai sumber makanan utama bagi tanaman. Sistem ini menjadi solusi cerdas di tengah tantangan keterbatasan lahan pertanian, terutama di wilayah perkotaan yang padat penduduk. Dengan hidroponik, siapa pun dapat menjadi petani modern, mulai dari pekarangan rumah hingga atap gedung dapat dimanfaatkan sebagai lahan produktif.\n\nKeunggulan sistem hidroponik tidak hanya terletak pada efisiensi penggunaan lahan, tetapi juga pada penggunaan air yang jauh lebih hemat dibandingkan pertanian konvensional. Air yang digunakan dapat didaur ulang dalam sistem, sehingga menghemat hingga 90% penggunaan air. Selain itu, tanaman hidroponik tumbuh dalam lingkungan yang terkontrol, bebas dari gangguan gulma dan hama tanah, menghasilkan produk pertanian yang lebih bersih dan berkualitas tinggi. Sistem ini juga memungkinkan produksi sepanjang tahun tanpa tergantung musim.",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF333333),
                textAlign = TextAlign.Justify,
            ),
            modifier = Modifier
                .width(350.dp)
                .height(720.dp)
                .padding(start = 31.dp, end = 31.dp, top = 440.dp)
        )

    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp()
    ScreenEdukasi()
}
