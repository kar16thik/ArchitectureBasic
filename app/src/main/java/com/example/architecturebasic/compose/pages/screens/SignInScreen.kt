package com.example.architecturebasic.compose.pages.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.architecturebasic.R
import com.example.architecturebasic.compose.pages.components.HeadingTextComponent
import com.example.architecturebasic.compose.pages.components.NormalTextComponent
import com.example.architecturebasic.compose.pages.components.NormalTextFeild

@Composable
fun SignInScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.Sign_in) )
            Spacer(modifier = Modifier.height(30.dp))
            NormalTextFeild(lableValue = stringResource(id = R.string.user_name) )
            NormalTextFeild(lableValue = stringResource(id = R.string.password) )
        }
    }
}

@Preview
@Composable
fun defaultPrviewOfSignin(){
    SignInScreen()
}