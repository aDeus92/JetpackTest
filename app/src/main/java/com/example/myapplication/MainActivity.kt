package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent{
      Column(){
            ListItem(name = "Артур", prof ="Собаколюб" )
            ListItem(name = "Артур2", prof ="Собаколюб" )
            ListItem(name = "Артур3", prof ="Собаколюб" )
            ListItem(name = "Артур4", prof ="Собаколюб" )
        }

            }

    }

}

@Composable
private fun ListItem(name: String,prof:String ){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)

    ){
        Box (){

           Row(verticalAlignment =Alignment.CenterVertically){
               Image(painter = painterResource(id = R.drawable.mops),
                   contentDescription = "Love Arthur",
                   contentScale = ContentScale.Crop,
                   modifier = Modifier
                       .padding(5.dp)
                       .size(64.dp)
                       .clip(CircleShape)
               )
               Column {
                   Text(text = name)
                   Text(text = prof)
               }

           }

        }
    }
}




