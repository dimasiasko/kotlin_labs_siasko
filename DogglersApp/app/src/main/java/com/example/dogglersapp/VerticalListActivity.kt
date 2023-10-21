package com.example.dogglersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglersapp.adapter.DogAdapter
import com.example.dogglersapp.const.Layout
import com.example.dogglersapp.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}