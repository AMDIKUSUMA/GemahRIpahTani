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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

//import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp
//import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        HeaderSection()
        SearchBar()
        GuideBanner()
        ProductSection(title = "Produk Terpopuler")
        ProductSection(title = "Produk Terbaru")
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .width(412.dp)
            .height(184.dp)
            .background(color = Color(0xFF109179), shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 2.dp, bottomEnd = 2.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text("Welcome", color = Color.White, style = MaterialTheme.typography.bodyLarge)
            Text(
                "Naufal Nurrohman",
                color = Color.White,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.dian), // Replace with your icon
            contentDescription = "User Profile",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Composable
fun SearchBar() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = { Text("Search") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon"
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
    )
}

@Composable
fun GuideBanner() {
    Card(
        shape = RoundedCornerShape(8.dp),

        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.mask5), // Replace with your icon
                contentDescription = "Guide Icon",
                modifier =Modifier
                    .padding(0.dp)
                    .width(175.1658.dp)
                    .height(136.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
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
                        .padding(end = 10.dp)
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
                )
            }
        }
    }
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
            Text("See More", color = Color(0xFF6D6D6D))
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(3) { index ->
                ProductCard()
            }
        }
    }
}

@Composable
fun ProductCard() {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.size(150.dp, 200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.hidroponik), // Replace with your image
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("Kit Hidroponik Pemula", color = Color(0xFF000000), fontWeight = FontWeight.Bold)
            Text("Peralatan Hidroponik", fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text("Rp 62.500", color = Color(0xFF117462), fontWeight = FontWeight.Bold)
        }

    }
}

