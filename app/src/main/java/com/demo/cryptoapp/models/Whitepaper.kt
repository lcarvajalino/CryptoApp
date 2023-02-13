package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Whitepaper(
    @SerializedName("link") var link: String? = null,
    @SerializedName("thumbnail") var thumbnail: String? = null
)