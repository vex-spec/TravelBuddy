package com.abigael.travelbuddy.ui.screens.cars

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LuxuryScreen(navController: NavController){


}

@Preview(showBackground = true)
@Composable
fun LuxuryScreenPreview(){
    LuxuryScreen(navController = rememberNavController())
}