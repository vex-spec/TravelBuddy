package com.abigael.travelbuddy.ui.screens.cars

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abigael.travelbuddy.navigations.ROUT_CARS
import com.abigael.travelbuddy.ui.theme.darkblue
import com.abigael.travelbuddy.ui.theme.newblack
import com.abigael.travelbuddy.ui.theme.newray
import com.abigael.travelbuddy.ui.theme.newwhite
import com.abigael.travelbuddy.ui.theme.newyy

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LatestScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Latest Brands") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.Menu, contentDescription = "MENU")
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
                        navController.navigate(ROUT_CARS)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
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


                        TopAppBar(
                            title = { Text(text = "") },
                            navigationIcon = {
                                IconButton(onClick = {navController.navigate(ROUT_CARS)}) {
                                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                                }
                            },

                        )
                        Text(
                            text = "Explore Top Brand's",
                            modifier = Modifier.padding(start = 20.dp),
                            fontSize = 30.sp
                        )
                        Text(
                            text = "Super Cars Here",
                            modifier = Modifier.padding(start = 20.dp),
                            fontSize = 30.sp
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            //searchBar
                            var search by remember { mutableStateOf("") }
                            OutlinedTextField(
                                value = search,
                                onValueChange = { search = it },
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
                                placeholder = { Text(text = "Search...") }
                            )
                            //End of searchBar

                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = newblack
                            )
                        }

                    //End of Card 1
                Spacer(modifier = Modifier.height(10.dp))



                    //wewe
                    Box {
                        //Card 1
                        Card (
                            modifier = Modifier.fillMaxWidth().height(700.dp),
                            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, ),
                            colors = CardDefaults.cardColors(darkblue)
                        ){
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Top Brands",
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                            //cards
                            Row (){
                                Card {

                                }




                            }
                            




                        }
                    }
                //end of box


















            }
        }
    )

    //End of scaffold



}

@Preview(showBackground = true)
@Composable
fun LatestScreenPreview(){
    LatestScreen(navController = rememberNavController())
}