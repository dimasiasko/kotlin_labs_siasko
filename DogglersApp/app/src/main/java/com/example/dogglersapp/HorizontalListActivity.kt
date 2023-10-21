package com.example.dogglersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglersapp.adapter.DogAdapter
import com.example.dogglersapp.const.Layout
import com.example.dogglersapp.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}