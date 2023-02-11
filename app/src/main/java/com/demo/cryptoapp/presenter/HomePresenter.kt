package com.demo.cryptoapp.presenter

import com.demo.cryptoapp.data.DataApi
import com.cryptoapp.models.Coin
import com.demo.cryptoapp.interfaces.IPresenterPrincipal
import com.demo.cryptoapp.interfaces.IViewPrincipal

class HomePresenter(private val view: IViewPrincipal) : IPresenterPrincipal {

    private val data = DataApi(this)

    override fun getAllCoins() {
        data.consultCoins()
    }

    override fun showResults(Coins:ArrayList<Coin>) {
        view.showCryptos(Coins)
    }

    override fun showError() {
        view.showError()
    }
}