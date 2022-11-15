package pe.edu.ulima.cinalunatg.presentation.componentes

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import pe.edu.ulima.cinalunatg.modelo.Pelicula

@Composable
fun Peliculas(
    pelis : List<Pelicula>,
    navController : NavHostController
) {

    LazyColumn(){
        items(pelis.size) { index ->
            CajaPelicula(
                InfoPelicula = pelis[index],
                navController = navController)
        }
    }
    //pelis.map { PeliculaItem(InfoPelicula = it) }
}