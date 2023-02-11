package com.demo.cryptoapp.interfaces

import com.cryptoapp.models.Coin

interface IViewPrincipal {

    fun showCryptos(coins:ArrayList<Coin>)
    fun showError()
}