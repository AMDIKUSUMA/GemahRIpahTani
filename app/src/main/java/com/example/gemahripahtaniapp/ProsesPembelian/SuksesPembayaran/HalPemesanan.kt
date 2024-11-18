package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

class HalPemesanan : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                HalScreen()
            }
        }
    }
}


@Composable
fun HalScreen() {
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
                    text = "Checkout",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    modifier = Modifier.padding(start = 8.dp, end = 210.dp, top = 30.dp)
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
                text = "Pesan Sekarang",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(start = 27.dp, end = 27.dp, top = 640.dp)
                    .width(358.dp)
                    .height(52.dp)
                    .background(
                        color = Color(0xFF109179),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(vertical = 12.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.pin),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 38.dp , end = 320.dp, top = 135.dp, bottom = 665.dp )
        )

        Text(
            text = "Alamat",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(59.dp)
                .height(24.dp)
                .padding(start = 78.dp , end = 250.dp, top = 135.dp, bottom = 665.dp )
        )
        Text(
            text = "Naufal Nurrohman | (+62) 822-8280-2082\nJl Menganti No.666, Wiyung\nSurabaya\n61258",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(334.dp)
                .height(88.dp)
                .padding(start = 39.dp, top = 170.dp, end = 39.dp, bottom = 557.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.kit),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(0.dp)
                .width(90.dp)
                .height(90.dp)
                .padding(start = 27.dp, top = 283.5.dp, end = 279.dp, bottom = 442.dp)
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
                .padding(start = 120.dp, top = 300.dp, end = 49.dp, bottom = 510.dp)
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
                .padding(start = 120.dp, top = 320.dp, end = 49.dp, bottom = 490.dp)
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
                .padding(start = 120.dp, top = 350.dp, end = 220.dp, bottom = 450.dp)
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
                .padding(start = 190.dp, top = 350.dp, end = 190.dp, bottom = 450.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.truck),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 38.dp, end = 340.dp, top = 400.dp , bottom = 400.dp )

        )
        Text(
            text = "Opsi pengiriman",

            // body/Medium/regular
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(134.dp)
                .height(24.dp)
                .padding(start = 60.dp, end = 215.dp, top = 400.dp , bottom = 400.dp )
        )
        Text(
            text = "Pengiriman standar\nPengiriman pada Senin, 28 Oktober\nRp 2.500",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(334.dp)
                .height(63.dp)
                .padding(start = 60.dp, end = 115.dp, top = 430.dp , bottom = 345.dp )
        )

        Image(
            painter = painterResource(id = R.drawable.panah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(16.dp)
                .height(16.dp)
                .padding(start = 320.dp, end = 50.dp, top = 400.dp , bottom = 405.dp )
        )
        Image(
            painter = painterResource(id = R.drawable.credit),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 38.dp, end = 340.dp, top = 490.dp , bottom = 310.dp )
        )
        Text(
            text = "Metode Pembayaran",

            // body/Medium/regular
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(169.dp)
                .height(24.dp)
                .padding(start = 60.dp, end = 185.dp, top = 495.dp , bottom = 315.dp )
        )
        Image(
            painter = painterResource(id = R.drawable.panah),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(16.dp)
                .height(16.dp)
                .padding(start = 320.dp, end = 50.dp, top = 490.dp , bottom = 310.dp )
        )
        Text(
            text = "Virtual Account\nMandiri",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(334.dp)
                .height(44.dp)
                .padding(start = 60.dp, end = 220.dp, top = 520.dp , bottom = 270.dp )
        )
        Text(
            text = "Ringkasan Pesanan",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF363B4B),
            ),
            modifier = Modifier
                .width(142.dp)
                .height(21.dp)
                .padding(start = 45.dp, end = 220.dp, top = 570.dp , bottom = 230.dp )

        )
        Image(
            painter = painterResource(id = R.drawable.down),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(1.dp)
                .width(24.dp)
                .height(24.dp)
                .padding(start = 310.dp, end = 50.dp, top = 560.dp , bottom = 250.dp )
        )
        Text(
            text = "Kit Hidroponik",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(96.dp)
                .height(22.dp)
                .padding(start = 39.dp, end = 260.dp, top = 605.dp , bottom = 200.dp )

        )
        Text(
            text = "Biaya Pengiriman",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(123.dp)
                .height(22.dp)
                .padding(start = 39.dp, end = 240.dp, top = 640.dp , bottom = 170.dp )
        )
        Text(
            text = "Biaya Layanan",

            // body/Small/regular
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(103.dp)
                .height(22.dp)
                .padding(start = 39.dp, end = 240.dp, top = 675.dp , bottom = 140.dp )
        )
        Text(
            text = "Total",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF232323),
            ),
            modifier = Modifier
                .width(36.dp)
                .height(21.dp)
                .padding(start = 39.dp, end = 300.dp, top = 710.dp , bottom = 100.dp )
        )
        Text(
            text = "Rp 62.500",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(70.dp)
                .height(21.dp)
                .padding(start = 290.dp, end = 30.dp, top = 605.dp , bottom = 200.dp )
        )
        Text(
            text = "Rp 2.500",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(61.dp)
                .height(21.dp)
                .padding(start = 290.dp, end = 30.dp, top = 640.dp , bottom = 170.dp )
        )
        Text(
            text = "Rp 1.000",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(58.dp)
                .height(21.dp)
                .padding(start = 290.dp, end = 30.dp, top = 675.dp , bottom = 135.dp )
        )
        Text(
            text = "Rp 66.000",

            // body/Small/bold
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(71.dp)
                .height(21.dp)
                .padding(start = 290.dp, end = 30.dp, top = 710.dp , bottom = 100.dp )
        )



    }


}







@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
    HalScreen()
}
