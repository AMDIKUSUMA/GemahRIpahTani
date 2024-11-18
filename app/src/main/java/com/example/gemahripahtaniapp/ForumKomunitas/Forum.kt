

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gemahripahtaniapp.ForumKomunitas.Variables
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SplashScreen.GemahRipahTaniApp

class Forum : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniApp ()
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ForumScreen()
            }
        }
    }
}


@Composable
fun ForumScreen() {
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
            )

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
                        text = "Forum",
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
                        .padding(top=121.dp)
                )
            }
        }
        Text(
            text = "Edukasi",
            style = TextStyle(
                fontSize = 15.48.sp,

                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(61.dp)
                .height(23.dp)
                .padding(start = 260.dp, top = 136.dp, end = 74.dp, bottom = 675.dp)
        )
        Text(
            text = "Edukasi",
            style = TextStyle(
                fontSize = 15.48.sp,

                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(61.dp)
                .height(23.dp)
                .padding(start = 260.dp, top = 136.dp, end = 74.dp, bottom = 670.dp)
        )
        Text(
            text = "Naufal Nurrohman",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.2.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF282829),
            ),
            modifier = Modifier
                .width(264.dp)
                .height(18.dp)
                .padding(46.dp, top = 186.dp, end = 210.dp, bottom = 625.dp)
        )
        Text(
            text = "Product Designer · 23h",
            style = TextStyle(
                fontSize = 13.sp,
                lineHeight = 18.2.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF636466),
            ),
            modifier = Modifier
                .width(264.dp)
                .height(18.dp)
                .padding(46.dp, top = 205.dp, end = 210.dp, bottom = 605.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.naufal),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(16.dp, top = 186.dp, end = 360.dp, bottom = 610.dp)
                .width(28.8.dp)
                .height(32.51042.dp)
        )
        Text(
            text = "Tips Sukses Menanam Sayuran Hidroponik di Lahan Sempit",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier
                .width(380.dp)
                .height(60.dp)
                .padding(start = 16.dp, top = 242.dp, end = 16.dp, bottom = 535.dp)
        )
        Text(
            text =  "Menanam sayuran hidroponik di lahan sempit bukanlah halangan jika Anda menggunakan sistem yang tepat. Sistem hidroponik vertikal, misalnya, sangat cocok untuk area yang terbatas karena memungkinkan Anda menanam lebih banyak tanaman dalam ruang yang lebih kecil. Selain itu, pilihlah jenis sayuran yang cepat tumbuh seperti selada, bayam, atau kangkung, karena tanaman ini membutuhkan waktu yang relatif singkat untuk dipanen. \n\nJangan lupa untuk memanfaatkan cahaya matahari dengan optimal atau, jika berada di dalam ruangan, gunakan lampu grow light untuk memastikan tanaman mendapatkan pencahayaan yang cukup. \n\nTerakhir, selalu perhatikan keseimbangan nutrisi dalam air dan lakukan penggantian air secara rutin agar tanaman tetap tumbuh subur dan sehat.",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 21.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF3D3D3D),
            ),
            modifier = Modifier
                .width(380.dp)
                .height(63.dp)
                .padding(start = 16.dp, top = 300.dp, end = 16.dp, bottom = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.hidro1),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(412.dp)
                .height(200.dp)
                .padding(start = 5.dp, end = 5.dp, top = 702.dp)
        )
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun GreetingPreview() {
    GemahRipahTaniApp ()
    ForumScreen()
}
