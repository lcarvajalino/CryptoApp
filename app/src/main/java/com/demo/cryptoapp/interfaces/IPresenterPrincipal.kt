package com.demo.cryptoapp.interfaces

import com.cryptoapp.models.Coin

interface IPresenterPrincipal {

    fun getAllCoins()

    fun showResults(Coins:ArrayList<Coin>)
    fun showError()

}