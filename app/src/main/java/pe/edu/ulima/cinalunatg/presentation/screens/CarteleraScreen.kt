package pe.edu.ulima.cinelunaapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import pe.edu.ulima.cinalunatg.modelo.GestorPeliculas
import pe.edu.ulima.cinalunatg.presentation.componentes.Cabecera
import pe.edu.ulima.cinalunatg.presentation.componentes.Peliculas

@Composable
fun CarteleraScreen(
    nombre: String?,
    navController : NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        //Cabecera(nombre)
        Peliculas(
            pelis = GestorPeliculas.getInstance().obtenerPeliculas(),
            navController = navController
        )
    }
}

