package com.example.miapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Favorite: Screen("favorite")
    data object Profile: Screen("Profile")
    data object Detail: Screen("Detail")
}