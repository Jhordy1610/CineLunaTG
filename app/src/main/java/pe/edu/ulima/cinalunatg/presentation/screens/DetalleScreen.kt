package pe.edu.ulima.cinalunatg.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DetalleScreen(
    nombre : String?,
    resena : String?,
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "$nombre",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxHeight(0.1f)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Text(
            text = "$resena",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth()
        )

        Button(
            onClick = { navController.navigate("cartelera")},
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxHeight(0.6f)
                .fillMaxWidth()
                .padding(20.dp)
        )
        {
            Text(text = "Regresar")
        }

    }

}

