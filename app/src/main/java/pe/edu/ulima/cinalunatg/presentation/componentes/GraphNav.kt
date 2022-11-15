package pe.edu.ulima.cinalunatg.presentation.componentes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import pe.edu.ulima.cinalunatg.presentation.screens.DetalleScreen
import pe.edu.ulima.cinalunatg.presentation.screens.QuienesSomosScreen
import pe.edu.ulima.cinelunaapp.screens.CarteleraScreen


@Composable
fun GraphNav(
    nombre: String?,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "cartelera"
    ) {
        composable("cartelera") {
            CarteleraScreen(nombre, navController)
        }
        composable("QuienesSomos") {
            QuienesSomosScreen {
                navController.navigate("cartelera")
            }
        }

        composable("detalle/{nombre}/{resena}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                },
                navArgument("resena") {
                    type = NavType.StringType
                }
            )
        ) {
            DetalleScreen(
                nombre = it.arguments!!.getString("nombre"),
                resena = it.arguments!!.getString("resena"),
                navController = navController
            )
        }
    }
}
