package pe.edu.ulima.cinalunatg.presentation.componentes

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Cabecera(nombre : String?) {
    Text(text ="Hola $nombre")
}