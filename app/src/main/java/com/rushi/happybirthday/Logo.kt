package com.rushi.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi =true )
@Composable
private fun boxPreview() {
    logo(R.drawable.e,"Rushikesh.N","Software Developer")
}

@Composable
fun logo(link:Int,name:String,Roll:String){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(90.dp,100.dp)
    ) {
        Image(
            painterResource(id =link), "",
            Modifier.size(60.dp)
        )
        Column(
            Modifier.weight(.8f)
        ) {

            Text(
                text = name,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = Roll,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}