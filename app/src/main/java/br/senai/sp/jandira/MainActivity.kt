package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column {
        Column (
          modifier = Modifier
              .fillMaxWidth()
              .height(60.dp)
              .padding(start = 240.dp)
              .background(Color.Magenta)
        ){}

        Column (
        ) {
            Row {
                Text(
                    text = "Login",
                    fontSize = 50.sp,
                    color = Color.Magenta,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .padding(top = 150.dp)
                )
                Text(
                    text = "Please sign in to continue.",
                    color = Color.LightGray,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 220.dp)
                )
            }
        }

        Column (
            modifier = Modifier
                .padding(top = 60.dp)
                .padding(start = 40.dp)
        ){
            OutlinedTextField(
                value = "teste@email.com ",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = "************",
                onValueChange = {},
                label = {
                    Text(text = "Password")
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(start = 100.dp)
                    .padding(end = 50.dp)
            ) {
                Text(
                    text = "SIGN IN",
                    fontSize = 25.sp
                )
            }

            Column (
            ){
                Row {
                    Text(
                        text = "Don’t have an account?",
                        color = Color.LightGray,
                        modifier = Modifier
                            .padding(start = 40.dp, top = 10.dp)
                    )
                    Text(
                        text = "Sign up",
                        color = Color.Magenta,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .width(145.dp)
                .fillMaxHeight()
                .padding(top = 80.dp)
                .background(Color.Magenta)
        ){}
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripRoomTheme {
        Greeting()
    }
}