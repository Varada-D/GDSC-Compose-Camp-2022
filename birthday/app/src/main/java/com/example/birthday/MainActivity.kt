package com.example.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthday.ui.theme.BirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = Color.White,
                    modifier = Modifier.fillMaxSize()
                ) {
                    BirthdayGreet(name = "Mitanshu", "Ashish")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreet(name: String, from: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Cake()
        Text(text = "Happy Birthday $name", fontSize = 40.sp, fontWeight = FontWeight.Bold, fontFamily  = FontFamily.Cursive)
        Text(text = "- From $from", fontSize = 30.sp, fontFamily = FontFamily.Cursive)
    }
}

@Composable
fun Cake(){
    Image(painter = painterResource(id = R.drawable.cake), contentDescription = "Birthday Cake")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayTheme {
//        Greeting("Android")
    }
}