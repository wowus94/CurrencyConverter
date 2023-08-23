package com.vlyashuk.currencyconverter.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vlyashuk.currencyconverter.data.repisitory.Repository
import com.vlyashuk.currencyconverter.model.Data
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel() {

    var repository = Repository()
    val moneyList: MutableLiveData<Response<Data>> = MutableLiveData()

    fun getMoney(){
        viewModelScope.launch {
            moneyList.value = repository.getMoneyRepository()
        }
    }

}