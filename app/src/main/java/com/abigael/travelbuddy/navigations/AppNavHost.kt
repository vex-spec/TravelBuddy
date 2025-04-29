package com.abigael.travelbuddy.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abigael.travelbuddy.ui.screens.cars.LuxuryScreen
import com.abigael.travelbuddy.ui.screens.SplashScreenScreen
import com.abigael.travelbuddy.ui.screens.booking.BookingScreen
import com.abigael.travelbuddy.ui.screens.cars.CarScreen
import com.abigael.travelbuddy.ui.screens.cars.LatestScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_CARS
) {


    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_SPLASH) {
            SplashScreenScreen(navController)

        }

        composable(ROUT_BOOKING) {
            BookingScreen(navController)

        }
        composable(ROUT_CARS) {
            CarScreen(navController)

        }
        composable(ROUT_LUXURY) {
            LuxuryScreen(navController)

        }
        composable(ROUT_LATEST) {
            LatestScreen(navController)

        }

    }
}