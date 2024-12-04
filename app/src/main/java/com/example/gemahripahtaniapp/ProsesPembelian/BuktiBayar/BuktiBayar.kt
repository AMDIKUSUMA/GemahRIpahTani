package com.example.gemahripahtaniapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
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
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class SuksesBayar1 : ComponentActivity() {
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
fun SuksesScreen(navController: NavHostController ) {
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
        color = MaterialTheme.colorScheme.background)
    {
        Column (
            modifier = Modifier
                .fillMaxSize()
            .verticalScroll(scrollState)

        ){
            Spacer(modifier = Modifier.height(90.dp))
            Image(
                painter = painterResource(id = R.drawable.centang),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(start = 200.dp)
                    .width(32.dp)
                    .height(32.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Pembayaran Berhasil!",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(28.dp)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Pembayaran Anda telah berhasil dilakukan.",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF979797),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(22.dp)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Total Pembayaran",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(22.dp)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Rp 66.000",
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(400.dp)
                    .height(32.dp)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Text(
                    text = "Detail Pembayaran",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.panah),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(74.dp)
                        .height(24.dp)
                        .padding(start = 58.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Text(
                    text = "Status Pembayaran",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(250.dp)
                        .height(24.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Berhasil",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(97.dp)
                        .height(18.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Text(
                    text = "Nomor Referensi",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(25.dp))
                Text(
                    text = "000085752257",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(97.dp)
                        .height(18.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 6.dp)
            ){
                Text(
                    text = "Waktu Pembayaran",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(200.dp)
                        .height(54.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "26-10-2024, 09:30:01",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .width(134.dp)
                        .height(18.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                    verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 6.dp, end = 6.dp)
            ) {
                Text(
                    text = "Total Pembayaran",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(200.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(66.dp))
                Text(
                    text = "Rp 66.000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.End,
                    ),
                    modifier = Modifier
                        .wrapContentWidth()
                )
            }
                Spacer(modifier = Modifier.height(50.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(start = 6.dp)
            ){
                Text(
                    text = "Detail Pengiriman",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .height(24.dp)
                        .padding(start = 70.dp)
                )
                Spacer(modifier = Modifier.width(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.panah),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(74.dp)
                        .height(24.dp)
                        .padding(start = 58.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                Text(
                    text = "Estimasi Pengiriman\n\n26 Okt - 28 Okt\nKami akan mengirim pesanan paling lambat 28 Okt",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(334.dp)
                        .height(88.dp)
                        .padding(start = 60.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Text(
                        text = "Alamat Pengirim\n\nJl Menganti No.666, Wiyung, Surabaya, 61258",
                        style = TextStyle(
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        ),
                        modifier = Modifier
                            .width(334.dp)
                            .height(88.dp)
                            .padding(start = 40.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(18.dp))
            Column (  modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("ecommerce")
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
                        text = "Kembali ke Beranda",
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))


        }


    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
    SuksesScreen(navController = navController)
}


