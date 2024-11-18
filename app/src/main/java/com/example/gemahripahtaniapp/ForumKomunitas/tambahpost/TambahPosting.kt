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

class TambahPosting : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PostingScreen()
                }
            }
        }
    }


@Composable
fun PostingScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {
        Box(
            modifier = Modifier
                .padding(start = 55.dp, top = 15.dp, end = 215.dp, bottom = 775.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 100.dp))

        )
        Text(
            text = "Buat Postingan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier
                .width(108.dp)
                .height(20.dp)
                .padding(start = 70.dp, top = 25.dp,bottom = 780.dp, end = 220.dp)
        )

        Text(
            text = "Tambah Pertanyaan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.6.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
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
                .height(13.dp)
        )
        Text(
            text = "Buat Postingan",
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
            text = "Apa yang terjadi?",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF687684),
            ),
            modifier = Modifier
                .width(134.dp)
                .height(24.dp)
                .padding(start = 50.dp, top = 205.dp, bottom = 600.dp, end = 210.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.naufal),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 10.dp, top = 200.dp, end = 350.dp, bottom = 600.dp)
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
        Image(
            painter = painterResource(id = R.drawable.galeri),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(18.03033.dp)
                .height(18.03033.dp)
                .padding(start = 38.dp, top = 130.dp, end = 300.dp, bottom = 660.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.gif),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(20.dp)
                .height(18.dp)
                .padding(start = 90.dp, top = 130.dp, end = 250.dp, bottom = 660.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.stast),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(20.dp)
                .height(18.dp)
                .padding(start = 140.dp, top = 130.dp, end = 200.dp, bottom = 660.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.lokasi1),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(20.dp)
                .height(18.dp)
                .padding(start = 190.dp, top = 130.dp, end = 150.dp, bottom = 660.dp)

        )


    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp ()
        PostingScreen()
    }
