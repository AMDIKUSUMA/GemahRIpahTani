package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class OpsiPengirim : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OpsiScreen()
                }
            }
        }
    }


@Composable
fun OpsiScreen() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )


    {
        Column {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .background(color = Color(0xFF109179)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Pilih Pengiriman",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    modifier = Modifier.padding(start = 48.dp, end = 210.dp, top = 30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 8.dp, end = 330.dp, top = 30.dp)
                        .width(24.dp)
                        .height(24.dp)
                )

            }

            Spacer(modifier = Modifier.height(16.dp)
            )


            Text(
                text = "Selesai",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 630.dp)
                    .width(358.dp)
                    .height(52.dp)
                    .background(
                        color = Color(0xFF109179),
                        shape = RoundedCornerShape(12.dp)

                    )
                    .padding(vertical = 12.dp)
            )
        }

        Text(
            text = "Ambil di toko",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(212.dp)
                .height(27.dp)
                .padding(start = 75.dp, top = 120.dp, bottom = 685.dp, end = 155.dp)
        )
        Text(
            text = "Tersedia hingga 3 hari setelah pemesanan",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(222.dp)
                .height(44.dp)
                .padding(start = 75.dp, top = 145.dp, bottom = 635.dp, end = 125.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radio),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 40.dp, end = 340.dp, top = 140.dp, bottom = 665.dp)
                .width(16.dp)
                .height(16.dp)

        )
        Text(
            text = "Gratis",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(56.dp)
                .height(27.dp)
                .padding(start = 290.dp, top = 140.dp, bottom = 655.dp, end = 35.dp)
        )
        Text(
            text = "Pengiriman standar",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(212.dp)
                .height(27.dp)
                .padding(start = 75.dp, top = 220.dp, bottom = 585.dp, end = 155.dp)

        )
        Text(
            text = "Pengiriman pada Senin, 28 Oktober",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(200.dp)
                .height(44.dp)
                .padding(start = 75.dp, top = 245.dp, bottom = 535.dp, end = 145.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radiohitam),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 40.dp, end = 340.dp, top = 240.dp, bottom = 565.dp)
                .width(16.dp)
                .height(16.dp)

        )
        Text(
            text = "Rp 2.500",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(78.dp)
                .height(27.dp)
                .padding(start = 290.dp, top = 240.dp, bottom = 550.dp, end = 25.dp)
        )
        Text(
            text = "Pengiriman ekspres",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(212.dp)
                .height(27.dp)
                .padding(start = 75.dp, top = 320.dp, bottom = 485.dp, end = 155.dp)
        )
        Text(
            text = "Pengiriman di hari yang sama",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF40434D),
            ),
            modifier = Modifier
                .width(183.dp)
                .height(44.dp)
                .padding(start = 75.dp, top = 345.dp, bottom = 435.dp, end = 145.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.radio),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .border(width = 2.dp, color = Color(0xFF232323))
                .padding(start = 40.dp, end = 340.dp, top = 340.dp, bottom = 465.dp)
                .width(16.dp)
                .height(16.dp)

        )
        Text(
            text = "Rp. 35.000",

            // body/Large/bold
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(95.dp)
                .height(27.dp)
                .padding(start = 290.dp, top = 340.dp, bottom = 450.dp, end = 15.dp)
        )



    }


}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp()
    OpsiScreen()
    }
