package pe.edu.ulima.cinalunatg.presentation.componentes

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun TopBar(
    title: String,
    openDrawer: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(
                onClick = { openDrawer() }
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Menu drawer")
            }
        }
    )
}