package com.demo.cryptoapp.view.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.cryptoapp.interfaces.principal.IViewPrincipal
import com.demo.cryptoapp.interfaces.principal.OnClickCoin
import com.demo.cryptoapp.models.Coin
import com.demo.cryptoapp.presenter.home.HomePresenter
import com.demo.cryptoapp.databinding.ActivityHomeBinding
import com.demo.cryptoapp.view.details.DetailsActivity

class HomeActivity : AppCompatActivity(), IViewPrincipal, OnClickCoin {

    private lateinit var homeBinding: ActivityHomeBinding
    private var presenter: HomePresenter = HomePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)
        presenter.getAllCoins()

    }


    override fun showCryptos(coins: ArrayList<Coin>) {
        runOnUiThread {
            homeBinding.progressCircular.visibility = View.GONE
            homeBinding.rvCoins.visibility = View.VISIBLE
            homeBinding.rvCoins.layoutManager = LinearLayoutManager(this)
            homeBinding.rvCoins.adapter = CoinAdapter(coins, this)
        }
    }

    override fun showError() {
        runOnUiThread {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onclick(id: String?) {
        startActivity(Intent(this, DetailsActivity::class.java).putExtra("id",id))
    }
}