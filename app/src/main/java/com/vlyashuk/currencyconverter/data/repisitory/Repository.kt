package com.vlyashuk.currencyconverter.data.repisitory

import com.vlyashuk.currencyconverter.data.api.RetrofitInstance
import com.vlyashuk.currencyconverter.model.Data
import retrofit2.Response

class Repository {

    suspend fun getMoneyRepository(): Response<Data> {
        return RetrofitInstance.api.getMoney()
    }
}