package com.luna.onlineapp.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.R
import com.luna.onlineapp.navigation.ROUTE_LOGIN
import com.luna.onlineapp.navigation.ROUTE_REGISTER
import com.luna.onlineapp.ui.theme.PurpleGrey40
import com.luna.onlineapp.ui.theme.PurpleGrey80

@Composable
fun Home_Screen(navController:NavHostController) {

    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)){

        Text("Novel App",
            color = Color.Unspecified,
            fontSize = 33.sp,
            fontFamily = FontFamily.SansSerif
        )

        Text("Welcome to Bookish",
            color = Color.Green,
            fontSize = 33.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {navController.navigate(ROUTE_LOGIN)} ,
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier=Modifier.width(280.dp)

        ) {
            Text("Click here to log in",
                color = Color.Black)
        }

        Button(onClick ={navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier=Modifier.width(280.dp)) {

            Text("Click here to register",
                color = Color.Black
            )
        }


        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .width(280.dp)) {
            Text("My App",
                color = Color.Black)
        }

        Image(painter = painterResource(id = R.drawable.app4,),
            contentDescription = "app",
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
        )

    }
}

@Preview
@Composable
private fun Home_prev() {
    Home_Screen(rememberNavController())
}