package com.example.architecturebasic.compose.pages.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.architecturebasic.compose.pages.screens.SignUpScreen
import com.example.architecturebasic.compose.ui.theme.BorderColor
import com.example.architecturebasic.compose.ui.theme.Pink80
import com.example.architecturebasic.compose.ui.theme.Purple80
import com.example.architecturebasic.compose.ui.theme.TextColor
import org.w3c.dom.Text


@Composable
fun NormalTextComponent(value:String){
  Text(
      text =value,
      modifier = Modifier.fillMaxWidth(),
      style = TextStyle(
          fontSize = 18.sp,
      fontWeight = FontWeight.Normal,
      fontStyle= FontStyle.Normal,
      ),
      color = TextColor,
      textAlign = TextAlign.Center
  )
}

@Composable
fun HeadingTextComponent(value:String){
    Text(
        text =value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle= FontStyle.Normal,
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NormalTextFeild(lableValue:String){
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        label = { Text(lableValue) },
        keyboardActions = KeyboardActions.Default,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = BorderColor,
            focusedLabelColor = BorderColor,
            cursorColor = BorderColor
        )
    )
}

@Composable
fun ButtonComponent(value:String,onButtonClicked: () -> Unit){
   Button(onClick = { onButtonClicked() },
   modifier = Modifier
       .fillMaxWidth()
       .heightIn(48.dp),
   contentPadding = PaddingValues(),
       colors = ButtonDefaults.buttonColors(Color.Transparent)
   )
   {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp)
            .background(
                brush = Brush.horizontalGradient(listOf(Purple80, Pink80)),
                shape = RoundedCornerShape(50.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
       Text(text =value )

    }
   }
}


@Preview
@Composable
fun defaultPrviewOfSignup(){
    ButtonComponent("value:String"){

    }
    NormalTextFeild("lableValue:String")
}
