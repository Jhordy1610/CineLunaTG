package pe.edu.ulima.cinalunatg.presentation.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.cinalunatg.modelo.Alumno

@Composable
fun CajaAlumno(
    InfoAlumno: Alumno
) {
    Card(elevation = 4.dp,
        modifier = Modifier.padding(start = 12.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = InfoAlumno.name,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = InfoAlumno.id,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}