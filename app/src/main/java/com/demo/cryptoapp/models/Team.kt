package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("position") var position: String? = null
)