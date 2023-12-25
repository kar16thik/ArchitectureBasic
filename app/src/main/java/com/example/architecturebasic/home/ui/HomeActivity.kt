package com.example.architecturebasic.home.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.architecturebasic.R
import com.example.architecturebasic.compose.MainComposeActivity
import com.example.architecturebasic.databinding.ActivityHomeBinding
import com.example.architecturebasic.home.ui.adapter.ItemListAdapter
import com.example.architecturebasic.home.ui.viewmodel.HomeViewModel
import com.example.architecturebasic.network.model.DataState
import com.example.architecturebasic.network.model.ItemResponse
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var mHomeActivityBinding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mHomeActivityBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mHomeActivityBinding.root)
        viewModel.setup()
        observerSatae()
        //startActivity(Intent(this@HomeActivity, MainComposeActivity::class.java))
    }

    private fun initList(itemList:ArrayList<ItemResponse>){
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mHomeActivityBinding.itemList.layoutManager = layoutManager
        val adapter = ItemListAdapter(itemList)
        mHomeActivityBinding.itemList.adapter = adapter
    }

    private fun observerSatae(){
        viewModel.getItemListData().observe(this) { state ->
            when(state){
                is DataState.Success -> {
                    initList(state.data)
                }
                is DataState.Error -> {}
                is DataState.Loading -> {}
            }
        }
    }
}