package pe.edu.ulima.cinalunatg.presentation.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import pe.edu.ulima.cinalunatg.presentation.componentes.DrawerMenu
import pe.edu.ulima.cinalunatg.presentation.componentes.GraphNav
import pe.edu.ulima.cinalunatg.presentation.componentes.TopBar

@Composable
fun MainScreen(nombre : String?) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val title = remember {
        mutableStateOf("Cine Luna App")
    }

    val AbrirDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }

    val CerrarDrawer: () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }

    val changeTitle: (String) -> Unit = { newTitle ->
        title.value = newTitle
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                title = title.value,
                openDrawer = AbrirDrawer
            )
        },
        drawerContent = {
            DrawerMenu(
                nombre = nombre,
                navController = navController,
                onCloseDrawer = CerrarDrawer,
                onChangeTitle = changeTitle
            )
        }
    ) {
        GraphNav(
            nombre = nombre,
            navController = navController,
        )
    }

}

