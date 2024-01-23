package com.ppam.therecipe

sealed class Screen(val route: String) {

    object RecipeScreen: Screen(route = "receiptScreen")
    object DetailScreen: Screen(route = "detailScreen")

}