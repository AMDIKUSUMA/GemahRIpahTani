package com.example.gemahripahtaniapp.ForumKomunitas.InformasiEdukasi

//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.draw.shadow
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

//import com.example.gemahripahtaniapp.Variables

class InfoEdukasi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ScreenEdukasi()
            }

        }
    }


    @Composable
    fun ScreenEdukasi() {
        val scrollState = rememberScrollState()

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState) // Enable vertical scrolling
            ) {
                // Top Bar
                Box(
                    modifier = Modifier
                        .width(412.dp)
                        .height(93.dp)
                        .background(color = Color(0xFF109179))
                )

                Box(
                    modifier = Modifier
                        .padding(start = 205.dp, top = 12.dp, end = 30.dp) // Adjusted padding
                        .width(12.dp)
                        .height(93.dp)
                        .background(
                            color = Color(0xFF109179),
                            shape = RoundedCornerShape(size = 17.69458.dp)
                        )
                )

                Text(
                    text = "Forum",
                    style = TextStyle(
                        fontSize = 15.48.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .padding(start = 74.dp, top = 10.dp, end = 250.dp)
                )

                Text(
                    text = "Edukasi",
                    style = TextStyle(
                        fontSize = 15.48.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier
                        .padding(start = 260.dp, top = 10.dp, end = 74.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.hidro4),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, top = 20.dp)
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
                        .padding(start = 30.dp, top = 16.dp, end = 120.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 320.dp, top = 8.dp)
                        .width(18.dp)
                        .height(18.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 285.dp, top = 8.dp)
                        .width(18.dp)
                        .height(18.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 16.dp)
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
                        .padding(start = 55.dp, top = 4.dp)
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
                        .padding(start = 31.dp, end = 31.dp, top = 16.dp)
                )
            }
        }
    }
}
