package com.rushi.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun imagePreview(){
    Image(
        painter = painterResource(id = R.drawable.androidparty),
        contentDescription ="Dummy Image",
        //colorFilter= ColorFilter.tint(Color.Black)
        modifier = Modifier.fillMaxSize()

    )
}