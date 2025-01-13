package com.example.taller_mieles_laura

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taller_mieles_laura.Taller.FrutasScreen
import com.example.taller_mieles_laura.Taller.HomeScreen
import com.example.taller_mieles_laura.Taller.VerdurasScreen

@Composable
fun NavigationHostController() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home",
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        }
    ) {

        composable(route = "home") {
            HomeScreen(navController)
        }
        composable(route = "verduras") {
            VerdurasScreen(navController)
        }
        composable(route = "frutas") {
            FrutasScreen(navController)
        }

    }
}