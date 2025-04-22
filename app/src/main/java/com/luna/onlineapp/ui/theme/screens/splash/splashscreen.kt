package com.luna.onlineapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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
import com.luna.onlineapp.navigation.ROUTE_HOME
import com.luna.onlineapp.ui.theme.Pink80
import com.luna.onlineapp.ui.theme.Purple80
import com.luna.onlineapp.ui.theme.another
import com.luna.onlineapp.ui.theme.my
import com.luna.onlineapp.ui.theme.new
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splash_Screen(navController:NavHostController) {
    val coroutine= rememberCoroutineScope()
    coroutine.launch {
       kotlinx.coroutines.delay(3000)
        navController.navigate(ROUTE_HOME)
    }
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Purple80),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(id = R.drawable.books),
            contentDescription = "splash",
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
            )

        Text("Bookie",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 70.sp,
            color = Color.Black
        )
    }
}

@Preview
@Composable
private fun Splash_prev() {
    Splash_Screen(rememberNavController())
}