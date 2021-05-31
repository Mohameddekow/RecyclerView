package com.example.recyclerview

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.RatingBar
import java.nio.file.Files.size

data class FoodItem(
    var image:Int,
    var name:String,
    var time:Any,
    var foodRatingValue:Float,
    var difficulty: String
    )

object FoodObject{
    val myFood = listOf<FoodItem>(
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy"),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium"),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy"),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy"),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult"),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy"),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium"),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy"),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy"),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult"),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy"),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium"),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy"),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy"),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult"),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy"),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium"),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy"),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy"),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult"),
    )
}