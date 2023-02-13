package com.demo.cryptoapp.presenter.home

import com.demo.cryptoapp.data.coins.DataApi
import com.demo.cryptoapp.models.Coin
import com.demo.cryptoapp.interfaces.principal.IPresenterPrincipal
import com.demo.cryptoapp.interfaces.principal.IViewPrincipal

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