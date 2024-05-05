package com.rushi.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun lazyColumnPreview(){
    LazyColumn (content = {
        items(getdata()){item->
            start(img = item.img, title = item.title, subtitle =item.subtitle)
        }
    })
}

@Composable
fun start(img:Int,title:String,subtitle:String){
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            Description(title = title, subtitle = subtitle, Modifier.weight(.9f) )
        }
    }
}

@Composable
fun Description(title:String,subtitle:String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
    }
}

data class store(val img:Int, val title:String, val subtitle:String)

fun getdata():MutableList<store>{
    val list= mutableListOf<store>()
    list.add(store(R.drawable.a,"Rushikesh.N","Android Developer"))
    list.add(store(R.drawable.b,"Kotlin","Its so funny to learn"))
    list.add(store(R.drawable.c,"Java","I have Use for Data structure"))
    list.add(store(R.drawable.d,"Jetpack Compose","So beautiful Ui creation"))
    list.add(store(R.drawable.e,"Firebase","Its storing all user data"))
    list.add(store(R.drawable.a,"Prathmesh.N","Fronted Developer"))
    list.add(store(R.drawable.b,"React","Its so funny to learn"))
    list.add(store(R.drawable.c,"JavaSript","I have Use for Data structure"))
    list.add(store(R.drawable.d,"CSS","So beautiful Ui creation"))
    list.add(store(R.drawable.e,"Mongo DB","Its storing all user data"))
    list.add(store(R.drawable.a,"Rushikesh.N","Java Developer"))
    list.add(store(R.drawable.b,"Java Framework","Its so funny to learn"))
    list.add(store(R.drawable.c,"Java","I have Use for Data structure"))
    list.add(store(R.drawable.d,"Spring Boot","So beautiful Ui creation"))
    list.add(store(R.drawable.e,"MySQl","Its storing all user data"))


    return list

}