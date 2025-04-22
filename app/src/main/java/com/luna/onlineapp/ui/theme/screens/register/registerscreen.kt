package com.luna.onlineapp.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.luna.onlineapp.navigation.ROUTE_LOGIN
import com.luna.onlineapp.ui.theme.another1

@Composable
fun Register_Screen(navController:NavHostController) {
    var fname by remember { mutableStateOf(TextFieldValue("")) }
    var lname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(another1)
    ) {
        Text(
            "Sign Up ",
            color = Color.Red,
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = fname,
            onValueChange = { fname = it },
            label = {
                Text(
                    "Enter First Name ",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = lname,
            onValueChange = { lname = it },
            label = {
                Text(
                    "Enter Last Name",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(
                    "Enter Email Address",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }

        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    "Enter Password",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }

        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier.fillMaxWidth(),

            ) {
            Text(
                "Click to Register",
                color = Color.Black,
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Text("Have an account? Click to Log in.",
            fontSize = 25.sp,
            modifier = Modifier.clickable { navController.navigate(ROUTE_LOGIN) })
    }
}

@Preview
@Composable
private fun Register_prev() {
    Register_Screen(rememberNavController())
}