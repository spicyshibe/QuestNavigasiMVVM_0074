package com.example.praktikumact5

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun dataApp (
    navController: NavHostController = rememberNavController()
) {

}