package com.vlyashuk.currencyconverter.data.api

import com.vlyashuk.currencyconverter.model.Data
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("daily_json.js")
    suspend fun getMoney(): Response<Data>
}