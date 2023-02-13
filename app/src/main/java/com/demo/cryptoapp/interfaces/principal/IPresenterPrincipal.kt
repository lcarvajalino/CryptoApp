package com.demo.cryptoapp.interfaces.principal

import com.demo.cryptoapp.models.Coin

interface IPresenterPrincipal {

    fun getAllCoins()

    fun showResults(Coins:ArrayList<Coin>)
    fun showError()

}