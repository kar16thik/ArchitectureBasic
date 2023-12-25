package com.example.architecturebasic.home.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.architecturebasic.home.repository.HomeRepository
import com.example.architecturebasic.network.model.DataState
import com.example.architecturebasic.network.model.ItemResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
): ViewModel()  {
    private var homeItemListData = MutableLiveData<DataState<ArrayList<ItemResponse>>>()
    fun setup() {
        Log.e("text","text")
        getItemList()
    }

    fun getItemList() {
        viewModelScope.launch {
            homeRepository.getItemList().onEach {
                homeItemListData.value = it
            }.launchIn(viewModelScope)
        }
    }

    fun getItemListData(): LiveData<DataState<ArrayList<ItemResponse>>> = homeItemListData
}