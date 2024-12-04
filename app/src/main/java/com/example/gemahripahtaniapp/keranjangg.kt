package com.example.gemahripahtaniapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

@Composable
fun keranjangg (
    modifier: Modifier = Modifier,

    ){
    Box (
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
    ){
        Text(
            text = "keranjang",
            color = Color.White
        )
    }
}

@Preview
@Composable

private fun komunitasssPreview(){
    GemahRipahTaniAppTheme {  }
    keranjangg()
}