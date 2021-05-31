package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.PersonLayoutBinding

class FoodAdapter(private val context: Context, var foods: List<FoodItem>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
     val binding: PersonLayoutBinding = PersonLayoutBinding.inflate(LayoutInflater.from(context))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = PersonLayoutBinding.inflate(LayoutInflater.from(context), parent, false)

        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foods[position]
        holder.setData(food)
    }

    override fun getItemCount(): Int {
        return foods.size
    }


    inner class FoodViewHolder(val binding: PersonLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun setData(food: FoodItem) {
            binding.apply {
                foodName.text = food.name
                time.text = food.time.toString()
                difficulty.text = food.difficulty
                foodRatingValue.text = food.foodRatingValue.toString()
                foodImage.setImageResource(food.image)
            }

        }

    }
}
