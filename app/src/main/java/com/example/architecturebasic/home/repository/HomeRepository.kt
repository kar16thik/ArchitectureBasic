package com.example.architecturebasic.home.repository

import com.example.architecturebasic.network.ApiService
import com.example.architecturebasic.network.model.DataState
import com.example.architecturebasic.network.model.ItemResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val apiService: ApiService
) {
     suspend fun getItemList(): Flow<DataState<ArrayList<ItemResponse>>> = flow {
        emit(DataState.Loading)
        try {
            val genreResult = apiService.getItemList()
            emit(DataState.Success(genreResult))

        } catch (e: Exception) {
            emit(DataState.Error(e))
        }
    }

}