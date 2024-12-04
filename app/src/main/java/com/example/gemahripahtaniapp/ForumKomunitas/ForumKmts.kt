package com.example.splashscreen

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.clip
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

class Komunitas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniApp ()
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
fun ForumKomunitasScreen(navController: NavHostController) {
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
                                navController.navigate("infoEdu")}
                    )
                    Image(
                        painter = painterResource(id = R.drawable.belll),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(top = 40.dp)
                            .width(24.dp)
                            .height(24.dp)
                            .clickable {
                                navController.navigate("notif")}
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow(
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp, end = 5.dp)
            ) {
                items(
                    listOf(
                        "Forum",
                        "Edukasi"
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
                                color = if (item == "Forum") Color(0xFF109179) else Color.White,
                                shape = RoundedCornerShape(size = 16.dp)
                            )
                            .padding(8.dp)
                            .padding(end = 16.dp)
                    ) {
                        if (item == "Edukasi") {
                            ClickableText(
                                text = AnnotatedString(item),
                                onClick = {
                                    navController.navigate("edukasi")
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
                                    color = Color.White, // "Forum" akan memiliki teks berwarna putih
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(28.8.dp)
                        .height(32.51042.dp)
                )
                Column {
                    Text(
                        text = "Naufal Nurrohman",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.2.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF282829),
                        ),
                        modifier = Modifier
                            .width(264.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                    Text(
                        text = "Product Designer · 23h",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.2.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF636466),
                        ),
                        modifier = Modifier
                            .width(264.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column {
                Text(
                    text = "Tips Sukses Menanam Sayuran Hidroponik di Lahan Sempit",
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(380.dp)
                        .height(60.dp)
                        .padding(start = 20.dp)
                )
                Text(
                    text = "Menanam sayuran hidroponik di lahan sempit bukanlah halangan jika Anda menggunakan sistem yang tepat. Sistem hidroponik vertikal, misalnya, sangat cocok untuk area yang terbatas karena memungkinkan Anda menanam lebih banyak tanaman dalam ruang yang lebih kecil. Selain itu, pilihlah jenis sayuran yang cepat tumbuh seperti selada, bayam, atau kangkung, karena tanaman ini membutuhkan waktu yang relatif singkat untuk dipanen. \n\nJangan lupa untuk memanfaatkan cahaya matahari dengan optimal atau, jika berada di dalam ruangan, gunakan lampu grow light untuk memastikan tanaman mendapatkan pencahayaan yang cukup. \n\nTerakhir, selalu perhatikan keseimbangan nutrisi dalam air dan lakukan penggantian air secara rutin agar tanaman tetap tumbuh subur dan sehat.",
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 21.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF3D3D3D),
                        ),
                    modifier = Modifier
                        .width(380.dp)
                        .height(412.dp)
                        .padding(start = 20.dp)
                )
                Spacer(modifier = Modifier.height(0.dp))
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.hidro1),
                        contentDescription = "Background image",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.newpost),
                        contentDescription = "Foreground image",
                        modifier = Modifier
                            .size(66.dp)
                            .clip(CircleShape)
                            .background(color = Color(0xFF109179))
                            .align(Alignment.BottomEnd)
                            .padding(16.dp)
                            .clickable {
                                navController.navigate("tambah")
                            }
                    )
                }

            }
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iconatas),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(
                    text = "150",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.2.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF117462),
                    ),
                    modifier = Modifier
                        .width(25.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.iconbawah),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.putar),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Text(
                    text = "15",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.2.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF636466),
                    ),
                    modifier = Modifier
                        .width(23.dp)
                        .height(18.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.comen),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(0.dp)
                        .width(20.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.width(105.dp))
                Image(
                    painter = painterResource(id = R.drawable.overflow),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 80.dp)
                        .width(20.dp)
                        .height(10.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,

                )
            {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(28.8.dp)
                        .height(32.51042.dp)
                )
                Column {
                    Text(
                        text = "Tambahkan Komentar...",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF929292),
                        ),
                        modifier = Modifier
                            .width(243.dp)
                            .height(18.dp)
                            .padding(start = 30.dp, top = 5.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.dian),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(28.8.dp)
                        .height(32.51042.dp)
                )
                Column {
                    Text(
                        text = "Dianatus Solehah",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.2.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF282829),
                        ),
                        modifier = Modifier
                            .width(264.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                }
            }
            Column {
                Text(
                    text = "Setuju banget, hidroponik vertikal efektif untuk lahan sempit. Saya pakai di rumah dan tetap bisa panen sayuran!",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF636466),
                    ),
                    modifier = Modifier
                        .width(274.dp)
                        .height(51.dp)
                        .padding(start = 60.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = "Like",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(85.dp)
                            .height(18.dp)
                            .padding(start = 60.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "Balas",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(43.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "23h",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0x9990949C),
                        ),
                        modifier = Modifier
                            .width(22.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                }

            }

            Spacer(modifier = Modifier.height(18.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(28.8.dp)
                        .height(32.51042.dp)
                )
                Column {
                    Text(
                        text = "Amdy Kuzuma",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.2.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF282829),
                        ),
                        modifier = Modifier
                            .width(264.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                }
            }
            Column {
                Text(
                    text = "Untuk menanam di lahan sempit, sistem vertikal memang solusi terbaik. Terima kasih atas informasinya!",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF636466),
                    ),
                    modifier = Modifier
                        .width(274.dp)
                        .height(51.dp)
                        .padding(start = 60.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = "Like",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(85.dp)
                            .height(18.dp)
                            .padding(start = 60.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "Balas",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(43.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "23h",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0x9990949C),
                        ),
                        modifier = Modifier
                            .width(22.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.height(18.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.dwiki),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(28.8.dp)
                        .height(32.51042.dp)
                )
                Column {
                    Text(
                        text = "Dwiki Deandra",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.2.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF282829),
                        ),
                        modifier = Modifier
                            .width(264.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                }
            }
            Column {
                Text(
                    text = "Sistem vertikal memang solusi terbaik buat lahan terbatas. Hasilnya tetap maksimal meski ruang sempit",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.8.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF636466),
                    ),
                    modifier = Modifier
                        .width(274.dp)
                        .height(51.dp)
                        .padding(start = 60.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    Text(
                        text = "Like",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(85.dp)
                            .height(18.dp)
                            .padding(start = 60.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "Balas",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3C3C3C),
                        ),
                        modifier = Modifier
                            .width(43.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                    Text(
                        text = "·",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(4.dp)
                            .height(14.dp)
                            .padding(start = 1.dp)
                    )
                    Text(
                        text = "23h",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0x9990949C),
                        ),
                        modifier = Modifier
                            .width(22.dp)
                            .height(18.dp)
                            .padding(start = 5.dp)
                    )
                }

            }

            Spacer(modifier = Modifier.height(128.dp))


            

        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
    ForumKomunitasScreen(navController = navController)
}



