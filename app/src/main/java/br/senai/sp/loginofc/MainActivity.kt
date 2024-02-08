package br.senai.sp.loginofc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.loginofc.ui.theme.LoginOfcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginOfcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaLogin()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Column {
     Text(text = "Login")
        Box{
            Column {
                Text(text = "Email")
                TextField(
                    value = "",
                    onValueChange = {}
                )
                Text(text = "Senha")
                TextField(
                    value = "",
                    onValueChange = {}
                )
                Row {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {}
                    )
                    Text(text = "Lembrar")
                }
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    LoginOfcTheme {
        TelaLogin()
    }
}
