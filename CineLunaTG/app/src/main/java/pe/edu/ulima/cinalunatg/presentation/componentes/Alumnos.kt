package pe.edu.ulima.cinalunatg.presentation.componentes


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import pe.edu.ulima.cinalunatg.modelo.Alumno

@Composable
fun Alumnos(
    alum: List<Alumno>,
    onRegresarClick: () -> Unit
) {

    Column() {
        alum.map { CajaAlumno(InfoAlumno = it) }
        Button(
            onClick = onRegresarClick
        ) {
            Text(text = "Regresar")
        }

    }

}