package com.example.architecturebasic.compose.pages.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

object MyAppRouter {
    var currentScreen: MutableState<Screens> = mutableStateOf(Screens.SignUpScreen)

    fun navigateTo(destination : Screens){
        currentScreen.value = destination
    }
}