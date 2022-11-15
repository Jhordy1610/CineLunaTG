package pe.edu.ulima.cinalunatg.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    cambiarAMain : (nombre : String) -> Unit
) {

    //Variable de estado
    val nombre = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
    ) {

        Text(
            text = "Cine Luna App",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Ingrese su nombre:",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxHeight(0.1f)
                .fillMaxWidth()
                .padding(start = 10.dp),
            textAlign = TextAlign.Start
        )

        OutlinedTextField(
            value = nombre.value,
            onValueChange = {
                nombre.value = it
            },
            modifier = Modifier
                .fillMaxHeight(0.11f)
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )
        Button(
            onClick = {
                cambiarAMain(nombre.value) //se manda el nombre al MainActivity
            },
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxHeight(0.9f)
                .fillMaxWidth()
                .padding(top = 300.dp, bottom = 0.dp, start = 10.dp, end = 10.dp)
        ) {
            Text(text = "Login")
        }

    }
}