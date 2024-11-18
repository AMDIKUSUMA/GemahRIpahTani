package com.example.gemahripahtaniapp.Home

//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.text.style.TextAlign
//import com.example.gemahripahtaniapp.Marketplace.Variables
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
import com.example.gemahripahtaniapp.SplashScreen.Variables

//import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
//import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                HomeScreen()
            }
        }
    }
}


@Composable
fun HomeScreen()
{
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
        Column {
            // Top Bar
            Box(
                modifier = Modifier
                    .width(412.dp)
                    .height(168.dp)
                    .background(color = Color(0xFF109179))
            )
        }
        Text(
            text = "Welcome",
            style = TextStyle(
                fontSize = 13.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF1D252C),
            ),
            modifier = Modifier
                .width(61.88572.dp)
                .height(20.dp)
                .padding(start = 16.dp, top = 54.dp, end = 320.dp, bottom = 760.dp)
        )
        Text(
            text = "Naufal Nurrohman",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1D252C),
            ),
            modifier = Modifier
                .width(380.dp)
                .height(30.dp)
                .padding(start = 16.dp, top = 72.dp, end = 70.dp, bottom = 730.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.naufal),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 340.dp, end = 18.dp, top = 54.dp, bottom = 730.dp)
                .width(37.6.dp)
                .height(42.44416.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 16.dp, top = 115.dp, end = 16.dp, bottom = 675.dp )
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 17.69458.dp))
        )
        Text(
            text = "Search",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFBABABA),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(51.dp)
                .height(20.dp)
                .padding(start = 60.dp, top = 127.dp, end = 70.dp, bottom = 680.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.search),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(0.95833.dp)
                .width(20.dp)
                .height(20.dp)
                .padding(start = 25.dp, top = 120.dp, end = 340.dp, bottom = 680.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mask5),
            contentDescription = "image description",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 30.dp, end = 200.dp,top = 205.dp, bottom = 500.dp)
                .width(175.1658.dp)
                .height(136.dp)
        )
        Text(
            text = "Panduan Hidroponik",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF1D252C),
                letterSpacing = 1.sp,
            ),
            modifier = Modifier
                .width(185.dp)
                .height(50.dp)
                .padding(209.dp, top = 237.dp, end = 18.dp, bottom = 540.dp)
        )
        Text(
            text = "Pelajari dasar hidroponik",
            style = TextStyle(
                fontSize = 11.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF1D252C),
                letterSpacing = 1.sp,
            ),
            modifier = Modifier
                .width(179.dp)
                .height(17.dp)
                .padding(209.dp, top = 300.dp, end = 18.dp, bottom = 510.dp)
        )
        Text(
            text = "Produk Terpopuler",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF1F2933),
            ),
            modifier = Modifier
                .width(166.dp)
                .height(32.dp)
                .padding(start = 14.dp, top = 370.dp, end = 212.dp, bottom = 430.dp)
        )
        Text(
            text = "See More",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF6D6D6D),
            ),
            modifier = Modifier
                .width(56.dp)
                .height(20.dp)
                .padding(start = 324.dp, top = 375.dp, end = 12.dp, bottom = 440.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 16.dp, top =415.dp, end = 230.dp, bottom = 219.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hidroponik),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 22.dp, top = 420.dp, end = 239.dp, bottom = 320.dp)
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
                .padding(start = 22.dp, top = 520.dp, end = 249.dp, bottom = 270.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 22.dp, top = 560.dp, end = 250.dp, bottom = 255.dp)
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
                .padding(start = 22.dp, top = 580.dp, end = 290.dp, bottom = 230.dp)
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
                .padding(start = 135.dp, end = 240.dp, top = 585.dp, bottom = 230.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 120.dp, end = 260.dp, top = 585.dp, bottom = 230.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 180.dp, top =415.dp, end = 60.dp, bottom = 219.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hidrotani),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 190.dp, top = 420.dp, end = 70.dp, bottom = 320.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "Rockwooi",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 190.dp, top = 520.dp, end = 70.dp, bottom = 270.dp)
        )
        Text(
            text = "Nutrisi dan Media Tanam",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 190.dp, top = 560.dp, end = 70.dp, bottom = 255.dp)
        )
        Text(
            text = "Rp 120.000\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 190.dp, top = 580.dp, end = 130.dp, bottom = 230.dp)
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
                .padding(start = 305.dp, end = 70.dp, top = 585.dp, bottom = 230.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(start = 290.dp, end = 90.dp, top = 585.dp, bottom = 230.dp)
                .width(11.dp)
                .height(11.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hidroponik),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 360.dp, top = 420.dp, end = 0.dp, bottom = 320.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        //produk populer

        Text(
            text = "Produk Terpopuler",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF1F2933),
            ),
            modifier = Modifier
                .width(166.dp)
                .height(32.dp)
                .padding(start = 22.dp, top = 630.dp, end = 212.dp, bottom = 180.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 16.dp, top =665.dp, end = 230.dp, bottom = 0.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.mask1),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 22.dp, top = 670.dp, end = 239.dp, bottom = 70.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
        Text(
            text = "100 Benih Kemangi",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(145.dp)
                .height(40.dp)
                .padding(start = 22.dp, top = 770.dp, end = 240.dp, bottom = 30.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 22.dp, top =800.dp, end = 240.dp, bottom = 15.dp)
        )
        Text(
            text = "Rp 50.500\n",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF117462),
            ),
            modifier = Modifier
                .width(90.dp)
                .height(20.dp)
                .padding(start = 22.dp, top = 815.dp, end = 290.dp, bottom = 0.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 180.dp, top =665.dp, end = 60.dp, bottom = 0.dp )
                .border(width = 1.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = Variables.radiMlg))
                .width(12.dp)
                .height(93.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.hi9),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 190.dp, top = 670.dp, end = 70.dp, bottom = 70.dp)
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
                .padding(start = 190.dp, top = 770.dp, end = 70.dp, bottom = 30.dp)
        )
        Text(
            text = "Peralatan Hidroponik",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF878787),
            ),
            modifier = Modifier
                .width(114.dp)
                .height(14.dp)
                .padding(start = 190.dp, top = 800.dp, end = 70.dp, bottom = 15.dp)
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
                .padding(start = 190.dp, top = 815.dp, end = 130.dp, bottom = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mask4),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(start = 360.dp, top = 670.dp, end = 0.dp, bottom = 70.dp)
                .width(148.99998.dp)
                .height(115.53488.dp)
        )
    }
    @Composable
    fun ProductSection(title: String) {
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(title, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodyLarge)
                Text("See More", color = Color(0xFF008000))
            }
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(5) { index ->
                    ProductCard()
                }
            }
        }
    }
}
    @Preview(showBackground = true, device = Devices.PIXEL_4)
    @Composable
    fun GreetingPreview() {
        HomeScreen()
    }

