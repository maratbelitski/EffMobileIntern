package com.effmobileintern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.effmobileintern.firsttheme.getAllInt
import com.effmobileintern.firsttheme.mockList
import com.effmobileintern.ui.theme.EffMobileInternTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            EffMobileInternTheme {
                Box (
                    modifier = Modifier.fillMaxSize(),
                   contentAlignment = Alignment.Center
                ){
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            mockList.getAllInt()
                            // По нажатию логгируем все итемы класса Int
                        },
                        content = {
                            Text(
                                modifier = Modifier,
                                text = "Show logs")
                        },
                    )
                }
            }
        }
    }
}