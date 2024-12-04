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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class EcommerceMarket : ComponentActivity() {
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
fun EcomMarketScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
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
                                navController.navigate("ecommerce")}
                        )
                        Image(
                            painter = painterResource(id = R.drawable.keranjang),
                            contentDescription = "image description",
                            modifier = Modifier
                                .padding(top = 40.dp)
                                .width(24.dp)
                                .height(24.dp)
                                .clickable {
                                    navController.navigate("kranjang")}
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
                                color = if (item == "Peralatan Hidroponik") Color(0xFF109179) else Color.White,
                                shape = RoundedCornerShape(size = Variables.radiLg)
                            )
                            .padding(8.dp)
                            .padding(end = 16.dp)
                    ) {
                        if (item == "Nutrisi dan Media Tanam") {
                            ClickableText(
                                text = AnnotatedString(item),
                                onClick = {
                                    navController.navigate("market")
                                },
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0xFF109179),
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        } else {
                            Text(
                                text = item,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = if (item == "Peralatan Hidroponik") Color.White else Color(0xFF109179),
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
                    .padding()
            )
            {
                Image(
                painter = painterResource(id = R.drawable.hidroponik),
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
                    ClickableText(
                        text = AnnotatedString("Kit Hidroponik Pemula"),
                        onClick = {
                            navController.navigate("produk")
                        },
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Peralatan Hidroponik",
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
                            text = "Rp 62.500",
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
                painter = painterResource(id = R.drawable.hal22),
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
                // Nama produk
                Text(
                    text = "Pipa Hidroponik",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Peralatan Hidroponik",
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
                    Spacer(modifier = Modifier.width(56.dp))
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
                    painter = painterResource(id = R.drawable.hal23),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 36.dp, top = 396.dp, end = 210.dp, bottom = 325.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 520.dp, end = 80.dp),
                ) {
                    Text(
                        text = "Pompa Air",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Peralatan Hidroponik",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 69.000",
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
                    painter = painterResource(id = R.drawable.hal24),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 230.dp, top = 396.dp, end = 20.dp, bottom = 325.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 230.dp, top = 520.dp),
                ) {
                    Text(
                        text = "Netpot Hidroponik",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Peralatan Hidroponik",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 45.000",
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
                    painter = painterResource(id = R.drawable.hi9),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 36.dp, top = 600.dp, end = 210.dp, bottom = 125.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 36.dp, top = 720.dp, end = 80.dp),
                ) {
                    Text(
                        text = "Instalasi Hidroponik",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Peralatan Hidroponik",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 800.000",
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

// Produk ke-6
            Box(
                modifier = Modifier
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 230.dp, top = 600.dp, end = 20.dp, bottom = 125.dp)
                        .width(148.dp)
                        .height(120.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 230.dp, top = 720.dp),
                ) {
                    Text(
                        text = "Selang PE",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Peralatan Hidroponik",
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row() {
                        Text(
                            text = "Rp 100.000",
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


object Variables {
    val radiLg: Dp = 12.dp
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevie() {
    val navController = rememberNavController()
    EcomMarketScreen(navController = navController)

    }
