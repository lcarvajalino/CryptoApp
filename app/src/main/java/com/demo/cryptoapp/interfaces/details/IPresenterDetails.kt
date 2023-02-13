package com.demo.cryptoapp.interfaces.details

import com.demo.cryptoapp.models.DetailsCoin

interface IPresenterDetails {

    fun getCoinDetails(id:String)

    fun showResults(detailsCoin: DetailsCoin)
    fun showError()

}