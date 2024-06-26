package com.example.notesapp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp


@Composable
fun HorizontalSpacer(dp: Dp) {
    Spacer(
        modifier = Modifier
            .width(dp)
    )
}

@Composable
fun VerticalSpacer(dp: Dp) {
    Spacer(
        modifier = Modifier
            .height(dp)
    )
}