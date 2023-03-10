package com.demo.cryptoapp.data.coins

import com.demo.cryptoapp.interfaces.principal.IDataPrincipal
import com.demo.cryptoapp.interfaces.principal.IPresenterPrincipal
import com.demo.cryptoapp.models.Coin
import com.demo.cryptoapp.retrofit.CoinsService
import com.demo.cryptoapp.retrofit.RetrofitManager
import com.demo.cryptoapp.util.Utils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DataApi(private val presenter: IPresenterPrincipal) : IDataPrincipal {

    override fun consultCoins() {
        CoroutineScope(Dispatchers.IO).launch {
            val call = RetrofitManager.getRetrofit()
                .create(CoinsService::class.java).getCoins()
            val results = call.body()
            if (call.isSuccessful && !results.isNullOrEmpty()) {
                val data = arrayListOf<Coin>()
                for (i in 0..30) {
                    data.add(results[i].copy(value = Utils().getRandom(0,10000), percent = Utils().getRandom(-10,20)))
                }
                presenter.showResults(data)
            } else {
                presenter.showError()
            }
        }
    }


}