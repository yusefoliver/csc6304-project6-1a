package com.yusefoliver.isaiaholiverdiceroller
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var diceRoll by remember { mutableStateOf(1) }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Dice Roll: $diceRoll", style = MaterialTheme.typography.headlineMedium)
                Button(onClick = { diceRoll = Random.nextInt(1, 7) }) {
                    Text("Roll Dice")
                }
            }
        }
    }
}
