package com.piccionialessio.nine.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.piccionialessio.nine.R

@Preview(showBackground = true)
@Composable
fun GameScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .size(24.dp))
        Text(text = stringResource(R.string.guess_the_permutation))
        Row1()
        Guess()
        Distance()
        Guess()
    }
}

@Preview(showBackground = true)
@Composable
fun Row1() {
    var intArray = Array<Int>(9, { it -> 0 })
    LazyRow(
        modifier = Modifier
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        itemsIndexed(intArray) { index, item ->
            Card(
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Color.Blue),
                modifier = Modifier
                    .size(40.dp, 40.dp)
                    .padding(4.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Text(
                    text = "0",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .fillMaxWidth()
                        .wrapContentHeight(Alignment.CenterVertically)
                    )
            }
        }
    }
}

@Preview
@Composable
fun Guess(){
    Card(colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.padding(8.dp),

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(R.string.your_guess),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                textAlign = TextAlign.Center)
            Row1()
        }
    }
}

@Composable
fun Distance() {
    Card(colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.padding(8.dp),

        ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = stringResource(R.string.distances),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                textAlign = TextAlign.Center)
            Row1()
        }
    }
}