package com.example.gemahripahtaniapp.ForumKomunitas.tambahpost

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

class TambahPosting : ComponentActivity() {
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
fun PostingScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )

    {
        Column() {


            Row(
                modifier = Modifier
                    .padding(start = 10.dp, top = 40.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.clos),
                    contentDescription = "image description",
                    Modifier
                        .padding(0.dp)
                        .width(30.dp)
                        .height(30.dp)
                        .padding(top = 10.dp, start = 10.dp)
                        .clickable {
                            navController.navigate("infoEdu")}
                )
                Spacer(modifier = Modifier.width(30.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .background(color = Color(0xFF109179))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .height(25.dp)
                        .width(130.dp)
                ) {
                    Text(
                        text = "Buat Postingan",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFFFFFF)
                        ),
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .padding(top = 3.dp, start = 16.dp)
                    )
                }
                Text(
                    text = "Tambah Pertanyaan",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 19.6.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .width(246.dp)
                        .height(40.dp)
                        .padding(start = 20.dp, top = 13.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))
            Column{
                Text(
                    text = "Buat Postingan",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 25.2.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF282829),
                    ),
                    modifier = Modifier
                        .width(343.dp)
                        .height(25.dp)
                        .padding(start = 40.dp)
                )
                Spacer(modifier = Modifier.height(18.dp))
                Row (
                    modifier = Modifier
                        .padding(start = 60.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.galeri),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(18.03033.dp)
                            .height(18.03033.dp)
                            .background(color = Color(0xFF979797))
                    )
                    Image(
                        painter = painterResource(id = R.drawable.gif),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(1.dp)
                            .width(40.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.stast),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(40.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.lokasi1),
                        contentDescription = "image description",
                        modifier = Modifier
                            .padding(0.dp)
                            .width(30.dp)
                            .height(18.dp)
                            .padding(start = 10.dp)
                    )
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
                            text = "Apa yang terjadi?",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF687684),
                            ),
                            modifier = Modifier
                                .width(154.dp)
                                .height(24.dp)
                                .padding(start = 15.dp, top = 2.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(498.dp))
            Box(
                modifier = Modifier
                    .padding(start = 290.dp)

            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .background(color = Color(0xFF109179))
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .height(25.dp)
                        .width(80.dp)
                        .align(Alignment.BottomEnd)
                        .clickable {
                            navController.navigate("tambah")
                        }
                ) {
                    Text(
                        text = "Posting",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }



        }




    }

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp ()
    val navController = rememberNavController()
        PostingScreen(navController = navController)
    }
