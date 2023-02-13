package com.demo.cryptoapp.interfaces.principal

import com.demo.cryptoapp.models.Coin

interface IViewPrincipal {

    fun showCryptos(coins:ArrayList<Coin>)
    fun showError()
}