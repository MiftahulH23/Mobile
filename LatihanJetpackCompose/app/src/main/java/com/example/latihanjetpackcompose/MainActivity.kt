package com.example.latihanjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.latihanjetpackcompose.ui.theme.LatihanJetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(
                        enabled = true,
                        state = ScrollState(0)
                    )
                    .padding(20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painterResource(id =R.drawable.sederhana ),
                    contentDescription ="",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(30.dp))
                        .fillMaxWidth(1f)
                )
                Text(text = "Menu Makan",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight(800),
                    color = Color.Blue,
                    modifier = Modifier.padding(top = 10.dp)
                )
                ListMenu("Rendang", 2000)
                ListMenu("Gulai Ayam", 2000)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatihanJetpackComposeTheme {
        Greeting("Android")
    }
}