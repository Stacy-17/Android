package com.luna.onlineapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.ui.theme.screens.calculator.Calculator_Screen
import com.luna.onlineapp.ui.theme.screens.dashboard.Dashboard_Screen
import com.luna.onlineapp.ui.theme.screens.home.Home_Screen
import com.luna.onlineapp.ui.theme.screens.intent.Intent_Screen
import com.luna.onlineapp.ui.theme.screens.login.Login_Screen
import com.luna.onlineapp.ui.theme.screens.myapp.My_App_Screen
import com.luna.onlineapp.ui.theme.screens.myscreen.My_Screen
import com.luna.onlineapp.ui.theme.screens.register.Register_Screen
import com.luna.onlineapp.ui.theme.screens.splash.Splash_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_SPLASH)
{
    NavHost(navController=navController,
        modifier =Modifier,
        startDestination = startDestination ){
        composable(ROUTE_SPLASH){
            Splash_Screen(navController)
        }
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER){
            Register_Screen(navController)
        }
        composable(ROUTE_MYAPP){
            My_App_Screen(navController)
        }
        composable(ROUTE_CALCULATOR){
            Calculator_Screen(navController)
        }
        composable(ROUTE_INTENT){
            Intent_Screen(navController)
        }
        composable(ROUTE_DASHBOARD){
            Dashboard_Screen(navController)
        }
        composable(ROUTE_MYSCREEN){
            My_Screen(navController)
        }
    }

}