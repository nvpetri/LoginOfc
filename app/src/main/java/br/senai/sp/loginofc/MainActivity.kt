package br.senai.sp.loginofc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.loginofc.ui.theme.LoginOfcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginOfcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF6A1FB4)
                ) {
                    TelaLogin()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6A1FB4))
    ) {
     Text(
         text = "Login",
         fontSize = 48.sp,
         fontWeight = FontWeight.Bold
     )
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
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Entrar")
        }
        Text(text = "Desenvolvido por Nicolas Vasconcelos - DSA")
    }
}

@Preview (showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    LoginOfcTheme {
        TelaLogin()
    }
}
