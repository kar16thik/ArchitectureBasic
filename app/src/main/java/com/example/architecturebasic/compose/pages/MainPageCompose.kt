package com.example.architecturebasic.compose.pages

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.architecturebasic.compose.pages.navigation.MyAppRouter
import com.example.architecturebasic.compose.pages.navigation.Screens
import com.example.architecturebasic.compose.pages.screens.SignInScreen
import com.example.architecturebasic.compose.pages.screens.SignUpScreen
import com.example.architecturebasic.compose.ui.theme.Pink40

@Composable
fun MainComposeApp(){
    Surface(modifier = Modifier.fillMaxWidth(),
        color = Pink40

    ){
        Crossfade(targetState = MyAppRouter.currentScreen, label = "") { currentState ->
            when (currentState.value) {
                is Screens.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screens.SignInScreen -> {
                    SignInScreen()
                }
            }
        }

    }
}