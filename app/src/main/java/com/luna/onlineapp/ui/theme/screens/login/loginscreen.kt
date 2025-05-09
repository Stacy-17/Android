package com.luna.onlineapp.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.navigation.ROUTE_REGISTER
import com.luna.onlineapp.ui.theme.new

@Composable
fun Login_Screen(navController:NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(new)){
        Text("Login Screen",
            color = Color.Red ,
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = { Text("Enter Email Address",
                color = Color.Blue,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)

                )
            }

        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text("Enter Password",
                color = Color.Blue,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)

            )
            }

        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {} ,
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier=Modifier.fillMaxWidth(),

        ) {
            Text("Click to log in",
                color = Color.Black,
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text("Do not have an account? Click to register",
            fontSize = 20.sp,
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_REGISTER) })
    }
}

@Preview
@Composable
private fun Login_prev() {
    Login_Screen(rememberNavController())
}