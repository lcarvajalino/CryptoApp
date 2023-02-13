package com.demo.cryptoapp.retrofit

import com.demo.cryptoapp.models.Coin
import com.demo.cryptoapp.models.DetailsCoin
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinsService {

    @GET("coins/")
    suspend fun getCoins(): Response<java.util.ArrayList<Coin>>

    @GET("coins/{id}")
    suspend fun getCoinDetails(@Path("id") id: String): Response<DetailsCoin>
}