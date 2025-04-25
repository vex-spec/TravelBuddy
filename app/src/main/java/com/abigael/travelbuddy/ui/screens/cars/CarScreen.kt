package com.abigael.travelbuddy.ui.screens.cars

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abigael.travelbuddy.R
import com.abigael.travelbuddy.navigations.ROUT_BOOKING
import com.abigael.travelbuddy.ui.theme.newgreen
import com.abigael.travelbuddy.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarScreen(navController: NavController){
    val mContext = LocalContext.current
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("CARS") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Black
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_BOOKING)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    })


            }
        },


        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "33 seaters section",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(start = 50.dp)
                )

                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Box (){
                        Row (){

                            //Card 1
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img_15),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1
                            Spacer(modifier = Modifier.width(5.dp))


                            //card2
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img_14),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1


                            Spacer(modifier = Modifier.width(5.dp))


                            //card2
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img_12),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1


                            Spacer(modifier = Modifier.width(5.dp))


                            //card2
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img_13),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1

                            //card3
                            Spacer(modifier = Modifier.width(5.dp))


                            //card2
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img_2),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1

                            //card4

                            Spacer(modifier = Modifier.width(5.dp))


                            //card2
                            Card (
                                modifier = Modifier.width(190.dp).height(200.dp) .padding(start = 20.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.img),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(150.dp)
                                            .background(color = newwhite)


                                    )

                                    Spacer(modifier = Modifier.height(15.dp))
                                    //MPESA
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                                        },
                                        colors = ButtonDefaults.buttonColors(Color.Black),
                                        shape = RoundedCornerShape(10.dp),
                                        modifier = Modifier.fillMaxWidth().padding(start =20.dp, end=20.dp ),

                                        ){
                                        Text(text = "BOOK NOW")
                                    }
                                    //END OF MPESA
                                }
                            }//end of card1
















                        }
                    }





                }














            }
        }
    )

    //End of scaffold

}



@Preview(showBackground = true)
@Composable
fun CarScreenPreview(){
    CarScreen(rememberNavController())


}



