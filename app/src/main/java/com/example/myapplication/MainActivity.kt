package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent{
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
        ){
            itemsIndexed(
                listOf(
                    ItemRowModel(R.drawable.wolf,"Волк", "Волк, или серый волк\n " +
                            "— вид хищных млекопитающих из семейства псовых (Canidae). Наряду с койотом (Canis latrans),\n" +
                            "обыкновенным шакалом (Canis aureus) и ещё несколькими видами составляет род волков (Canis).\n" +
                            "Кроме того, как показывают результаты изучения последовательности ДНК и дрейфа генов, является\n" +
                            "прямым предком домашней собаки (Canis familiaris; также классифицируется как подвид волка,\n" +
                            "Canis lupus familiaris). Волк — одно из самых крупных современных животных в своём семействе:\n" +
                            "длина его тела (без учёта хвоста) может достигать 160 см, длина хвоста — до 52 см,\n" +
                            "высота в холке — до 90 см; масса тела может достигать 90—110 кг."),
                    ItemRowModel(R.drawable.mops,"Мопс", "test"),
                    ItemRowModel(R.drawable.panther,"Пантера","123rfdsdfg"),
                    ItemRowModel(R.drawable.rabbit,"Заяц","23sdfsdfg"),
                    ItemRowModel(R.drawable.eagle,"Орёл","advfdfb")
                )
            ){_,item ->
            ItemCompose(item = item)
            }
        }
            }

    }

}




