package com.demo.cryptoapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {

 /*   val service: CallPokemon by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        getRetrofit().create(CallPokemon::class.java)
    }*/

    public fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.coinpaprika.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}