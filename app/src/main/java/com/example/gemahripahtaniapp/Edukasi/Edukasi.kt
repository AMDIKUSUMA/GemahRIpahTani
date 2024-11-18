package com.example.gemahripahtaniapp.Edukasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class Edukasi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                EduScreen()
            }
        }
    }
}
@Composable
fun EduScreen() {
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
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cari),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 1.dp, top = 53.dp)
                        .width(46.dp)
                        .height(46.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.keranjang),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 360.dp, top = 53.dp)
                        .width(46.dp)
                        .height(46.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp)) // Space between top bar and the rest of the conten
            // Main Content Row with the two boxes
            Row(
                modifier = Modifier
                    .padding(start = 5.dp, top = 10.dp, end = 5.dp)
            ) {
                // Box for "Peralatan Hidroponik"
                Box(
                    modifier = Modifier
                        .shadow(elevation = 1.dp, spotColor = Color(0x0A000000), ambientColor = Color(0x0A000000))
                        .shadow(elevation = 9.9.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                        .width(187.dp)
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(size = Variables.radiLg))
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Forum",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF109179),
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                // Box for "Nutrisi dan Media Tanam"
                Box(
                    modifier = Modifier
                        .padding(top = 0.dp)
                        .shadow(elevation = 1.dp, spotColor = Color(0x0A000000), ambientColor = Color(0x0A000000))
                        .shadow(elevation = 9.9.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                        .width(187.dp)
                        .height(60.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = Variables.radiLg))

                ) {
                    Text(
                        text = "Edukasi",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFFFFFF),
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .padding(top = 0.dp)
                        .shadow(elevation = 1.dp, spotColor = Color(0x0A000000), ambientColor = Color(0x0A000000))
                        .shadow(elevation = 9.9.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                        .width(187.dp)
                        .height(60.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = Variables.radiLg))
                )
            }

        }
//batas
        Box(
            modifier = Modifier
                .padding(start = 15.dp, top = 181.dp, end = 90.dp, bottom = 605.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 30.dp))

        )
        Text(
            text = "Search",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF929292),
            ),
            modifier = Modifier
                .width(57.dp)
                .height(24.dp)
                .padding(start = 65.dp,top = 193.dp, end = 90.dp, bottom = 610.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.search),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 30.dp,top = 185.dp, end = 330.dp, bottom = 610.dp)
                .width(18.7643.dp)
                .height(19.22197.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.filter),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 320.dp,top = 190.dp, end = 40.dp, bottom = 610.dp)
                .width(18.23541.dp)
                .height(17.48447.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.sort),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 320.dp,top = 250.dp, end = 40.dp, bottom = 540.dp)
                .width(20.dp)
                .height(20.dp)
        )
        Text(
            text = "List Edukasi dan Informasi",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1A1A1A),
            ),
            modifier = Modifier
                .width(246.dp)
                .height(24.dp)
                .padding(start = 20.dp,top = 260.dp, end = 80.dp, bottom = 540.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hidro4),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp, top = 315.dp, bottom = 310.dp)
                .width(350.dp)
                .height(182.dp)
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
                .padding(start = 30.dp, top = 540.dp, end = 80.dp, bottom = 260.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.share),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 320.dp,top = 540.dp, end = 40.dp, bottom = 260.dp)
                .width(18.dp)
                .height(18.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 30.dp, end = 340.dp, top = 570.dp, bottom = 230.dp)
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
                .padding(start = 55.dp, end = 260.dp, top = 575.dp, bottom = 230.dp)
        )
        Column {
            Spacer(modifier = Modifier.height(16.dp)
            )

            Text(
                text = "More",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 600.dp)
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
            painter = painterResource(id = R.drawable.hidro3),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp, top = 700.dp)
                .width(350.dp)
                .height(182.dp)
        )
    }
}

object Variables {
    val radiLg: Dp = 12.dp
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevie() {
    GemahRipahTaniApp()
    EduScreen()
}