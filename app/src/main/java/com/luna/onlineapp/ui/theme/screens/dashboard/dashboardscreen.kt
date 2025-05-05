package com.luna.onlineapp.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
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
import com.luna.onlineapp.ui.theme.PurpleGrey80
import com.luna.onlineapp.ui.theme.another2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard_Screen(navController:NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(another2)
            .verticalScroll(rememberScrollState())
    ) {
//        start_box
         Box(){
//             start_card1
             Card(modifier = Modifier
                 .fillMaxWidth()
                 .height(250.dp),
                 colors = CardDefaults.cardColors(another2))
             {
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                        }
                    },
                )
                 Text(text = "A mall is a large building that is full of many different shops ",
                     fontSize = 20.sp,
                     fontFamily = FontFamily.Serif,
                     fontWeight = FontWeight.ExtraBold,
                     modifier = Modifier.padding(5.dp)
                 )
             }

             //             end_card1
//             start_card2
             Card (
                 modifier = Modifier
                     .fillMaxWidth()
                     .height(180.dp)
                     .align(Alignment.BottomCenter)
                     .padding(start = 20.dp, end = 20.dp)
                     .offset(y = 90.dp))
             {
               Image(painter = painterResource(R.drawable.mall1),
                   contentDescription = "mall",
                   modifier = Modifier.fillMaxSize(),
                   contentScale = ContentScale.FillBounds)

                 Spacer(modifier = Modifier.width(10.dp))

                 Column {
                     Text(text = "",
                         fontSize = 15.sp,
                         fontWeight = FontWeight.ExtraBold)
                 }

             }
//             end_card2
         }
//        end_box

        Spacer(modifier = Modifier.height(90.dp))

//        start_row
        Row (modifier = Modifier.padding(20.dp)){
//            start_card3
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ROUTE_HOME) },
                elevation = CardDefaults.cardElevation()
            ){
              Column (
                  modifier = Modifier
                      .fillMaxSize(),
                  horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.Center
              ){
                  Image(painter = painterResource(R.drawable.home),
                      contentDescription = "home",
                      modifier = Modifier.size(100.dp))
                  Text(text = "Home",
                      fontSize = 15.sp)
              }
            }
//            end_card3

            Spacer(modifier = Modifier.width(50.dp))
            
//            start_card4
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ROUTE_HOME)},
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp))
                    Text(text = "About",
                        fontSize = 15.sp)
                }
            }
//            end_card4
        }
//        end_row
        Spacer(modifier = Modifier.height(10.dp))

//        start_row2

        Row (modifier = Modifier.padding(20.dp)){
//            start_card5
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable { navController.navigate(ROUTE_HOME) },
                elevation = CardDefaults.cardElevation()){

               Column (modifier = Modifier.fillMaxSize(),
                   horizontalAlignment = Alignment.CenterHorizontally,
                   verticalArrangement = Arrangement.Center){
                   Image(painter = painterResource(R.drawable.contact),
                   contentDescription = "Home",
                   modifier = Modifier.size(100.dp))

                   Text(text = "Contacts", fontSize = 15.sp)
               }
            }
            Spacer(modifier = Modifier.width(50.dp))
//            end_card5
//            start_card6
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable { navController.navigate(ROUTE_HOME)},
                elevation = CardDefaults.cardElevation())
            {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Image(painter = painterResource(R.drawable.products),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp))

                    Text(text = "Products", fontSize = 15.sp)
                }

            }
        }
//end_row2
        Spacer(modifier = Modifier.height(10.dp))

//        start_row2

        Row (modifier = Modifier.padding(20.dp)){
//            start_card5
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable { navController.navigate(ROUTE_HOME) },
                elevation = CardDefaults.cardElevation()){

                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center){
                    Image(painter = painterResource(R.drawable.products1),
                        contentDescription = "Home",
                        modifier = Modifier.size(100.dp))
                    Text(text = "Products", fontSize = 15.sp)
                }
            }
            Spacer(modifier = Modifier.width(50.dp))
//            end_card5
//            start_card6
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable { navController.navigate(ROUTE_HOME)},
                elevation = CardDefaults.cardElevation())
            {
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Image(painter = painterResource(R.drawable.products2),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp))
                    Text(text = "Products", fontSize = 15.sp)
                }

            }
        }
//end_row2
    }
}

@Preview
@Composable
private fun Dashboard_prev() {
    Dashboard_Screen(rememberNavController())
}