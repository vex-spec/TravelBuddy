package com.abigael.travelbuddy.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abigael.travelbuddy.R
import com.abigael.travelbuddy.ui.theme.newblack

@Composable
fun SplashScreenScreen(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(newblack),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.m27),
            contentDescription = "",
            modifier = Modifier.size(400.dp)
        )
        Text(
            text = "Welcome",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Green
        )
      Text(
            text = "to Travel Buddy",
            fontSize = 25.sp,
            color = Color.Green,
            fontFamily = FontFamily.Cursive


        )




    }

}



@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreenScreen()


}