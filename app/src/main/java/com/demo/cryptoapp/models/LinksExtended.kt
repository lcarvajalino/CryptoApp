package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("url") var url: String? = null,
    @SerializedName("type") var type: String? = null
)