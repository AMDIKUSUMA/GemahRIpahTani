package com.example.gemahripahtaniapp.ProsesPembelian

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.draw.alpha
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

class kranjang : ComponentActivity() {
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
fun Kranjangcreen(navController: NavHostController) {
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
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
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
                Text(
                    text = "Pilih Pengiriman",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    modifier = Modifier
                        .padding(start = 48.dp, end = 210.dp, top = 41.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.kiri),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 8.dp, end = 330.dp, top = 40.dp)
                        .width(24.dp)
                        .height(24.dp)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hidroponik),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(start = 60.dp, end = 10.dp)
                    )

                    Spacer(modifier = Modifier.width(0.dp)) // Jarak antara gambar dan teks harga

                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Kit Hidroponik Pemula",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                letterSpacing = 0.2.sp,
                            ),
                            modifier = Modifier
                                .width(224.dp)
                                .height(24.dp)
                        )
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
                            Button(
                                onClick = { Log.i("Action", "Minus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "-",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 28.8.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF1D1F22),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .width(20.dp)
                                    .wrapContentHeight()
                            )

                            Button(
                                onClick = { Log.i("Action", "Plus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "+",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hal55),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(start = 60.dp, end = 10.dp)
                    )

                    Spacer(modifier = Modifier.width(0.dp)) // Jarak antara gambar dan teks harga

                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Strawberry Putih",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                letterSpacing = 0.2.sp,
                            ),
                            modifier = Modifier
                                .width(224.dp)
                                .height(24.dp)
                        )
                        Text(
                            text = "Rp 295.000",
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
                            Button(
                                onClick = { Log.i("Action", "Minus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "-",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 28.8.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF1D1F22),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .width(20.dp)
                                    .wrapContentHeight()
                            )

                            Button(
                                onClick = { Log.i("Action", "Plus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "+",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(start = 60.dp, end = 10.dp)
                    )

                    Spacer(modifier = Modifier.width(0.dp)) // Jarak antara gambar dan teks harga

                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Roclwool Hidroponik Be Grow",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                letterSpacing = 0.2.sp,
                            ),
                            modifier = Modifier
                                .width(224.dp)
                                .height(34.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Rp 68.000",
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
                            Button(
                                onClick = { Log.i("Action", "Minus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "-",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 28.8.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF1D1F22),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .width(20.dp)
                                    .wrapContentHeight()
                            )

                            Button(
                                onClick = { Log.i("Action", "Plus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "+",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.nutrisi),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(start = 60.dp, end = 10.dp)
                    )

                    Spacer(modifier = Modifier.width(0.dp)) // Jarak antara gambar dan teks harga

                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Pupuk POC Nasa",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                letterSpacing = 0.2.sp,
                            ),
                            modifier = Modifier
                                .width(224.dp)
                                .height(24.dp)
                        )
                        Text(
                            text = "Rp 50.000",
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
                            Button(
                                onClick = { Log.i("Action", "Minus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "-",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 28.8.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF1D1F22),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .width(20.dp)
                                    .wrapContentHeight()
                            )

                            Button(
                                onClick = { Log.i("Action", "Plus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "+",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hal2),
                        contentDescription = "image description",
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(start = 60.dp, end = 10.dp)
                    )

                    Spacer(modifier = Modifier.width(0.dp)) // Jarak antara gambar dan teks harga

                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .wrapContentWidth()
                            .fillMaxHeight()
                    ) {
                        ClickableText(
                            text = AnnotatedString("Selang PE"),
                            onClick = {
                                navController.navigate("infoEdu")
                            },
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                                letterSpacing = 0.2.sp,
                            ),
                            modifier = Modifier
                                .width(224.dp)
                                .height(24.dp)
                        )
                        Text(
                            text = "Rp 100.000",
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
                            Button(
                                onClick = { Log.i("Action", "Minus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "-",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 28.8.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF1D1F22),
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .width(20.dp)
                                    .wrapContentHeight()
                            )

                            Button(
                                onClick = { Log.i("Action", "Plus clicked") },
                                modifier = Modifier.size(32.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFE0E0E0
                                    )
                                ),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    "+",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Total 1 Items",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        letterSpacing = 0.2.sp,
                    ),
                    modifier = Modifier
                        .alpha(0.6f)
                        .width(179.dp)
                        .height(20.dp)
                        .padding(start = 58.dp)
                )
                Spacer(modifier = Modifier.width(95.dp))
                Text(
                    text = "Rp 62.500",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Right,
                        letterSpacing = 0.2.sp,
                    ),
                    modifier = Modifier
                        .width(88.dp)
                        .height(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
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
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                {
                    Text(
                        text = "Check Out",
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPre() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    Kranjangcreen(navController = navController)
}
