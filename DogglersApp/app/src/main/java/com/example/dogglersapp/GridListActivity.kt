package com.example.dogglersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglersapp.adapter.DogAdapter
import com.example.dogglersapp.const.Layout
import com.example.dogglersapp.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogAdapter(
            applicationContext,
            Layout.GRID
        )

        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}