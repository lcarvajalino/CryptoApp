package com.demo.cryptoapp.view.details

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.demo.cryptoapp.interfaces.details.IViewDetails
import com.demo.cryptoapp.models.DetailsCoin
import com.demo.cryptoapp.presenter.details.DetailsPresenter
import com.demo.cryptoapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity(), IViewDetails {

    private lateinit var homeBinding: ActivityDetailsBinding
    private var presenter: DetailsPresenter = DetailsPresenter(this);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)
        intent.getStringExtra("id")?.let { presenter.getCoinDetails(it) }
        homeBinding.btnBack.setOnClickListener {
            finish()
        }

    }

    override fun showDetails(details: DetailsCoin) {
        runOnUiThread {
            Glide.with(this).load(details.logo).into(homeBinding.ivLogo)
            homeBinding.symbol.text = details.symbol
            homeBinding.tvName.text = details.name
            homeBinding.tvDescription.text = details.description
            homeBinding.tvType.text = details.type
            homeBinding.tvDevStatus.text = details.developmentStatus
            homeBinding.tvStartedAt.text = details.startedAt
            homeBinding.tvFirstDataAt.text = details.firstDataAt
            homeBinding.tvLastDataAt.text = details.lastDataAt
            homeBinding.progressCircular.visibility = View.GONE
            homeBinding.layoutContainer.visibility = View.VISIBLE
        }
    }

    override fun showError() {
        runOnUiThread {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }
}