package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent{
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
        ){
            itemsIndexed(
                listOf(
                    ItemRowModel(R.drawable.wolf,"Волк"),
                    ItemRowModel(R.drawable.mops,"Мопс"),
                    ItemRowModel(R.drawable.panther,"Пантера"),
                    ItemRowModel(R.drawable.rabbit,"Заяц"),
                    ItemRowModel(R.drawable.eagle,"Орёл")
                )
            ){_,item ->
            ItemCompose(item = item)
            }
        }
            }

    }

}


@Composable
private fun CircleBtn(){
    val counter = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.Blue)
    }
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color.value, shape = CircleShape)

            .clickable {
                when (++counter.value) {
                    10 -> color.value = Color.Red
                }

            },
        contentAlignment = Alignment.Center
    ){
        Text(
            text = counter.value.toString(),
            style = TextStyle(Color.White, fontSize = 20.sp)
        )
    }
}




