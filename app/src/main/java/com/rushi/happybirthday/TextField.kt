package com.rushi.happybirthday

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true,showSystemUi = true)
@Composable
private fun textFieldPreview(){
    inputTextField()
}

@Composable
fun inputTextField(){
    var state =remember {mutableStateOf("")}
    OutlinedTextField(
        modifier = Modifier.padding(80.dp,300.dp),
        value = state.value,
        onValueChange ={
            state.value=it
        },
        label ={Text(text="enter your name")}
    )
}