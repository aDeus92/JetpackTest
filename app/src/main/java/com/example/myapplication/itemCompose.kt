package com.example.myapplication


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemCompose(item: ItemRowModel) {
    var isExpended by remember() {
        mutableStateOf(false)

    }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
            .background(Color.White)

        
    ){

        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Image(painter = painterResource(id = item.imageId),
                contentDescription = "Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(3.dp)
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = item.tittle)
                Text(
                    modifier = Modifier.clickable {
                        isExpended =!isExpended
                    },
                    maxLines = if(isExpended) Int.MAX_VALUE else 1,
                    text = item.desc)
            }

        }

    }
}