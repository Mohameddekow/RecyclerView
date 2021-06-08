package com.example.recyclerview

data class FoodItem(
    var image:Int,
    var name:String,
    var time:Any,
    var foodRatingValue:Float,
    var difficulty: String,
    var desc:String
    )
val desc:String =
    " INGREDIENTS\n" +
        "\n" +
        "SERVES 4\n" +
        "\n" +
        "1 ½ – 2 lbs chicken leg quarters\n" +
        "\n" +
        "3 tbsp olive oil, divided\n" +
        "\n" +
        "1 tsp salt, divided\n" +
        "\n" +
        "1 tsp freshly ground black pepper, divided\n" +
        "\n" +
        "1 small eggplant, orange quote icon scrubbed with clean vegetable brush under running water and cut into ½-inch dice\n" +
        "\n" +
        "1 medium zucchini, orange quote icon scrubbed with clean vegetable brush under running water and cut into ½-inch dice\n" +
        "\n" +
        "1 small onion, orange quote icon scrubbed with clean vegetable brush under running water and diced\n" +
        "\n" +
        "2 cloves garlic, minced\n" +
        "\n" +
        "¼ cup white wine or water\n" +
        "\n" +
        "1 (14.5 ounce) can diced tomatoes with juices\n" +
        "\n" +
        "¼ cup pimento-stuffed green olives, roughly chopped\n" +
        "\n" +
        "2 tbsp capers, rinsed\n" +
        "\n" +
        "2 tbsp red wine vinegar\n" +
        "\n" +
        "1 tsp sugar\n" +
        "\n" +
        "2 tbsp parsley, orange quote icon gently rubbed under cold running water and minced\n" +
        "\n" +
        "DIRECTIONS\n" +
        "\n" +
        "orange quote icon Wash hands with soap and water. In large skillet over medium high-heat, warm 2 tablespoons olive oil. Season leg quarters with ½ teaspoon salt and ½ teaspoon black pepper; orange quote icon do not rinse raw poultry.\n" +
        "\n" +
        "Add leg quarters to pan, skin-side down. orange quote icon Wash hands with soap and water after handling uncooked chicken. Brown chicken, turning once, 8 to 10 minutes per side. Remove chicken to plate and drain off all but 2 tablespoons oil. Add eggplant to hot pan and cook, stirring, 5 minutes. Add remaining tablespoon olive oil, along with zucchini, onion and garlic. Cook 5 minutes, stirring occasionally.\n" +
        "\n" +
        "Raise heat to high and add white wine to pan, stirring to scrape up any browned bits. Add all other ingredients, except parsley, and place chicken legs in mixture. Bring to boil, reduce heat to medium-low, cover and simmer for 35 to 40 minutes or until cooked through and orange quote icon internal temperature reaches 165 °F on food thermometer. To serve, place some of the eggplant ragout onto plates, top with a leg quarter and sprinkle with parsley.\n" +
        "\n  "

object FoodObject{
    val myFood = listOf<FoodItem>(
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy",desc),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium",desc),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy",desc),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy",desc),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult",desc),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy",desc),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium",desc),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy",desc),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy",desc),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult",desc),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy",desc),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium",desc),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy",desc),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy",desc),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult",desc),
        FoodItem(R.drawable.download1,"Burger","2 Hours", 3.0F,"Easy",desc),
        FoodItem(R.drawable.download2,"Cheese","3 Hours", 2.5F,"Medium",desc),
        FoodItem(R.drawable.download3,"Cottage cheese","1 hour", 1.5F,"Easy",desc),
        FoodItem(R.drawable.download4,"Pizza","Thirty Minutes", 1.0F,"Very Easy",desc),
        FoodItem(R.drawable.download5,"Hamburger","4 Hours", 3.0F,"Difficult",desc),
    )
   
}