package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Contracts(
    @SerializedName("contract") var contract: String? = null,
    @SerializedName("platform") var platform: String? = null,
    @SerializedName("type") var type: String? = null
)