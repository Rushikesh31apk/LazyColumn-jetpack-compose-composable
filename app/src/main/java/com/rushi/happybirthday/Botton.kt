package com.rushi.happybirthday

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true,showSystemUi = true)
@Composable
private fun buttonPreview() {
    Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Green,
                containerColor = Color.Black,
            ),
            modifier = Modifier.padding(130.dp,300.dp)

            ) {
            Text(text = "Click Me")
        }

}