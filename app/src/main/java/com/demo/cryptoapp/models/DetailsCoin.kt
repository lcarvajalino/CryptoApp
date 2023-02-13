package com.demo.cryptoapp.models

import com.google.gson.annotations.SerializedName

data class DetailsCoin(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("symbol") var symbol: String? = null,
    @SerializedName("rank") var rank: Int? = null,
    @SerializedName("is_new") var isNew: Boolean? = null,
    @SerializedName("is_active") var isActive: Boolean? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("contract") var contract: String? = null,
    @SerializedName("platform") var platform: String? = null,
    @SerializedName("contracts") var contracts: ArrayList<Contracts> = arrayListOf(),
    @SerializedName("logo") var logo: String? = null,
    @SerializedName("parent") var parent: Parent? = Parent(),
    @SerializedName("tags") var tags: ArrayList<Tags> = arrayListOf(),
    @SerializedName("team") var team: ArrayList<Team> = arrayListOf(),
    @SerializedName("description") var description: String? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("open_source") var openSource: Boolean? = null,
    @SerializedName("started_at") var startedAt: String? = null,
    @SerializedName("development_status") var developmentStatus: String? = null,
    @SerializedName("hardware_wallet") var hardwareWallet: Boolean? = null,
    @SerializedName("proof_type") var proofType: String? = null,
    @SerializedName("org_structure") var orgStructure: String? = null,
    @SerializedName("hash_algorithm") var hashAlgorithm: String? = null,
    @SerializedName("links") var links: Links? = Links(),
    @SerializedName("links_extended") var linksExtended: ArrayList<LinksExtended> = arrayListOf(),
    @SerializedName("whitepaper") var whitepaper: Whitepaper? = Whitepaper(),
    @SerializedName("first_data_at") var firstDataAt: String? = null,
    @SerializedName("last_data_at") var lastDataAt: String? = null
)
