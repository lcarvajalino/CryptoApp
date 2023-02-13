package com.demo.cryptoapp.presenter.details

import com.demo.cryptoapp.data.coinsDetails.DetailsApi
import com.demo.cryptoapp.interfaces.details.IPresenterDetails
import com.demo.cryptoapp.interfaces.details.IViewDetails
import com.demo.cryptoapp.models.DetailsCoin

class DetailsPresenter(private val  view: IViewDetails) : IPresenterDetails {

    private val detailsApi = DetailsApi(this)

    override fun getCoinDetails(id:String) {
        detailsApi.getCoinDetails(id)
    }

    override fun showResults(detailsCoin: DetailsCoin) {
        view.showDetails(detailsCoin)
    }

    override fun showError() {
        view.showError()
    }


}


