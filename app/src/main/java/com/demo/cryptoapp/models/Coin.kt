package com.cryptoapp.models

data class Coin(
    var id: String? = null,
    var name: String? = null,
    var symbol: String? = null,
    var rank: Int? = null,
    var isNew: Boolean? = null,
    var isActive: Boolean? = null,
    var value: Double? = null,
    var percent: Double? = null,
    var type: String? = null
)
