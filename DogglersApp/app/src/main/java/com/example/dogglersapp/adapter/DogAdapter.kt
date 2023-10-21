package com.example.dogglersapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglersapp.R
import com.example.dogglersapp.const.Layout.GRID
import com.example.dogglersapp.dogsdata.DogsData

class DogAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogAdapter.DogCardViewHolder>() {
    private val dogList = DogsData.dogs

    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val imageView: ImageView? = view!!.findViewById(R.id.dog_image)
        val nameTextView: TextView? = view!!.findViewById(R.id.dog_name)
        val ageTextView: TextView? = view!!.findViewById(R.id.dog_age)
        val hobbyTextView: TextView? = view!!.findViewById(R.id.dog_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = when (layout) {
            GRID -> LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)

            else -> LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }

        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dogList.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dogData = dogList[position]
        holder.imageView?.setImageResource(dogData.imageResourceId)
        holder.nameTextView?.text = dogData.name
        val resources = context?.resources
        holder.ageTextView?.text = resources?.getString(R.string.dog_age, dogData.age)
        holder.hobbyTextView?.text = resources?.getString(R.string.dog_hobbies, dogData.hobbies)
    }
}