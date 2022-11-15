package pe.edu.ulima.cinalunatg.presentation.componentes

import android.icu.text.IDNA
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import pe.edu.ulima.cinalunatg.modelo.Pelicula


@Composable
fun CajaPelicula(
    InfoPelicula: Pelicula,
    navController : NavHostController
) {

    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(start = 12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = InfoPelicula.nombre,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .clickable {
                        if (InfoPelicula.nombre == "Dr Strange 2") {
                            val resena = InfoPelicula.resena
                            val nombre = InfoPelicula.nombre
                            navController.navigate("detalle/${nombre}/${resena}")
                        } else if (InfoPelicula.nombre == "Top Gun Maverick"){
                            val resena = InfoPelicula.resena
                            val nombre = InfoPelicula.nombre
                            navController.navigate("detalle/${nombre}/${resena}")
                        } else {
                            val resena = InfoPelicula.resena
                            val nombre = InfoPelicula.nombre
                            navController.navigate("detalle/${nombre}/${resena}")
                        }
                }
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = InfoPelicula.hora,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.Start)
            )
        }
    }
}