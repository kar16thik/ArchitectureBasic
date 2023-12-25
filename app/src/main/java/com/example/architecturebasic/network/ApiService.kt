package com.example.architecturebasic.network

import com.example.architecturebasic.network.ApiUrl.GET_URL
import com.example.architecturebasic.network.model.ItemResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(GET_URL)
    suspend fun getItemList(): ArrayList<ItemResponse>
}