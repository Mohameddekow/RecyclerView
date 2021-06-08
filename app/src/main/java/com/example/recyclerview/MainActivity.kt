package com.example.recyclerview
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FoodAdapter.OnFoodClickListener {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            foodRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            foodRecyclerView.adapter = FoodAdapter(this@MainActivity,FoodObject.myFood, this@MainActivity)
        }

    }

    override fun onFoodClick(food: FoodItem, position: Int) {
        val intent = Intent(this, FoodDetails::class.java)
        intent.putExtra("name", food.name)
        intent.putExtra("rating", food.foodRatingValue.toString())
        intent.putExtra("difficulty", food.difficulty)
        intent.putExtra("desc", food.desc)
        intent.putExtra("image", food.image.toString())
        startActivity(intent)
    }
}