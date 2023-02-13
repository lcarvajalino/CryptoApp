package com.demo.cryptoapp.view.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demo.cryptoapp.interfaces.principal.OnClickCoin
import com.demo.cryptoapp.models.Coin
import com.demo.cryptoapp.R

class CoinAdapter(private val coins: ArrayList<Coin>, private val clickCoin: OnClickCoin) :
    RecyclerView.Adapter<CoinViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CoinViewHolder(layoutInflater.inflate(R.layout.coin_item, parent, false))
    }

    override fun getItemCount() = coins.size

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        val coin = coins[position]
        holder.bind(coin)
        holder.itemView.setOnClickListener {
            clickCoin.onclick(coin.id)
        }
    }
}