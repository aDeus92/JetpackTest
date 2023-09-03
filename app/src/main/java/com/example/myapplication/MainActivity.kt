package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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




