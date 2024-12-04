package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import android.util.Log
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
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


class ProsesBeli : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp()

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
fun BeliScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
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
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 0.dp, end = 330.dp,)
                        .width(200.dp)
                        .height(24.dp)
                        .clickable {
                            navController.navigate("kranjang")}
                )
                Text(
                    text = "Checkout",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 26.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier
                        .width(323.dp)
                        .height(20.dp)
                        .padding(start = 21.dp, end = 38.dp)
                )
            }
            Spacer(modifier = Modifier.height(26.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pin),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(74.dp)
                        .height(24.dp)
                        .padding(start = 18.dp,)
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
                        .width(230.dp)
                        .height(24.dp)
                        .padding(start = 0.dp, top = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.panah),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(54.dp)
                        .height(24.dp)
                        .padding(start = 38.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp)
            ) {

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
                        .padding(start = 39.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 36.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hidroponik),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(150.dp)
                                .height(120.dp)
                                .padding(end = 26.dp)
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.wrapContentWidth()
                        ) {
                            Text(
                                text = "Kit Hidroponik Pemula",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF000000),
                                    letterSpacing = 0.2.sp,
                                ),
                                modifier = Modifier.wrapContentHeight()
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "Rp 62.500",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF000000)
                                )
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(
                                    text = "Jumlah",

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
                                )
                                Text(
                                    text = "1",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF232323),
                                        textAlign = TextAlign.Center,
                                    ),
                                    modifier = Modifier
                                        .width(6.dp)
                                        .height(21.dp)
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(36.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 6.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.truck),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(74.dp)
                            .height(24.dp)
                            .padding(start = 14.dp)
                    )
                    ClickableText(
                        text = AnnotatedString("Opsi Pengirim"),
                        onClick = {
                            navController.navigate("opsiPengirim")
                        },
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(140.dp)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 20.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.merah),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(124.dp)
                            .height(24.dp)
                            .padding(start = 0.dp, end = 110.dp, top = 5.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.panah),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(54.dp)
                            .height(24.dp)
                            .padding(start = 8.dp, end = 30.dp)
                    )
                }
                Spacer(modifier = Modifier.height(36.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 6.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.credit),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(74.dp)
                            .height(24.dp)
                            .padding(start = 14.dp)
                    )
                    Text(
                        text = "Metode Pembayaran",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.panah),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(54.dp)
                            .height(24.dp)
                            .padding(start = 8.dp, end = 30.dp)
                    )
                }
                Spacer(modifier = Modifier.height(46.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 56.dp)
                ) {

                    Text(
                        text = "Ringkasan Pesanan",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.down),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(54.dp)
                            .height(24.dp)
                            .padding(start = 8.dp, end = 30.dp)
                    )
                }
                Spacer(modifier = Modifier.height(46.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 36.dp)
                ) {
                    Text(
                        text = "Kit Hidroponik",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Text(
                        text = "Rp 62.500",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(21.dp)
                    )
                }
                Spacer(modifier = Modifier.height(26.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 36.dp)
                ) {
                    Text(
                        text = "Biaya Pengiriman",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Text(
                        text = "Rp 2.500",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(21.dp)
                    )
                }
                Spacer(modifier = Modifier.height(26.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 36.dp)
                ) {
                    Text(
                        text = "Biaya Layanan ",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Text(
                        text = "Rp 1.000",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(21.dp)
                    )
                }
                Spacer(modifier = Modifier.height(26.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 36.dp)
                ) {
                    Text(
                        text = "Total",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .height(24.dp)
                            .padding(top = 5.dp, end = 30.dp)
                    )
                    Text(
                        text = "Rp 66.000",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(21.dp)
                    )
                }

            }
              Spacer(modifier = Modifier.height(60.dp))
            Column (  modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("prosesBeli")
                    },
                    modifier = Modifier
                        .width(339.dp)
//                    .padding(top = 30.dp, start = 26.dp, end = 0.dp)
                        .height(52.dp)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFBABECC)
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                {
                    Text(
                        text = "Pesan Sekarang",
                        color = Color.White
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greting() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    BeliScreen(navController = navController)
    }
