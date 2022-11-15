package pe.edu.ulima.cinalunatg.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.cinalunatg.modelo.GestorAlumnos
import pe.edu.ulima.cinalunatg.modelo.GestorPeliculas
import pe.edu.ulima.cinalunatg.presentation.componentes.*


@Composable
fun QuienesSomosScreen(
    onNavegarAPelis : () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        //CabeceraDos()
        Alumnos(
            alum = GestorAlumnos.getInstance().obtenerAlumnos(),
            onRegresarClick = {
                onNavegarAPelis()
            }
        )
    }

}

