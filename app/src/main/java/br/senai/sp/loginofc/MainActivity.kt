package br.senai.sp.loginofc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            .background(Color(0xFF6A1FB4)),
        verticalArrangement= Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
     Text(
         text = "Login",
         fontSize = 48.sp,
         fontWeight = FontWeight.Bold,
         color = Color.White
     )
        Box(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .background(
                    Color(0xFF9004CC),
                    shape = RoundedCornerShape(
                        topStart = 32.dp,
                        bottomEnd = 32.dp,
                        topEnd = 10.dp
                    )
                )
        ){
            Column(
                Modifier.padding(24.dp)
            ) {
                Text(
                    text = "Email",
                    color = Color.White
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                )
                Text(
                    text = "Senha",
                    color = Color.White,
                    modifier = Modifier.padding(top = 24.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                )
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Checkbox(
                        checked = false,
                        onCheckedChange = {}
                    )
                    Text(
                        text = "Lembrar",
                        color = Color.White
                        )
                }
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFFE908D2))
        )
        {
            Text(
                text = "Entrar",
                fontSize = 24.sp,
                color = Color.White
            )
        }
        Text(
            text = "Desenvolvido por Nicolas Vasconcelos - DSA",
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

@Preview (showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    LoginOfcTheme {
        TelaLogin()
    }
}
