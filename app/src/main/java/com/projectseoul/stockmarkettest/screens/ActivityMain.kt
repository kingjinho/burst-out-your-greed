package com.projectseoul.stockmarkettest.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.projectseoul.stockmarkettest.StockMarketApplication
import com.projectseoul.stockmarkettest.databinding.ActivityMainBinding
import com.projectseoul.stockmarkettest.di.activity.IActivityComponent

/**
 * Created by KING JINHO on 9/14/2021
 */
class ActivityMain : AppCompatActivity() {

    val activityComponent: IActivityComponent by lazy {
        (application as StockMarketApplication).appComponent.activity()
            .create()
    }

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
