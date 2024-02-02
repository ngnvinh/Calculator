package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}
fun power(baseVal: Int, exponentVal: Int): Long {
    val base = baseVal
    var exponent = exponentVal
    var result: Long = 1

    while (exponent != 0) {
        result *= base.toLong()
        --exponent
    }
    return result
}
@Composable
fun Calculator(modifier: Modifier = Modifier) {
    var firstNumber by remember {
        mutableStateOf(0)
    }
    var secondNumber by remember {
        mutableStateOf(0)
    }
    var countFirst by remember { mutableStateOf(0) }
    var countSecond by remember { mutableStateOf(0) }
    var checkState by remember { mutableStateOf(0) }
    var cal by remember { mutableStateOf(0) }
    var result by remember { mutableStateOf(0) }
    Column (
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row{
            Button(onClick = { /*TODO*/ }) {
                Text(text = "$firstNumber  $secondNumber $result")
                
            }
        }
        Row {

        }
        Row {
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 1
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 1

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 1
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 1

                    }
                }
            }) {
                Text(text = "1")
                
            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 2
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 2

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 2
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 2

                    }
                }
            }) {
                Text(text = "2")
                

            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 3
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 3

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 3
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 3

                    }
                }
            }) {
                Text(text = "3")
            }
        }
        Row {
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 4
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 4

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 4
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 4

                    }
                }
            }) {
                Text(text = "4")
            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 5
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 5

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 5
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 5

                    }
                }
            }) {
                Text(text = "5")
            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 6
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 6

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 6
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 6

                    }
                }
            }) {
                Text(text = "6")
            }
            
        }
        
        Row {
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 7
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 7

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 7
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 7

                    }
                }
            }) {
                Text(text = "7")
            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 8
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 8

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 8
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 8

                    }
                }
            }) {
                Text(text = "8")
            }
            Button(onClick = {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 9
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 9

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 9
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 9

                    }
                }
            }) {
                Text(text = "9")
            }
        }
        Row {
            Button(onClick = {  if(checkState == 0)
            {
                if(checkState == 0)
                {
                    if(countFirst == 0)
                    {
                        firstNumber += 0
                        countFirst++
                    }
                    else
                    {
                        firstNumber = firstNumber * 10 + 0

                    }
                }
                else
                {
                    if(countSecond == 0)
                    {
                        secondNumber += 0
                        countSecond++
                    }
                    else
                    {
                        secondNumber = secondNumber * 10 + 0

                    }
                }
            } }) {
                Text(text = "0")
            }
        }

        Row {
            Button(onClick = {
                checkState = 1
                cal = 1
            }) {
                Text(text = "+")
                
            }
            Button(onClick = { checkState = 1
                cal = 2}) {
                Text(text = "-")

            }
            Button(onClick = {
                if(cal == 1)
                {
                    result = firstNumber + secondNumber
                }
                if(cal == 2)
                {
                    result = firstNumber - secondNumber
                }
            }) {
                Text(text = "=")
            }
        }
        Row {
            Button(onClick = {
                firstNumber = 0
                secondNumber = 0
                checkState = 0
                cal = 0
                result = 0
            }) {
                Text(text = "Clear")
            }
        }
        

    }
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {
        Calculator()
    }
}
