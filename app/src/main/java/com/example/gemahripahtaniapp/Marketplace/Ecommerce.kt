package com.example.gemahripahtaniapp.Marketplace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class Ecommerce : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EcommerceScreen()
                }
            }
        }
    }


@Composable
fun EcommerceScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            // Top Bar
            Box(
                modifier = Modifier
                    .width(412.dp)
                    .height(93.dp)
                    .background(color = Color(0xFF109179))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cari),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 1.dp, top = 53.dp)
                        .width(46.dp)
                        .height(46.dp)

                )
                Image(
                    painter = painterResource(id = R.drawable.keranjang),
                    contentDescription = "image description",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(start = 360.dp, top = 53.dp)
                        .width(46.dp)
                        .height(46.dp)

                )
            }

            Spacer(modifier = Modifier.height(16.dp))


            Row(
                modifier = Modifier
                    .padding(start = 5.dp, top = 10.dp, end = 5.dp)
            ) {

                Box(
                    modifier = Modifier
                        .shadow(elevation = 1.dp, spotColor = Color(0x0A000000), ambientColor = Color(0x0A000000))
                        .shadow(elevation = 9.9.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                        .width(187.dp)
                        .height(60.dp)
                        .background(color = Color(0xFF109179), shape = RoundedCornerShape(size = Variables.radiLg))
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Peralatan Hidroponik",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFFFFFFFF),
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                // Box for "Nutrisi dan Media Tanam"
                Box(
                    modifier = Modifier
                        .shadow(elevation = 1.dp, spotColor = Color(0x0A000000), ambientColor = Color(0x0A000000))
                        .shadow(elevation = 9.9.dp, spotColor = Color(0x40000000), ambientColor = Color(0x40000000))
                        .width(187.dp)
                        .height(60.dp)
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiLg))
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Nutrisi dan Media Tanam",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF109179),
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )


                }

            }

        }
        Box(
            modifier = Modifier
                .padding(start = 22.dp, top =186.dp, end = 200.dp, bottom = 430.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hidroponik),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 34.dp, top = 196.dp, end = 210.dp, bottom = 525.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "Kit Hidroponik Pemula",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start =34.dp,top= 315.dp,end=239.dp, bottom = 480.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 34.dp, top = 350.dp, end = 250.dp, bottom = 460.dp)
        )
        Text(
            text = "Rp 62.500\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 34.dp, top = 370.dp, end = 290.dp, bottom = 440.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 165.dp, end = 210.dp, top = 375.dp, bottom = 440.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 150.dp, end = 230.dp, top = 375.dp, bottom = 440.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 205.dp, top =186.dp, end = 25.dp, bottom = 430.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hal22),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 215.dp, top = 196.dp, end = 34.dp, bottom = 525.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "Pipa Hidroponik",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start =215.dp,top= 315.dp,end=34.dp, bottom = 480.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 215.dp, top = 350.dp, end = 34.dp, bottom = 460.dp)
        )
        Text(
            text = "Rp 50.000\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 215.dp, top = 370.dp, end = 90.dp, bottom = 440.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 340.dp, end = 34.dp, top = 375.dp, bottom = 440.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 325.dp, end = 55.dp, top = 375.dp, bottom = 440.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 22.dp, top =410.dp, end = 200.dp, bottom = 200.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hal23),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 34.dp, top = 420.dp, end = 210.dp, bottom = 300.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
//pompa air
        Text(
            text = "Pompa Air",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 34.dp,top= 555.dp,end = 225.dp, bottom = 250.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 34.dp, top = 580.dp, end = 250.dp, bottom = 230.dp)
        )
        Text(
            text = "Rp 69.000\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 34.dp, top = 600.dp, end = 290.dp, bottom = 210.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 165.dp, end = 210.dp, top = 605.dp, bottom = 210.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 150.dp, end = 230.dp, top = 605.dp, bottom = 210.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 205.dp, top =410.dp, end = 25.dp, bottom = 200.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hal24),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 215.dp, top = 420.dp, end = 34.dp, bottom = 300.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "Net Pot Hidroponik",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 215.dp,top= 555.dp,end = 34.dp, bottom = 250.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 215.dp, top = 580.dp, end = 34.dp, bottom = 230.dp)
        )
        Text(
            text = "Rp 1.000\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 215.dp, top = 600.dp, end = 90.dp, bottom = 210.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 340.dp, end = 34.dp, top = 605.dp, bottom = 210.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 325.dp, end = 55.dp, top = 605.dp, bottom = 210.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 22.dp, top =640.dp, end = 200.dp, bottom = 0.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        //net hidroponik
        Image(
            painter = painterResource(id = R.drawable.hi9),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 34.dp, top = 650.dp, end = 210.dp, bottom = 70.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "Instalasi Hidroponik",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 34.dp,top= 770.dp,end = 225.dp, bottom = 40.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 34.dp, top = 790.dp, end = 250.dp, bottom = 20.dp)
        )
        Text(
            text = "Rp 800.000\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 34.dp, top = 810.dp, end = 290.dp, bottom = 0.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 165.dp, end = 210.dp, top = 815.dp, bottom = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 150.dp, end = 230.dp, top = 815.dp, bottom = 0.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 205.dp, top =640.dp, end = 25.dp, bottom = 0.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = com.example.gemahripahtaniapp.SplashScreen.Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hal2),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 215.dp, top = 650.dp, end = 34.dp, bottom = 70.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "NFT Gullies",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 215.dp,top= 770.dp,end = 34.dp, bottom = 40.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier =Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 215.dp, top = 790.dp, end = 34.dp, bottom = 20.dp)
        )
        Text(
            text = "Rp 261.400\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 215.dp, top = 810.dp, end = 90.dp, bottom = 0.dp)
        )
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(16.dp)
                .height(15.dp)
                .padding(start = 165.dp, end = 210.dp, top = 815.dp, bottom = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 340.dp, end = 34.dp, top = 815.dp, bottom = 0.dp)
                .width(11.dp)
                .height(11.dp)
        )



    }
}






object Variables {
    val radiLg: Dp = 12.dp
}


@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPrevie() {
    EcommerceScreen()

    }
