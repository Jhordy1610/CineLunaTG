package pe.edu.ulima.cinalunatg.presentation.componentes


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerMenu(
    nombre : String?,
    navController : NavController,
    onCloseDrawer : () -> Unit,
    onChangeTitle: (String) -> Unit
) {
    Column(
        modifier = Modifier
        .fillMaxSize()
        .padding(
            start = 24.dp,
            end = 48.dp
        )
    ) {

    Text(text = "Hola $nombre")
    Divider(
        modifier = Modifier.fillMaxWidth()
    )
    Text(
        text ="Cartelera",
        modifier = Modifier
            .height(32.dp)
            .clickable {
                navController.navigate("cartelera")
                onCloseDrawer()
                onChangeTitle("Cine Luna App")
            })
    Divider(
        modifier = Modifier.fillMaxWidth()
    )
    Text(
        text ="Sobre Nosotros",
        modifier = Modifier
            .height(32.dp)
            .clickable {
                navController.navigate("QuienesSomos")
                onCloseDrawer()
                onChangeTitle("Cine Luna App")
            })
    }}