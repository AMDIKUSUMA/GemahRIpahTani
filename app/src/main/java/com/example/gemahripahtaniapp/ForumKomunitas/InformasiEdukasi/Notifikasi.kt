package com.example.gemahripahtaniapp.ForumKomunitas.InformasiEdukasi

import android.os.Bundle
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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


class Notifikasi : ComponentActivity() {
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
fun NotifScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
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
            )
            {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(93.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kiri),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(start = 18.dp)
                            .width(24.dp)
                            .height(24.dp)
                            .clickable {
                                navController.navigate("ecommerce")}
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Notifikasi",
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 26.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                        ),
                        modifier = Modifier
                            .padding(top = 2.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.notice),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Produk baru untuk kebutuhan hidroponik Anda sudah tersedia! Segera cek di halaman toko.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier
                                .width(263.dp)
                                .height(78.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "28/10/2024, 09.00",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier.padding(start = 58.dp, end = 8.dp)
                        )
                        Spacer(modifier = Modifier.width(118.dp))
                        Image(
                            painter = painterResource(id = R.drawable.sampah),
                            contentDescription = "icon delete",
                            modifier = Modifier
                                .width(18.24.dp)
                                .height(17.48.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chat),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Pertanyaan anda berhasil diposting! Siap menerima tanggapan yang baik dari anggota komunitas.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier
                                .width(263.dp)
                                .height(78.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "28/10/2024, 09.00",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier.padding(start = 58.dp, end = 8.dp)
                        )
                        Spacer(modifier = Modifier.width(118.dp))
                        Image(
                            painter = painterResource(id = R.drawable.sampah),
                            contentDescription = "icon delete",
                            modifier = Modifier
                                .width(18.24.dp)
                                .height(17.48.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.shopping),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Pembayaran Anda sebesar Rp 66.000 telah diterima, Terima kasih atas kepercayaan Anda.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier
                                .width(263.dp)
                                .height(78.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "28/10/2024, 09.00",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier.padding(start = 58.dp, end = 8.dp)
                        )
                        Spacer(modifier = Modifier.width(118.dp))
                        Image(
                            painter = painterResource(id = R.drawable.sampah),
                            contentDescription = "icon delete",
                            modifier = Modifier
                                .width(18.24.dp)
                                .height(17.48.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.key),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Password Anda berhasil diubah, Silakan masuk kembali.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier
                                .width(263.dp)
                                .height(78.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "28/10/2024, 09.00",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier.padding(start = 58.dp, end = 8.dp)
                        )
                        Spacer(modifier = Modifier.width(118.dp))
                        Image(
                            painter = painterResource(id = R.drawable.sampah),
                            contentDescription = "icon delete",
                            modifier = Modifier
                                .width(18.24.dp)
                                .height(17.48.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bell),
                            contentDescription = "image description",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Selamat, akun Anda berhasil dibuat! Anda dapat masuk sekarang.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier
                                .width(263.dp)
                                .height(78.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "28/10/2024, 09.00",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 26.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            ),
                            modifier = Modifier.padding(start = 58.dp, end = 8.dp)
                        )
                        Spacer(modifier = Modifier.width(118.dp))
                        Image(
                            painter = painterResource(id = R.drawable.sampah),
                            contentDescription = "icon delete",
                            modifier = Modifier
                                .width(18.24.dp)
                                .height(17.48.dp)
                        )
                    }
                }
            }



        }



    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevi() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
        NotifScreen(navController = navController)
    }