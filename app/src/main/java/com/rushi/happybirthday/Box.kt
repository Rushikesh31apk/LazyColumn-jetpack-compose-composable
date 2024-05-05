package com.rushi.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun boxPreview(){
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id =R.drawable.rushi3d), contentDescription = "", modifier = Modifier.padding(100.dp,300.dp))
        Image(painter = painterResource(id =R.drawable.ic_launcher_foreground), contentDescription = "")
    }
}