package com.example.architecturebasic.compose.pages.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.architecturebasic.compose.pages.components.ItemListComponent

@Composable
fun DashBoardScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)

    ) {
        LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
            items(items = getItemList()) { name ->
                ItemListComponent(name.itemName,name.decription)
            }
        }
    }


    }

fun getItemList():List<ItemData>{
    val itemList = mutableListOf<ItemData>()
    itemList.add(ItemData("item name1", "my description"))
    itemList.add(ItemData("item name1", "my description"))
    itemList.add(ItemData("item name1", "my description"))
    itemList.add(ItemData("item name1", "my description"))
    itemList.add(ItemData("item name1", "my description"))
    itemList.add(ItemData("item name1", "my description"))
    return itemList;
}

data class ItemData(val itemName:String,val decription:String)


@Preview
@Composable
fun defaultPrviewOfDashboard(){
    DashBoardScreen()
}