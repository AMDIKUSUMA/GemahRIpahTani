package com.example.gemahripahtaniapp.SplashScreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.layout.ContentScale
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
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class BerhasilUbah : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniAppTheme {  }
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
fun UbahScreen(navController: NavHostController)
{

    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
        {
            Image(
            painter = painterResource(id = R.drawable.akun),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(375.dp)
                    .height(449.dp)
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = "Password berhasil di ubah",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 50.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                ),
                modifier = Modifier
                    .width(334.dp)
                    .height(30.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Anda akan dialihkan ke halaman login dengan mengetuk tombol masuk",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF9A9A9A),
                ),
                modifier = Modifier
                    .width(339.dp)
                    .height(30.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    Log.i("Credential", "email : $email password : $password")
                    navController.navigate("ecommerce")
                },
                modifier = Modifier
                    .width(339.dp)
                    .height(52.dp)
                    .shadow(elevation = 4.dp, shape = RoundedCornerShape(8.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF109179)
                ),
                shape = RoundedCornerShape(8.dp)
            )
            {
                Text(
                    text = "Masuk",
                    color = Color.White
                )
            }
        }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreviw() {
    GemahRipahTaniApp()
    val navController = rememberNavController()
    UbahScreen(navController = navController)
    }
