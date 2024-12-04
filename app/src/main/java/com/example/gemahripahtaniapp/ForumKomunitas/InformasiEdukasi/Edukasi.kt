package com.example.gemahripahtaniapp.ForumKomunitas.InformasiEdukasi

//import com.example.gemahripahtaniapp.ForumKomunitas.Variables
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class Edukasi : ComponentActivity() {
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
fun EduScreen(navController: NavHostController) {
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
            )
            {
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
                        contentAlignment = Alignment.Center, // Konten diatur ke tengah
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
                                color = if (item == "Edukasi") Color(0xFF109179) else Color.White, // Warna untuk "Edukasi"
                                shape = RoundedCornerShape(size = 16.dp)
                            )
                            .padding(8.dp)
                            .clickable {
                                if (item == "Forum") {
                                    navController.navigate("infoEdu") // Ganti ke halaman Forum
                                }
                            }
                    ) {
                        Text(
                            text = item,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                color = if (item == "Edukasi") Color.White else Color(0xFF109179), // Ubah warna teks
                            )
                        )
                    }
                }
            }


            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .width(18.7643.dp)
                        .height(19.22197.dp)
                )
                Text(
                    text = "Search",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF929292),
                    ),
                    modifier = Modifier
                        .width(137.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(180.dp))
                Image(
                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)

                )

            }
            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(
                    text = "List Edukasi dan Informasi",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1A1A1A),
                ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(110.dp))
                Image(
                    painter = painterResource(id = R.drawable.sort),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)
                )
                Text(
                    text = "Sort",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF1A1A1A),
                    ),
                    modifier = Modifier
                        .width(28.dp)
                        .height(21.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column {
                Image(
                    painter = painterResource(id = R.drawable.hidro4),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .width(350.dp)
                        .height(182.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                ClickableText(
                    text = AnnotatedString("Pengantar Hidroponik"),
                    onClick = {
                        navController.navigate("edukasiKedua")
                    },
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1A1A1A),
                    ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(115.dp))
                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(16.dp)
                        .height(16.dp)
                )
                Text(
                    text = "50 Reviews",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF979797),
                    ),
                    modifier = Modifier
                        .width(178.dp)
                        .height(21.dp)
                        .padding(start = 10.dp, top = 3.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Button(
                    onClick = {
                        Log.i("Credential", "password : $password password : $password")
                        navController.navigate("edukasiKedua")
                    },
                    modifier = Modifier
                        .width(350.dp)
                        .height(70.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 30.dp))
                        .padding(top = 16.dp, bottom = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "More",
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column {
                Image(
                    painter = painterResource(id = R.drawable.hidro4),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .width(350.dp)
                        .height(182.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(
                    text = "Nutrisi Tanaman Hidroponik",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1A1A1A),
                    ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(115.dp))
                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(16.dp)
                        .height(16.dp)
                )
                Text(
                    text = "50 Reviews",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF979797),
                    ),
                    modifier = Modifier
                        .width(178.dp)
                        .height(21.dp)
                        .padding(start = 10.dp, top = 3.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Button(
                    onClick = {
                        Log.i("Credential", "password : $password password : $password")
                        navController.navigate("kranjang")
                    },
                    modifier = Modifier
                        .width(350.dp)
                        .height(70.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 30.dp))
                        .padding(top = 16.dp, bottom = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "More",
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column {
                Image(
                    painter = painterResource(id = R.drawable.hidro4),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 35.dp)
                        .width(350.dp)
                        .height(182.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(
                    text = "Mengatasi Hama dan Penyakit",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1A1A1A),
                    ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(24.dp)
                        .padding(start = 20.dp, top = 2.dp)
                )
                Spacer(modifier = Modifier.width(115.dp))
                Image(
                    painter = painterResource(id = R.drawable.share),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(18.23541.dp)
                        .height(17.48447.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(16.dp)
                        .height(16.dp)
                )
                Text(
                    text = "50 Reviews",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF979797),
                    ),
                    modifier = Modifier
                        .width(178.dp)
                        .height(21.dp)
                        .padding(start = 10.dp, top = 3.dp)
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Button(
                    onClick = {
                        Log.i("Credential", "password : $password password : $password")
                        navController.navigate("kranjang")
                    },
                    modifier = Modifier
                        .width(350.dp)
                        .height(70.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = 30.dp))
                        .padding(top = 16.dp, bottom = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF109179)
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "More",
                        color = Color.White
                    )
                }
            }





            Spacer(modifier = Modifier.height(108.dp))
        }

    }
}
@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun Greet() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
    EduScreen(navController = navController)
}
