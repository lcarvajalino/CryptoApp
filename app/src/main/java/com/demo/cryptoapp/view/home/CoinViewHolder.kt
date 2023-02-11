package com.demo.cryptoapp.view.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cryptoapp.models.Coin
import com.demo.cryptoapp.R
import com.demo.cryptoapp.databinding.CoinItemBinding

class CoinViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val binding = CoinItemBinding.bind(view)


    fun bind(coin: Coin) {
        val url = "https://static.coinpaprika.com/coin/${coin.id}/logo.png"
        Glide.with(view).load(url).into(binding.imgIcon)
        binding.tvName.text = coin.name
        binding.tvId.text = coin.symbol
        val price = "$" + String.format("%,.3f", coin.value)
        val percent = "%" + String.format("%.1f", coin.percent)
        binding.tvPrice.text = price
        binding.tvPercent.text = percent
        if (coin.percent!! >= 0) {
            binding.tvPercent.setTextColor(view.context.resources.getColor(R.color.green))
        } else {
            binding.tvPercent.setTextColor(view.context.resources.getColor(R.color.red))
        }
    }
}