package com.eritlab.jexmon.data.demo_db

import androidx.compose.ui.graphics.Color
import com.eritlab.jexmon.R
import com.eritlab.jexmon.domain.model.ProductModel
import javax.inject.Inject

class DemoDB @Inject constructor() {
    private val description =
        "Delicious vegetarian dish that satisfies your taste buds and keeps you healthy."
    fun getProduct(): List<ProductModel> {
        return listOf(
            ProductModel(
                id = 1,
                title = "Vegetarian Delight Pizza",
                description = description,
                images = listOf(
                    R.drawable.ps4_console_white_1,
                    R.drawable.ps4_console_white_2,
                    R.drawable.ps4_console_white_3,
                    R.drawable.ps4_console_white_4,
                ),
                rating = 4.8,
                price = 79.99,
                isFavourite = true,
                isPopular = true,

                ),

            //second product

            ProductModel(
                id = 2,
                title = "Vegetarian Pasta Primavera",
                description = description,
                images = listOf(
                    R.drawable.image_popular_product_2
                ),
                rating = 4.1,
                price = 49.99,
                isFavourite = true,
                isPopular = true,
                ),

            //third product
            ProductModel(
                id = 3,
                title = "Burger",
                description = description,
                images = listOf(
                    R.drawable.glove
                ),
                rating = 4.1,
                price = 36.55,
                isFavourite = true,
                isPopular = true,

                ),

            ProductModel(
                id = 4,
                title = "Maggi",
                description = description,
                images = listOf(
                    R.drawable.wireless_headset
                ),
                rating = 4.1,
                price = 19.99,
                isFavourite = true,
                isPopular = true,

                ),


            )

    }
}