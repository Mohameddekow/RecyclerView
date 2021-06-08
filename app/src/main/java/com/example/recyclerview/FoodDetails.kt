package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityFoodDetailsBinding
class FoodDetails : AppCompatActivity() {

    lateinit var binding: ActivityFoodDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val intent:Intent = intent

            foodName.text = getIntent().getStringExtra("name")
            difficulty.text = getIntent().getStringExtra("difficulty")
            foodRatingValue.text = getIntent().getStringExtra("rating")
            desc.text = getIntent().getStringExtra("desc")
            foodImage.setImageResource(getIntent().getStringExtra("image")!!.toInt())

        }
    }
}