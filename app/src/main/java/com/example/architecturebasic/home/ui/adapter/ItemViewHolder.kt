package com.example.architecturebasic.home.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.architecturebasic.databinding.ItemNameBinding
import com.example.architecturebasic.network.model.ItemResponse

class ItemViewHolder(private val binding: ItemNameBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindData(item: ItemResponse) {
        binding.itemName.text = item.title

    }
}