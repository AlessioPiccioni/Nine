package com.piccionialessio.nine

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.piccionialessio.nine.model.Match
import com.piccionialessio.nine.model.MatchViewModel
import com.piccionialessio.nine.screens.GameScreen
import com.piccionialessio.nine.ui.theme.NineTheme
import com.piccionialessio.nine.ui.theme.background

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val vm: MatchViewModel = ViewModelProvider(this).get(MatchViewModel::class.java)
            /*vm.match.observe(this) {
                it.permutation[0]
            }*/
            NineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = background
                ) {
                    GameScreen(vm)

                }
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
    NineTheme {
        Greeting("Android")
    }
}