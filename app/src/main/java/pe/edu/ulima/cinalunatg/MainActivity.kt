package pe.edu.ulima.cinalunatg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.cinalunatg.modelo.GestorPeliculas
import pe.edu.ulima.cinalunatg.presentation.screens.MainScreen

import pe.edu.ulima.cinalunatg.ui.theme.CinaLunaTGTheme
import pe.edu.ulima.cinelunaapp.screens.CarteleraScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val peliculas = GestorPeliculas.getInstance().obtenerPeliculas()
        val nombre = intent.getStringExtra("NOMBRE")

        setContent {
            CinaLunaTGTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(nombre)
                }
            }
        }
    }
}
