package com.github.rexfilius.viewgroupszuri.listView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.rexfilius.viewgroupszuri.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    lateinit var binding: ActivityListBinding
    lateinit var listItemAdapter: ListItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAdapter()
    }

    private fun setupAdapter() {
        listItemAdapter = ListItemAdapter(this, ListItemData.items)
        binding.listView.adapter = listItemAdapter
    }

}