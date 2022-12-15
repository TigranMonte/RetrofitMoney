package ru.tikodvlp.retrofitmoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response
import ru.tikodvlp.retrofitmoney.data.repository.Repository
import ru.tikodvlp.retrofitmoney.model.cachless.Cashless

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Cashless>> = MutableLiveData()

    fun getCashlessMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getCashless()
        }
    }
}