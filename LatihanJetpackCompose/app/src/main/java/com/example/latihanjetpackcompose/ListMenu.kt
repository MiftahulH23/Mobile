package com.example.latihanjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ListMenu(name: String, harga:Int) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 10.dp)
    ){
        Text(text = "$name",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight(600),
            color = Color.Blue,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(text = "Rp.$harga",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight(600),
            color = Color.Blue,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}