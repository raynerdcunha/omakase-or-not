package com.example.omakase_or_not

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RestaurantScreen (
    onAddCount: () -> Unit,
    onRestaurantProb: (Int) -> String,
    modifier: Modifier = Modifier
) {
    var updatedCount by remember { mutableStateOf (0) }
    var updatedDisplay by remember { mutableStateOf ("You want to go to this restaurant?") }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(50.dp),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text("Omakase-Or-Not", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text(updatedDisplay)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Button(onClick = {
                onAddCount()
                updatedCount++
                updatedDisplay = onRestaurantProb(50)
                             }, shape = RoundedCornerShape(50)
            ) {
                Text("Yep !!")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                onAddCount()
                updatedCount++
                updatedDisplay = onRestaurantProb(20)
            }, shape = RoundedCornerShape(50)
            ) {
                Text("Hmm !!")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                onAddCount()
                updatedCount++
                updatedDisplay = onRestaurantProb(10)
            }, shape = RoundedCornerShape(50)
            ) {
                Text("Noo !!")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text("Clicks: $updatedCount")
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth().padding(50.dp),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text("Copyright @ Rayner Dcunha, 2026")
        }
    }
}