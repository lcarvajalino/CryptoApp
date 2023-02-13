package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Tags(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("coin_counter") var coinCounter: Int? = null,
    @SerializedName("ico_counter") var icoCounter: Int? = null
)