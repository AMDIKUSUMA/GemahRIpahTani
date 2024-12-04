package com.example.gemahripahtaniapp.SplashScreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class Masuk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GemahRipahTaniAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}


@Composable
fun MasukScreenn(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selamat Datang di HidroTani",
            style = TextStyle(
                fontSize = 36.sp,
                lineHeight = 50.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(339.dp)
                .height(100.dp)
        )
        Spacer(modifier = Modifier.height(26.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation()
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
        ) {
            Text(
                text = "Masuk",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(35.dp))
        ClickableText(
            text = AnnotatedString("Lupa Password"),
            onClick = { navController.navigate("password") },
            style = TextStyle(
                fontSize = 11.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
                letterSpacing = 0.59.sp,
            ),
            modifier = Modifier
                .width(95.dp)
                .height(17.dp)
        )
        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "Atau")

        Spacer(modifier = Modifier.height(25.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.fbk),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { }
            )

            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { }
            )
        }

        Spacer(modifier = Modifier.height(100.dp))

        TextButton(onClick = {}) {
            Text(
                text = "Belum punya akun? Daftar",
                modifier = Modifier.clickable { },
                color = Color(0xFF000000)
            )
        }
    }
}






@Preview(showBackground = true, device = Devices.PIXEL_6)
@Composable
fun Greetingg() {
    GemahRipahTaniAppTheme {  }
    val navController = rememberNavController()
    MasukScreenn(navController = navController)
    }
