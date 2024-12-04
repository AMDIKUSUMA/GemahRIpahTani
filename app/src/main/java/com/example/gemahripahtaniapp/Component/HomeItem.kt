package com.example.gemahripahtaniapp.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gemahripahtaniapp.Model.hidroponik
import com.example.gemahripahtaniapp.R
import com.example.gemahripahtaniapp.ui.theme.GemahRipahTaniAppTheme

@Composable
fun HomeItem(
    hidroponik: hidroponik,
    modifier: Modifier = Modifier,
    onItemClicked :(Int) -> Unit
){
    Row (
       verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxSize()
            .clickable {
                onItemClicked(hidroponik.id)
            }
    ){
        Image(
            painter = painterResource(id = hidroponik.id),
            contentDescription = hidroponik.name,
            modifier = modifier.clip(CircleShape ).size(80.dp)
        )
        Spacer(
            modifier = Modifier.width(16.dp)
        )
        Column {
            Text(
                text = hidroponik.name,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(170.dp),
                maxLines = 1
            )
            Text(
                text = hidroponik.name,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(170.dp),
                maxLines = 1
            )
        }

    }
}
@Preview (showSystemUi = true)
@Composable
private fun HomeItemHorizontalPreview(){
    GemahRipahTaniAppTheme {
        HomeItem(
            hidroponik = hidroponik(id = 1, name = "amdy", R.drawable.usr),
            onItemClicked = {
                hidroponikId ->
                println("hidroponik Id $hidroponikId")
            }
        )
    }
}