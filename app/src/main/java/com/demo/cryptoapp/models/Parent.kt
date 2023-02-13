package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Parent(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("symbol") var symbol: String? = null
)