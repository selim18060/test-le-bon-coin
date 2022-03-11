package com.example.testleboncoin.network.service

import com.example.testleboncoin.data.model.ItemsData
import retrofit2.Response
import retrofit2.http.GET

interface ItemsApi {

    @GET("/img/shared/technical-test.json")
    suspend fun getAllItems(): Response<List<ItemsData>>
}