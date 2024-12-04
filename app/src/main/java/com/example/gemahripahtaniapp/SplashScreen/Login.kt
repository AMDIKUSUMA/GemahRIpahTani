package com.example.gemahripahtaniapp.SplashScreen

import android.os.Bundle
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.akun.EdukasiScreen
import com.example.gemahripahtani.ProdukScreen
import com.example.gemahripahtaniapp.Component.HomeScreen
import com.example.gemahripahtaniapp.ForumKomunitas.InformasiEdukasi.EduScreen
import com.example.gemahripahtaniapp.ForumKomunitas.InformasiEdukasi.NotifScreen
import com.example.gemahripahtaniapp.ForumKomunitas.KomunitasScreen
import com.example.gemahripahtaniapp.ForumKomunitas.tambahpost.PostingScreen
import com.example.gemahripahtaniapp.Marketplace.EcomMarketScreen
import com.example.gemahripahtaniapp.Marketplace.MainEcomm
import com.example.gemahripahtaniapp.Marketplace.MainMarketScreen
import com.example.gemahripahtaniapp.Marketplace.MarketScreen
import com.example.gemahripahtaniapp.Profil.ProfilScreen
import com.example.gemahripahtaniapp.Profil.SandiScreen
import com.example.gemahripahtaniapp.ProsesPembelian.BayarScreen
import com.example.gemahripahtaniapp.ProsesPembelian.BeliScreen
import com.example.gemahripahtaniapp.ProsesPembelian.BuktiBayar.UploadScreen
import com.example.gemahripahtaniapp.ProsesPembelian.HalScreen
import com.example.gemahripahtaniapp.ProsesPembelian.Kranjangcreen
import com.example.gemahripahtaniapp.ProsesPembelian.OpsiScreen
import com.example.gemahripahtaniapp.ProsesPembelian.Pembayaran.KonfirScreen
import com.example.gemahripahtaniapp.ProsesPembelian.Pembayaran.LoadScreen
import com.example.gemahripahtaniapp.ProsesPembelian.PemesananScreen
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.SuksesScreen
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme
import com.example.splashscreen.ForumKomunitasScreen

//import com.example.splashscreen.ForumScreen

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GemahRipahTaniAppTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController = navController) }
        composable("masuk") { MasukScreenn(navController = navController) }
        composable("akun") { AkunScreen(navController = navController) }
        composable("berhasil") { BerhasilScreen(navController = navController) }
        composable("password") { PwScreen(navController = navController) }
        composable("aturPassword") { AturScreen( navHostController = navController) }
        composable("berhasilUbah") { UbahScreen(navController = navController) }
        composable("ecommerce") { HomeScreen(navController = navController) }
        composable("ecommerceScreen") { EcomMarketScreen(navController = navController) }
        composable("market") { MarketScreen(navHostController = navController) }
        composable("mainEcommerce") { MainEcomm(navHostController = navController) }
        composable("mainMarketScreen") { MainMarketScreen(navHostController = navController) }
        composable("produk") { ProdukScreen(navHostController = navController) }
        composable("kranjang") { Kranjangcreen(navController = navController) }
        composable("prosesBeli") { BeliScreen(navController = navController) }
        composable("pemesanan") { PemesananScreen(navController = navController) }
        composable("opsiPengirim") { OpsiScreen(navController = navController) }
        composable("opsiBayar") { BayarScreen(navController = navController) }
        composable("halPemesanan") { HalScreen(navController = navController) }
        composable("LoadScreen") { LoadScreen(navController = navController) }
        composable("konfirPembayaran") { KonfirScreen(navController = navController) }
        composable("Upload") { UploadScreen(navController = navController) }

        composable("bayar1") { SuksesScreen(navController = navController) }
       // composable("bayar2") { PembayaranScreen(navController = navController) }
       //composable("bayar3") { SuksesScreen(navController = navController) }
       // composable("bayar4") { SuksesScreen(navController = navController) }

        composable("profile") { ProfilScreen(navController = navController)}
        composable("gantiSandi") { SandiScreen(navController = navController) }

        //composable("bayar3") { SuksesScreen(navController = navController) }
        composable("infoEdu") { KomunitasScreen(navController = navController) }
        composable("forum") { ForumKomunitasScreen(navController = navController) }
        composable("tambah") { PostingScreen(navController = navController) }
        composable("notif") { NotifScreen(navController = navController) }
        composable("edukasi") { EduScreen(navController = navController) }
        composable("edukasikedua") { EdukasiScreen(navController = navController) }







    }
}

@Composable
fun LoginScreen(navController: NavHostController) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logogemah),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(250.dp)
                .height(250.dp)
        )
        Spacer(modifier = Modifier.height(120.dp))
        Button(
            onClick = {
                navController.navigate("masuk")
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
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate("akun")
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
                text = "Daftar",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(120.dp))
        Text(
            text = "Lanjutkan sebagai tamu",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(148.dp)
                .height(18.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    GemahRipahTaniAppTheme {
        LoginScreen(navController = rememberNavController())
    }
}
