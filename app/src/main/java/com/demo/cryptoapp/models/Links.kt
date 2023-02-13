package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("explorer") var explorer: ArrayList<String> = arrayListOf(),
    @SerializedName("facebook") var facebook: ArrayList<String> = arrayListOf(),
    @SerializedName("medium") var medium: ArrayList<String> = arrayListOf(),
    @SerializedName("source_code") var sourceCode: ArrayList<String> = arrayListOf(),
    @SerializedName("website") var website: ArrayList<String> = arrayListOf()
)