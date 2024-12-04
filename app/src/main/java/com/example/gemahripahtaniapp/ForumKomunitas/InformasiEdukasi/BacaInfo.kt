package com.example.akun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class BacaInfoi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp ()

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                MainApp()
            }
        }
    }
}


@Composable
fun EdukasiScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .background(color = Color(0xFF109179)),
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.kiri),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(start = 18.dp, end = 330.dp, top = 40.dp)
                            .width(24.dp)
                            .height(24.dp)
                            .clickable {
                                navController.navigate("edukasi")}
                    )
                    Image(
                        painter = painterResource(id = R.drawable.belll),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(24.dp)
                            .height(24.dp)
                            .clickable {
                                navController.navigate("notif")}
                    )
                }
            }
            LazyRow(
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp, end = 5.dp)
            ) {
                items(
                    listOf(
                        "Forum",
                        "Edukasi"
                    )
                ) { item ->
                    Box(
                        contentAlignment = Alignment.Center, // Konten diatur ke tengah
                        modifier = Modifier
                            .shadow(
                                elevation = 1.dp,
                                spotColor = Color(0x0A000000),
                                ambientColor = Color(0x0A000000)
                            )
                            .shadow(
                                elevation = 9.9.dp,
                                spotColor = Color(0x40000000),
                                ambientColor = Color(0x40000000)
                            )
                            .width(187.dp)
                            .height(60.dp)
                            .background(
                                color = if (item == "Edukasi") Color(0xFF109179) else Color.White, // Warna untuk "Edukasi"
                                shape = RoundedCornerShape(size = 16.dp)
                            )
                            .padding(8.dp)
                    ) {
                        Text(
                            text = item,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = if (item == "Edukasi") Color.White else Color(0xFF109179), // Ubah warna teks
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column {
                Image(
                    painter = painterResource(id = R.drawable.hidro4),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .width(350.dp)
                        .height(182.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(
                    text = "Pengantar Hidroponik",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1A1A1A),
                    ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(50.dp))
                Image(
                    painter = painterResource(id = R.drawable.heart),
                    contentDescription = "image description",
                    Modifier
                        .padding(start = 30.dp)
                        .width(14.25.dp)
                        .height(13.5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
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
                        .width(178.dp)
                        .height(21.dp)
                        .padding(start = 10.dp, top = 3.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Column {
                Text(
                    text = "Hidroponik merupakan inovasi teknologi pertanian modern yang memungkinkan kita bercocok tanam tanpa menggunakan media tanah konvensional. Metode ini menggunakan larutan nutrisi yang kaya akan mineral esensial sebagai sumber makanan utama bagi tanaman. Sistem ini menjadi solusi cerdas di tengah tantangan keterbatasan lahan pertanian, terutama di wilayah perkotaan yang padat penduduk. Dengan hidroponik, siapa pun dapat menjadi petani modern, mulai dari pekarangan rumah hingga atap gedung dapat dimanfaatkan sebagai lahan produktif.\n\nKeunggulan sistem hidroponik tidak hanya terletak pada efisiensi penggunaan lahan, tetapi juga pada penggunaan air yang jauh lebih hemat dibandingkan pertanian konvensional. Air yang digunakan dapat didaur ulang dalam sistem, sehingga menghemat hingga 90% penggunaan air. Selain itu, tanaman hidroponik tumbuh dalam lingkungan yang terkontrol, bebas dari gangguan gulma dan hama tanah, menghasilkan produk pertanian yang lebih bersih dan berkualitas tinggi. Sistem ini juga memungkinkan produksi sepanjang tahun tanpa tergantung musim.",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF333333),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier
                        .width(400.dp)
                        .height(550.dp)
                        .padding(start = 20.dp)
                )
            }
        }

    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    EdukasiScreen(navController = navController)
}
