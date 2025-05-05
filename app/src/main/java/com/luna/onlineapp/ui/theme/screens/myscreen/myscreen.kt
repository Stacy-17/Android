package com.luna.onlineapp.ui.theme.screens.myscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.R
import com.luna.onlineapp.navigation.ROUTE_HOME
import com.luna.onlineapp.ui.theme.Pink80
import com.luna.onlineapp.ui.theme.another1
import com.luna.onlineapp.ui.theme.another4
import com.luna.onlineapp.ui.theme.another5
import com.luna.onlineapp.ui.theme.another6
import com.luna.onlineapp.ui.theme.color
import com.luna.onlineapp.ui.theme.my


@Composable
fun My_Screen(navController:NavHostController) {

        var selected_index by remember { mutableStateOf(0) }
//   start_ scaffold
    Scaffold (
//start_bottombar
        bottomBar = {
            //        start_navbar1
            NavigationBar (
                containerColor = Pink80)
            {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selected_index==0,
                    onClick = {selected_index=0
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home") },
                    label = { Text("Add") },
                    selected = selected_index==0,
                    onClick = {selected_index=0
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "favourites")},
                    label = { Text("Favourites") },
                    selected = selected_index==1,
                    onClick = {selected_index=1
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selected_index==2,
                    onClick = {selected_index=2
                        navController.navigate(ROUTE_HOME)
                    }
                )
        }
//            end_navbar1
        },
//        end_bottom_bar

//        floating_action_button
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = another1
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
//       start_ content
        content = {paddingValues ->
//            start_main_column1
            Column (
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ){
//                start_box1
                Box(){
//                    start_main_card1
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp),
                        shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp),
                        colors = CardDefaults.cardColors()
                    ){
                        Text(text = "Welcome Stacy,",
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.Magenta
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "Here are your projects",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Blue
                        )

                        Spacer(modifier = Modifier.height(20.dp))
//                        start_sub_main_column1

                        Column (
                            modifier = Modifier
                                .fillMaxSize()
                                .horizontalScroll(rememberScrollState())
                        ){
//                            start_row1
                            Row (
                                modifier = Modifier.padding(20.dp)
                            )
//                            start_card1
                            {
                                Card(
                                    modifier = Modifier
                                        .width(130.dp)
                                        .height(250.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(another4)
                                ) {
                                    Column (
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ){
                                        Image(painter = painterResource(id = R.drawable.cryptocurrency),
                                            contentDescription = "home",
                                            modifier = Modifier.size(80.dp))
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Crypto", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Digital", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "10 Links", fontSize = 15.sp)
                                    }
                                }
//                                end_card1

                                Spacer(modifier = Modifier.width(10.dp))

//                                start_card2
                                Card(
                                    modifier = Modifier
                                        .width(130.dp)
                                        .height(250.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(color)
                                ) {
                                    Column (
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ){
                                        Image(painter = painterResource(id = R.drawable.statistics),
                                            contentDescription = "home",
                                            modifier = Modifier.size(80.dp))
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Statistics", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Dashboard", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "10 Links", fontSize = 15.sp)
                                    }
                                }
//                                end_card2
                                Spacer(modifier = Modifier.width(10.dp))

//                                start_card3

                                Card(
                                    modifier = Modifier
                                        .width(130.dp)
                                        .height(250.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(another6)
                                ) {
                                    Column (
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ){
                                        Image(painter = painterResource(id = R.drawable.about1),
                                            contentDescription = "home",
                                            modifier = Modifier.size(80.dp))
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "About", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Services", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "10 Links", fontSize = 15.sp)
                                    }
                                }
//                                end_card3
                            }
//                            end_row1
                        }
//                        end_sub_main_column1
                    }
//                    end_main_card1

                }
//                end_box1
                Spacer(modifier = Modifier.height(20.dp))

//                start_sub_main_column2
                Column (modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()))
                {
                    Spacer(modifier = Modifier.height(30.dp))

                    Text(
                        text = "Personal Tasks",
                        fontSize = 30.sp,
                        color = another5
                    )

//                    start_main_row2

                    Row(modifier = Modifier.padding(20.dp))
                    {
//                        start_card1

                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        )
                        {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            )
                            {
                                Row {
                                    Image(
                                        painter = painterResource(R.drawable.video),
                                        contentDescription = "home",
                                        modifier = Modifier
                                            .width(50.dp)
                                            .padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column()
                                    {
                                        Text(
                                            text = "NDA Review for Website Project",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = my
                                        )
                                        Text(
                                            text = "Today at 10pm",
                                            fontSize = 15.sp
                                        )
                                        Text(
                                            text = "Today at 12pm",
                                            fontSize = 15.sp
                                        )
                                    }
                                }
                            }
                        }
//                        end_card1
                    }
//                    end_main_row2
                    Spacer(modifier = Modifier.width(8.dp))

//                    start_main_row3

                    Row(modifier = Modifier.padding(20.dp))
                    {
//                        start_card2

                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        )
                        {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            )
                            {
                                Row {
                                    Image(
                                        painter = painterResource(R.drawable.email),
                                        contentDescription = "home",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column()
                                    {
                                        Text(
                                            text = "Email Reply for Green Project",
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = my
                                        )
                                        Text(
                                            text = "Today at 9pm",
                                            fontSize = 15.sp
                                        )
                                        Text(
                                            text = "Today at 11pm",
                                            fontSize = 15.sp
                                        )
                                    }
                                }
                            }
                        }
//                        end_card2
                    }
//                    end_main_row3
                }
//                end_sub_main_column2
            }
//            end_main_column1
        }
//    end_content
    )
//    end_scaffold

}

@Preview
@Composable
private fun MyScreen_prev() {
    My_Screen(rememberNavController())

}