package com.cryptoapp.retrofit

import com.cryptoapp.models.Coin
import retrofit2.Response
import retrofit2.http.GET

interface CoinsService {

    @GET("coins/")
    suspend fun getCoins(): Response<java.util.ArrayList<Coin>>

}