package com.demo.cryptoapp.data.coinsDetails

import com.demo.cryptoapp.interfaces.details.IDataDetails
import com.demo.cryptoapp.interfaces.details.IPresenterDetails
import com.demo.cryptoapp.retrofit.CoinsService
import com.demo.cryptoapp.retrofit.RetrofitManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailsApi(private val presenter: IPresenterDetails) : IDataDetails {
    override fun getCoinDetails(id: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val call =
                RetrofitManager.getRetrofit().create(CoinsService::class.java).getCoinDetails(id)
            val results = call.body()
            if (call.isSuccessful && results != null) {
                presenter.showResults(results)
            } else {
                presenter.showError()
            }
        }
    }

}