package com.example.gemahripahtaniapp.Profil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.Variables

class Profiil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
               ScreenProfil()
            }
        }
    }
}


@Composable
fun ScreenProfil() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
    Box(
        modifier = Modifier
            .padding(bottom = 740.dp)
            .fillMaxWidth()
            .height(93.dp)
            .background(color = Color(0xFF109179)),
        contentAlignment = Alignment.Center
    )
        {
        }
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .width(122.39999.dp)
                .height(138.16928.dp)
                .padding(start = 130.dp, end = 130.dp, top = 117.dp, bottom = 647.dp)
        )
        Text(
            text = "Naufal Nurrohman",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF262422),
            ),
            modifier = Modifier
                .width(187.dp)
                .height(24.dp)
                .padding(start = 113.dp, end = 112.dp,top=258.dp, bottom = 545.dp)
        )
        Text(
            text = "PRODUCT DESIGN",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFABABAB),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(119.dp)
                .height(17.dp)
                .padding(start = 147.dp, end = 130.dp, top=290.dp, bottom = 520.dp)
        )
        Text(
            text = "Akun Saya",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 15.6.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF262422),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(69.dp)
                .height(16.dp)
                .padding(start = 27.dp, end = 305.dp, top = 330.dp, bottom = 480.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =360.dp, end = 27.dp, bottom = 415.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.edit),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 360.dp, end = 330.dp, bottom = 415.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Edit Profil",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(65.dp)
                .height(17.dp)
                .padding(start = 70.dp, top = 380.dp, end = 30.dp, bottom = 435.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =415.dp, end = 27.dp, bottom = 365.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.lock),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 415.dp, end = 330.dp, bottom = 365.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Ganti Kata Sandi",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(65.dp)
                .height(17.dp)
                .padding(start = 70.dp, top = 432.dp, end = 30.dp, bottom = 380.dp)
        )
        Text(
            text = "Lainnya",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 15.6.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF262422),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(69.dp)
                .height(16.dp)
                .padding(start = 27.dp, end = 305.dp, top = 470.dp, bottom = 340.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =490.dp, end = 27.dp, bottom = 290.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.shopp),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 490.dp, end = 330.dp, bottom = 290.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Pesanan Saya",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(65.dp)
                .height(17.dp)
                .padding(start = 70.dp, top = 505.dp, end = 30.dp, bottom = 305.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =540.dp, end = 27.dp, bottom = 240.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.edit),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 540.dp, end = 330.dp, bottom = 240.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Bantuan",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(65.dp)
                .height(17.dp)
                .padding(start = 70.dp, top = 556.dp, end = 30.dp, bottom = 257.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 27.dp, top =590.dp, end = 27.dp, bottom = 190.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 43.dp, top = 590.dp, end = 330.dp, bottom = 190.dp)
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "Tentang Kami",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.8.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ),
            modifier = Modifier
                .width(65.dp)
                .height(17.dp)
                .padding(start = 70.dp, top = 606.dp, end = 30.dp, bottom = 205.dp)
        )

        Box(
            modifier = Modifier
                .padding(top = 660.dp, start = 42.dp, end = 42.dp, bottom = 120.dp)
                .border(width = 1.dp, color = Color(0xFF109179), shape = RoundedCornerShape(size = Variables.radiLg))
            .fillMaxWidth()
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF)),
        )
        Text(
            text = "Logout",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 19.2.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
                letterSpacing = 0.03.sp,
            ), modifier = Modifier
                .width(57.dp)
                .height(19.dp)
                .padding(top = 675.dp, start = 168.dp, end = 168.dp, bottom = 137.dp)
        )
        Row(modifier = Modifier
            .width(412.dp)
            .height(73.dp)
            .padding(start = 15.dp, top = 770.dp, end = 15.dp, bottom = Variables.spacingSm),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(1.dp)
                    .width(24.dp)
                    .height(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.menuhome),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(1.dp)
                    .width(24.dp)
                    .height(24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.keranjang),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(1.dp)
                    .width(24.dp)
                    .height(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.usr
                ),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(1.dp)
                    .width(24.dp)
                    .height(24.dp)
            )

        }
    }
    }
object Variables {
    val radiLg: Dp = 12.dp
    val spacingMd: Dp = 16.dp
    val spacingSmd: Dp = 12.dp
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greting() {
    GemahRipahTaniApp()
    ScreenProfil()
}