package com.demo.cryptoapp.interfaces.details

import com.demo.cryptoapp.models.DetailsCoin

interface IViewDetails {

    fun showDetails(details: DetailsCoin)
    fun showError()
}