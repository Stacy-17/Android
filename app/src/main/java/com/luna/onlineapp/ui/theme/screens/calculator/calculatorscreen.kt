package com.luna.onlineapp.ui.theme.screens.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.luna.onlineapp.ui.theme.another3
import com.luna.onlineapp.ui.theme.another5


@Composable
fun Calculator_Screen(navController:NavHostController) {
    var fnum by remember { mutableStateOf(TextFieldValue("")) }
    var snum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }
    val context= LocalContext.current

    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text(answer,
            color = another5,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = fnum,
            onValueChange = { fnum = it },
            label = {
                Text(
                    "Enter First Number",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = snum,
            onValueChange = { snum = it },
            label = {
                Text(
                    "Enter Second Number",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                val myfirstnum=fnum.text.trim()
                val mysecontnum=snum.text.trim()
                if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnum.toDouble() + mysecontnum.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(another3),
            modifier = Modifier.width(150.dp)
        ) {
            Text(
                "+",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                val myfirstnum=fnum.text.trim()
                val mysecontnum=snum.text.trim()
                if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnum.toDouble() - mysecontnum.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(another3),
            modifier = Modifier.width(150.dp)
        ) {
            Text(
                "-",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                val myfirstnum=fnum.text.trim()
                val mysecontnum=snum.text.trim()
                if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnum.toDouble() * mysecontnum.toDouble()
                    answer=myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(another3),
            modifier = Modifier.width(150.dp)
        ) {
            Text(
                "*",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                val myfirstnum=fnum.text.trim()
                val mysecontnum=snum.text.trim()
                if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstnum.toDouble() / mysecontnum.toDouble()
                    answer=myanswer.toString()
                }

            },
            colors = ButtonDefaults.buttonColors(another3),
            modifier = Modifier.width(150.dp)
        ) {
            Text(
                "/",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
        }
    }
}


@Preview
@Composable
private fun Calculator_prev() {
    Calculator_Screen(rememberNavController())
}