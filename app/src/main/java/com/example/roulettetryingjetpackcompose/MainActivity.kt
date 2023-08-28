package com.example.roulettetryingjetpackcompose

import RuleScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.roulettetryingjetpackcompose.ui.theme.Green
import com.example.roulettetryingjetpackcompose.ui.theme.RouletteTryingJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RouletteTryingJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green
                ) {
                   RuleScreen()
                }
            }
        }
    }
}
