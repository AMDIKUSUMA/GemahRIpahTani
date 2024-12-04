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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.MainApp

class OpsiBayar : ComponentActivity() {
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
fun BayarScreen(navController: NavHostController) {
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
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .verticalScroll(scrollState)
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
                            navController.navigate("pemesanan")}
                )
                Text(
                    text = "Pilih Pembayaran",
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
            Spacer(modifier = Modifier.height(30.dp)
            )
            Text(
                text = "E - Wallet",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF40434D),
                ),
                modifier = Modifier
                    .width(222.dp)
                    .height(22.dp)
                    .padding(start = 20.dp)
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 26.dp, top = 20.dp)
            ){
                Text(
                    text = "DANA",

                    // body/Large/bold
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF232323),
                    ),
                    modifier = Modifier
                        .width(212.dp)
                        .height(27.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.radio),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 120.dp,)
                        .width(16.dp)
                        .height(16.dp)
                )
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 26.dp, top = 20.dp)
            ){
                Text(
                    text = "OVO",

                    // body/Large/bold
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF232323),
                    ),
                    modifier = Modifier
                        .width(212.dp)
                        .height(27.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.radio),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 120.dp,)
                        .width(16.dp)
                        .height(16.dp)
                )
            }
            Spacer(modifier = Modifier.height(30.dp)
            )
            Text(
                text = "Virtual Account",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF40434D),
                ),
                modifier = Modifier
                    .width(222.dp)
                    .height(22.dp)
                    .padding(start = 20.dp)
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 26.dp, top = 20.dp)
            ){
                Text(
                    text = "MANDIRI",

                    // body/Large/bold
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF232323),
                    ),
                    modifier = Modifier
                        .width(212.dp)
                        .height(27.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.radiohitam),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 120.dp,)
                        .width(16.dp)
                        .height(16.dp)
                )
            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 26.dp, top = 20.dp)
            ){
                Text(
                    text = "BNI",

                    // body/Large/bold
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF232323),
                    ),
                    modifier = Modifier
                        .width(212.dp)
                        .height(27.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.radio),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(start = 120.dp,)
                        .width(16.dp)
                        .height(16.dp)
                )
            }
            Spacer(modifier = Modifier.height(430.dp))
            Column (  modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Button(
                    onClick = {
                        Log.i("Credential", "email : $email password : $password")
                        navController.navigate("halPemesanan")
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
                        text = "Selesai",
                        color = Color.White
                    )
                }
            }
        }
    }

}




@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrev() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
    BayarScreen(navController = navController)
    }
