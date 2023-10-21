package com.example.dogglersapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogAdapter.DogCardViewHolder>() {

    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        return DogCardViewHolder(null)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {

        val resources = context?.resources

    }
}