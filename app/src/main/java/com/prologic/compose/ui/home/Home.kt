package com.prologic.compose.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prologic.compose.ui.theme.ComposeTheme


class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }

    @Composable
    fun HomeScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .wrapContentHeight(CenterVertically)
                .fillMaxWidth()
                .padding(40.dp),
            horizontalAlignment = CenterHorizontally
        ) {
            Text(
                modifier = modifier.wrapContentWidth(CenterHorizontally),
                text = "GST Suvidha Kendra",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                style = TextStyle(lineHeight =36.sp),
                fontStyle = FontStyle.Normal
            )
            Text(
                modifier = modifier.wrapContentWidth(Start),
                text = "Mobile App",
                textAlign = TextAlign.Start ,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Text(
                modifier = modifier.wrapContentWidth(CenterHorizontally).paddingFromBaseline(top = 28.sp),
                text = "Please enter the 6-digit verification code in the Next",
                textAlign = TextAlign.Start ,
                fontWeight = FontWeight.Normal,
                style = TextStyle(lineHeight =18.sp),
                fontSize = 18.sp
            )
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeTheme {
            HomeScreen()
        }
    }
}