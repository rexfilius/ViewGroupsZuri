package com.github.rexfilius.viewgroupszuri.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.rexfilius.viewgroupszuri.R
import com.github.rexfilius.viewgroupszuri.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val logo = intent.getIntExtra(ListItemAdapter.LOGO_EXTRAS, 0)
        val name = intent.getStringExtra(ListItemAdapter.NAME_EXTRAS)
        val detail = intent.getStringExtra(ListItemAdapter.FACT_EXTRAS)

        binding.detailTextView.text = detail
        binding.detailImageView.setImageResource(logo)
        title = name
    }


}