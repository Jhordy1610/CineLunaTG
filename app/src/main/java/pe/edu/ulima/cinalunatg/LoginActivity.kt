package pe.edu.ulima.cinalunatg

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pe.edu.ulima.cinalunatg.presentation.screens.LoginScreen

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen(
                cambiarAMain = {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("NOMBRE", it)
                    startActivity(intent)
                }
            )
        }
    }
}
