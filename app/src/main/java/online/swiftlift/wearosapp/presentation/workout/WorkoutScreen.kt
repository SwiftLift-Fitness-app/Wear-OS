package online.swiftlift.wearosapp.presentation.workout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Stop
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text

@Composable
fun StartButton(modifier: Modifier = Modifier) {
    Chip(
        onClick = {},
        modifier = modifier,
        label = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Start Workout")
                Icon(imageVector = Icons.Rounded.PlayArrow, contentDescription = "Stop Button")
            }
        }
    )
}

@Composable
fun StopButton(modifier: Modifier = Modifier) {
    Chip(
        onClick = {},
        modifier = modifier,
        label = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Stop Workout")
                Icon(imageVector = Icons.Rounded.Stop, contentDescription = "Stop Button")
            }
        }
    )
}

@Composable
fun MainScreen() {
    Scaffold {
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            item { StartButton() }
            item { Spacer(modifier = Modifier.height(8.dp)) }
            item { StopButton() }
        }
    }
}