package com.example.gemahripahtaniapp.ForumKomunitas.tambahpost

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class TambahPertanyaan : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                PertanyaanScreen()
            }
        }
    }
}


@Composable
fun  PertanyaanScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {

        Text(
            text = "Buat Postingan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(108.dp)
                .height(20.dp)
                .padding(start = 70.dp, top = 25.dp,bottom = 780.dp, end = 220.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 205.dp, top = 15.dp, end = 30.dp, bottom = 775.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 100.dp))

        )
        Text(
            text = "Tambah Pertanyaan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier
                .width(146.dp)
                .height(20.dp)
                .padding(start = 220.dp, top = 25.dp, bottom = 780.dp, end = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.clos),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 10.dp, top = 20.dp, bottom = 780.dp, end = 350.dp)
                .width(13.dp)
                .height(40.dp)
                .size(130.dp)
        )
        Text(
            text = "Tambahkan Pertanyaan",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 25.2.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF282829),
            ),
            modifier = Modifier
                .width(343.dp)
                .height(25.dp)
                .padding(start = 16.dp, end = 16.dp, top = 80.dp, bottom = 720.dp)
        )
        Text(
            text = "Tips untuk mendapatkan jawaban yang baik dengan cepat\n 1. Pastikan pertanyaan Anda belum ditanyakan sebelumnya\n 2. Buatlah pertanyaan Anda singkat dan langsung ke intinya\n 3. Periksa ulang tata bahasa dan ejaan",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFA7A7A7),
            ),
            modifier = Modifier
                .width(343.dp)
                .height(119.dp)
                .padding(start = 16.dp, end = 66.dp, top = 110.dp, bottom = 600.dp)
        )
        Text(
            text = "Apa yang terjadi?",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF687684),
            ),
            modifier = Modifier
                .width(134.dp)
                .height(24.dp)
                .padding(start = 50.dp, top = 255.dp, bottom = 550.dp, end = 210.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.naufal),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 10.dp, top = 250.dp, end = 350.dp, bottom = 550.dp)
                .width(28.8.dp)
                .height(32.51042.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 270.dp, top = 710.dp, end = 20.dp, bottom = 80.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 100.dp))

        )
        Text(
            text = "Posting",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier
                .width(45.dp)
                .height(18.dp)
                .padding(start = 295.dp, top = 720.dp, end = 40.dp, bottom = 90.dp)
        )

    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevie() {
    GemahRipahTaniApp ()
    PertanyaanScreen()
}

