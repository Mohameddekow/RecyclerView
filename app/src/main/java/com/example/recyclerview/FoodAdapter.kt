package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityFoodBinding

class FoodAdapter(private val context: Context, var foods: List<FoodItem>, val clickListener: OnFoodClickListener): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = ActivityFoodBinding.inflate(LayoutInflater.from(context), parent, false)

        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foods[position]
        holder.setData(food, clickListener)
    }

    override fun getItemCount(): Int {
        return foods.size
    }


    inner class FoodViewHolder(val binding:ActivityFoodBinding): RecyclerView.ViewHolder(binding.root){
        fun setData(food: FoodItem, action: OnFoodClickListener) {
            binding.apply {
                foodName.text = food.name
                time.text = food.time.toString()
                difficulty.text = food.difficulty
                foodRatingValue.text = food.foodRatingValue.toString()
                foodImage.setImageResource(food.image)
            }
            binding.root.setOnClickListener {
                action.onFoodClick(food,adapterPosition)
            }

        }

    }

    interface OnFoodClickListener {
        fun onFoodClick(food:FoodItem,position: Int)
    }
}
