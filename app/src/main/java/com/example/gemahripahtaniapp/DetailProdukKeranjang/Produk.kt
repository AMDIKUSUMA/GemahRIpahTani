package com.example.gemahripahtani

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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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


class Produk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp ()
            // A surface container using the 'background' color from the theme
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
fun ProdukScreen(navHostController: NavHostController) {
    val scrollState = rememberScrollState()
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
            // Header Hijau
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .background(color = Color(0xFF109179)),
            )
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                contentAlignment = Alignment.TopStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hidroponik),
                    contentDescription = "image description",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(283.dp)
                        .align(Alignment.TopCenter)
                )
                Column(
                    modifier = Modifier
                        .padding(top = 290.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(
                        text = "Kit Hidroponik Pemula",
                        style = TextStyle(
                            fontSize = 23.sp,
                            lineHeight = 27.6.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF292929),
                        )
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                    ) {
                        Text(
                            text = "Rp 62.500",
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 24.sp,
                                fontWeight = FontWeight(600),
                                color = Color(0xFF141414),
                            )
                        )
                        Spacer(modifier = Modifier.width(110.dp))
                        Text(
                            text = "500 Penilaian",
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF666666),
                            ),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "image description",
                            modifier = Modifier
                                .padding(start = 4.dp)
                                .width(20.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "4.9",
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight(600),
                                color = Color(0xFF141414),
                            ),
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(36.dp))
            Text(
                text = "Deskripsi Produk",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 21.6.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF292929),
                ),
                modifier = Modifier
                    .padding(start = 16.dp, end = 8.dp)
            )
            Text(
                text = """
                 Kit untuk pemula hidroponik, lengkap dan siap digunakan.
                 
                 Isi Paket:
                  1. 1 pcs Baki, 31 cm x 24 cm x 11 cm (warna   sesuai varian)
                  2. Pcs Tutup (jumlah lubang sesuai varian)
                  3. 2 btl Nutrisi AB Mix, 250 ml + 250 ml, untuk 50 ltr larutan siap pakai 1000 PPM
                  4. 24 pcs Rockwool Cultilene, 2 cm x 2 cm x 2.5 cm
                  5. 12 pcs Net Pot 2.5 cm
                  6. 12 pcs Kain Flanel, 1 cm x 15 cm
                  7. 1 pack Benih HGS (3 jenis bayam atau 5 jenis sawi, sesuai varian)
                  8. 1 pcs Measuring Cup, 15 ml
                  """.trimIndent(),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF292929),
                ),
                modifier = Modifier
                    .padding(top = 8.dp, start = 16.dp, end = 8.dp)
            )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "Penilaian Produk",
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 33.6.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF141414),
                ),
                modifier = Modifier
                    .padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(26.dp))
            Image(
                painter = painterResource(id = R.drawable.productreview),
                contentDescription = "image description",
                modifier = Modifier
                .fillMaxWidth()
                .height(283.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Daftar Ulasan",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF141414),
                ),
                modifier = Modifier
                    .width(375.dp)
                    .height(22.dp)
                    .padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    Log.i("Credential", "password : $password password : $password")
                    navHostController.navigate("")
                },
                modifier = Modifier
                    .width(139.dp)
                    .height(52.dp)
                    .padding(start = 16.dp)
                    .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color(0xFF109179)
                    ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Semua",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Dengan Deskripsi",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.2.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF0B0F0E),
                ),
                modifier = Modifier
                    .width(206.dp)
                    .height(19.dp)
                    .padding(start = 40.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Produk sangat bermanfaat",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 19.6.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF141414),
                ),
                modifier = Modifier
                    .width(190.dp)
                    .height(20.dp)
                    .padding(start = 16.dp)
            )
            Text(
                text = "Oktober 24, 2024 03:29 PM",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.2.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF818B9C),
                ),
                modifier = Modifier
                    .width(256.dp)
                    .height(19.dp)
                    .padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .width(50.dp)
                        .height(40.dp)
                )
                Text(
                    text = "Amdy Kuzuma",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(206.dp)
                        .height(29.dp)
                        .padding(start = 10.dp, top = 7.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.likehijau),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "128",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(58.dp)
                        .height(19.dp)
                        .padding(top = 3.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.unlike),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Row (horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Produk sangat bermanfaat",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 19.6.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF141414),
                ),
                modifier = Modifier
                    .width(190.dp)
                    .height(20.dp)
                    .padding(start = 16.dp)
            )
            Text(
                text = "Oktober 24, 2024 03:29 PM",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.2.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF818B9C),
                ),
                modifier = Modifier
                    .width(256.dp)
                    .height(19.dp)
                    .padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .width(50.dp)
                        .height(40.dp)
                )
                Text(
                    text = "Amdy Kuzuma",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(206.dp)
                        .height(29.dp)
                        .padding(start = 10.dp, top = 7.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "128",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(58.dp)
                        .height(19.dp)
                        .padding(top = 3.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.unlike),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Row (horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Produk sangat bermanfaat",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 19.6.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF141414),
                ),
                modifier = Modifier
                    .width(190.dp)
                    .height(20.dp)
                    .padding(start = 16.dp)
            )
            Text(
                text = "Oktober 24, 2024 03:29 PM",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.2.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF818B9C),
                ),
                modifier = Modifier
                    .width(256.dp)
                    .height(19.dp)
                    .padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .width(50.dp)
                        .height(40.dp)
                )
                Text(
                    text = "Amdy Kuzuma",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(206.dp)
                        .height(29.dp)
                        .padding(start = 10.dp, top = 7.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.like),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "128",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.2.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF0B0F0E),
                    ),
                    modifier = Modifier
                        .width(58.dp)
                        .height(19.dp)
                        .padding(top = 3.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.unlike),
                    contentDescription = "image description",
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Bagian minus, angka, dan plus
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    Button(
                        onClick = {

                            Log.i("Action", "Minus clicked")
                        },
                        modifier = Modifier.size(32.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFE0E0E0)
                        ),
                        contentPadding = PaddingValues(0.dp),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text("-", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    }

                    Text(
                        text = "1",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 28.8.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF1D1F22),
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier
                            .width(20.dp)
                            .wrapContentHeight()
                    )
                    Button(
                        onClick = {

                            Log.i("Action", "Plus clicked")
                        },
                        modifier = Modifier.size(32.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFE0E0E0)
                        ),
                        contentPadding = PaddingValues(0.dp),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text("+", color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = {
                        Log.i("Credential", "password : $password password : $password")
                        navHostController.navigate("kranjang")
                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(52.dp)
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Masukan Keranjang",
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp  ()
    val navController = rememberNavController()
        ProdukScreen(navHostController = navController)
    }
