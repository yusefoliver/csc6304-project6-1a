package com.yusefoliver.isaiaholiverdiceroller
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var diceRoll by remember { mutableStateOf(1) }
            Scaffold {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { diceRoll = Random.nextInt(1, 7) },
                        modifier = Modifier
                            .padding(bottom = 32.dp)
                            .fillMaxWidth(0.5f)
                    ) {
                        Text("Roll Dice")
                    }
                }
            }
        }
    }
}
