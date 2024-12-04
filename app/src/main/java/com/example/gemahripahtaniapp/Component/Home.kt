package com.example.gemahripahtaniapp.Component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gemahripahtaniapp.R

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()
                HomeScreen(navController = navController)
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        )
        {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(Color(0xFF109179))
            ) {
                Text(
                    text = "Welcome",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp, top = 40.dp)
                )
                Text(
                    text = "Naufal Nurrohman",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp, top = 60.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.naufal2),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.TopEnd)
                        .padding(end = 16.dp, top = 40.dp)
                        .clickable {
                            navController.navigate("profile")}
                )
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 100.dp)
                        .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(18.dp))
                        .width(358.dp)
                        .height(50.dp)
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(18.dp))
                        .padding(horizontal = 12.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "Search icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Search",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFFBABABA),
                            letterSpacing = 0.2.sp,
                        )
                    )
                }


            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.mask5), // Pastikan file ada
                    contentDescription = "Panduan Image",
                    modifier = Modifier
                        .size(170.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    ClickableText(
                        text = AnnotatedString("Panduan Hidroponik"),
                        onClick = { navController.navigate("edukasi") },
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        ),
                        modifier = Modifier
                            .width(185.dp)
                            .height(50.dp)
                            .padding(end = 30.dp)
                    )
                    Text(
                        text = "Pelajari dasar hidroponik",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        ),
                        modifier = Modifier
                            .width(179.dp)
                            .height(17.dp)

                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Produk Terpopuler
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Produk Terpopuler",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                ClickableText(
                    text = AnnotatedString("See More"),
                    onClick = { navController.navigate("ecommerceScreen") },
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF6D6D6D)
                    )
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(3) {
                    Box(
                        modifier = Modifier
                            .width(180.dp)
                            .height(250.dp)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hidroponik),
                            contentDescription = "Gambar Hidroponik",
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .width(148.dp)
                                .height(125.dp)
                                .clickable {
                                    navController.navigate("produk")}
                        )
                        Column(
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(top = 140.dp),
                        )
                        {
                            ClickableText(
                                text = AnnotatedString("Kit Hidroponik Pemula"),
                                onClick = {
                                    navController.navigate("produk")},
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.Black
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "Peralatan Hidroponik",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Gray
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(
                                    text = "Rp 62.500",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF117462)
                                    )
                                )
                                Spacer(modifier = Modifier.width(36.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.star),
                                        contentDescription = "Star Rating",
                                        modifier = Modifier.size(12.dp)
                                    )
                                    Text(
                                        text = "4.9",
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = Color.Black
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Produk Terbaru",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF1F2933),
                    ),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                ClickableText(
                    text = AnnotatedString("See More"),
                    onClick = { navController.navigate("infoEdu") },
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF6D6D6D)
                    )
                )

            }
// box 2
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(3) {
                    Box(
                        modifier = Modifier
                            .width(180.dp)
                            .height(250.dp)
                            .padding(8.dp)
                    ) {
                        // Gambar utama
                        Image(
                            painter = painterResource(id = R.drawable.hidrotani),
                            contentDescription = "Gambar Hidrotani",
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .width(148.dp)
                                .height(135.dp)
                        )

                        Column(
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(top = 150.dp),
                        ) {
                            Text(
                                text = "Rockwooi",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.Black
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "Nutrisi dan Media Tanam",
                                style = TextStyle(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xFF878787)
                                )
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(
                                    text = "Rp 120.000",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF117462)
                                    )
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.star),
                                        contentDescription = "Star Icon",
                                        modifier = Modifier.size(11.dp)
                                    )

                                    Text(
                                        text = "4.9",
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = Color.Black
                                        )
                                    )
                                }
                            }
                        }

                    }
                }
            }




            Spacer(modifier = Modifier.height(46.dp))

        }

    }
}



@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}
