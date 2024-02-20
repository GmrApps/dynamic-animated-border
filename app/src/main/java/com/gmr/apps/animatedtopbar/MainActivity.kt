package com.gmr.apps.animatedtopbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gmr.apps.animatedtopbar.functions.drawAnimationBorder
import com.gmr.apps.animatedtopbar.ui.theme.AnimatedTopBarTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedTopBarTheme {

                Display()
            }
        }
    }
}


@Composable
fun Display(){
    
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                .padding(16.dp)
                .drawAnimationBorder(
                    strokeWidth = 15.dp,
                    durationMillis = 4500,
                    shape = RoundedCornerShape(100)
                )
        )
        {
            Text(text = "Button")
            
        }
        
    }
}

