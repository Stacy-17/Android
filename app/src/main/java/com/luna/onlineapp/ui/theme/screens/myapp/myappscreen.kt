package com.luna.onlineapp.ui.theme.screens.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.R
import com.luna.onlineapp.ui.theme.PurpleGrey40
import com.luna.onlineapp.ui.theme.PurpleGrey80
import com.luna.onlineapp.ui.theme.another
import com.luna.onlineapp.ui.theme.color

@Composable
fun My_App_Screen(navController:NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey80)){
        Image(painter = painterResource(id = R.drawable.ap1),
            contentDescription = "my_app",
            modifier = Modifier
                .fillMaxWidth())

        Spacer(modifier = Modifier.height(40.dp))

    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(color),
        modifier = Modifier.fillMaxWidth()) {
        Text("Calculator",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontSize = 30.sp
        )
    }
        Spacer(modifier = Modifier.height(40.dp))

    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(another),
        modifier = Modifier.fillMaxWidth()) {
        Text("Intent",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontSize = 30.sp
        )
    }

    }
    
}

@Preview
@Composable
private fun My_App_Prev() {
    My_App_Screen(rememberNavController())
}