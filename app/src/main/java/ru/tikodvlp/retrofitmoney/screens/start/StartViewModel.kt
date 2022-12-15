package ru.tikodvlp.retrofitmoney.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.tikodvlp.retrofitmoney.data.repository.Repository
import ru.tikodvlp.retrofitmoney.model.cash.Cash

class StartViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getCash()
        }
    }
}