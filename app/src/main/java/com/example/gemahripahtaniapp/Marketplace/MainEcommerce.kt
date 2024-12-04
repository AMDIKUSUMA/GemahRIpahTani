package com.example.gemahripahtaniapp.Marketplace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp


class MainEcommerce : ComponentActivity() {
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
fun MainEcomm(navHostController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState) // Menambahkan scrolling vertikal
        )
        {
            // Top Bar
            Box(
                modifier = Modifier
                    .width(512.dp)
                    .height(93.dp)
                    .background(color = Color(0xFF109179))
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
                                    navHostController.navigate("ecommerce")}
                        )
                        Image(
                            painter = painterResource(id = R.drawable.keranjang),
                            contentDescription = "image description",
                            modifier = Modifier
                                .padding(top = 40.dp)
                                .width(24.dp)
                                .height(24.dp)

                        )
                    }
            }

            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
                modifier = Modifier
                    .padding(start = 5.dp, top = 10.dp, end = 5.dp)
            ) {
                items(
                    listOf(
                        "Peralatan Hidroponik",
                        "Nutrisi dan Media Tanam",
                        "Benih dan Bibit",
                        "Hasil Panen"
                    )
                ) { item ->
                    Box(
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
                                color = if (item == "Benih dan Bibit") Color(0xFF109179) else Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.Marketplace.Variables.radiLg)
                            )
                            .padding(8.dp)
                            .padding(end = 16.dp)
                    ) {
                        if (item == "Benih dan Bibit" || item == "Hasil Panen") {
                            ClickableText(
                                text = AnnotatedString(item),
                                onClick = {
                                    navHostController.navigate("mainMarketScreen")
                                },
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = if (item == "Benih dan Bibit") Color.White else Color(0xFF109179),
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        } else {
                            Text(
                                text = item,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0xFF109179),
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }


        }
        Box(
            modifier = Modifier
        )
        {
            Image(
                painter = painterResource(id = R.drawable.hi17),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(start = 36.dp, top = 196.dp, end = 210.dp, bottom = 525.dp)
                    .width(148.dp)
                    .height(120.dp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 36.dp, top = 320.dp, end = 80.dp),
            )
            {
                // Nama produk
                Text(
                    text = "10 Benih Peppermint Hidroponikr",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    ),
                    modifier = Modifier
                        .padding(end = 110.dp)
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Benih dan Bibit",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(

                ) {
                    Text(
                        text = "Rp 3.000",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF117462)
                        )
                    )
                    Spacer(modifier = Modifier.width(46.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "Star Rating",
                            modifier = Modifier.size(12.dp)
                        )
                        Text(
                            text = "4.9",
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
        )
        {
            Image(
                painter = painterResource(id = R.drawable.satu2),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(start = 230.dp, top = 196.dp, end = 20.dp, bottom = 525.dp)
                    .width(148.dp)
                    .height(120.dp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 230.dp, top = 320.dp),
            )
            {
                ClickableText(
                    text = AnnotatedString("100 Benih Selada Kribo"),
                    onClick = {
                        navHostController.navigate("mainEcommerce")
                    },
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    ),
                    modifier = Modifier
                        .padding(end = 30.dp)
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Benih dan Bibit",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(

                ) {
                    Text(
                        text = "Rp 1.000",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF117462)
                        )
                    )
                    Spacer(modifier = Modifier.width(46.dp))
                    Row(

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "Star Rating",
                            modifier = Modifier.size(12.dp)
                        )
                        Text(
                            text = "4.9",
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.satu3),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 36.dp, top = 416.dp, bottom = 315.dp, end = 210.dp,)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 540.dp, end = 80.dp),
                ) {
                    Text(
                        text = "50 Benih Pakcoy Sawi COYO",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .padding(end = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Benih dan Bibit",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 1.800",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF117462)
                            )
                        )
                        Spacer(modifier = Modifier.width(46.dp))
                        Row() {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "Star Rating",
                                modifier = Modifier.size(12.dp)
                            )
                            Text(
                                text = "4.9",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                            )
                        }
                    }
                }
            }

            Box(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hal43),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 230.dp, top = 416.dp, bottom = 315.dp, end = 20.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 230.dp, top = 540.dp),
                ) {
                    Text(
                        text = "20 Benih Keledai Edamame Jepang",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .padding(end = 30.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Benih dan Bibit",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 2.000",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF117462)
                            )
                        )
                        Spacer(modifier = Modifier.width(46.dp))
                        Row() {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "Star Rating",
                                modifier = Modifier.size(12.dp)
                            )
                            Text(
                                text = "4.8",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                            )
                        }
                    }
                }
            }
// Produk ke-5
            Box(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nutri),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 36.dp, top = 630.dp, end = 210.dp, bottom = 85.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 760.dp, end = 80.dp),
                ) {
                    Text(
                        text = "Pupuk POC Nasa",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Benih dan Bibit",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 50.000",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF117462)
                            )
                        )
                        Spacer(modifier = Modifier.width(46.dp))
                        Row() {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "Star Rating",
                                modifier = Modifier.size(12.dp)
                            )
                            Text(
                                text = "4.9",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                            )
                        }
                    }
                }
            }

// Produk ke-6
            Box(
                modifier = Modifier

            ) {
                Image(
                    painter = painterResource(id = R.drawable.hal56),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 230.dp, top = 630.dp, end = 20.dp, bottom = 85.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 230.dp, top = 760.dp),
                ) {
                    Text(
                        text = "Benih Stawberry Putih",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Benih dan Bibit",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 261.400",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF117462)
                            )
                        )
                        Spacer(modifier = Modifier.width(36.dp))
                        Row() {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "Star Rating",
                                modifier = Modifier.size(12.dp)
                            )
                            Text(
                                text = "4.9",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                            )
                        }
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    MainEcomm(navHostController = navController)
    }
