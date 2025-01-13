package com.example.taller_mieles_laura.Taller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrutasScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Green),
                title = { Text("Frutas", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Reutilizamos la función ItemTabla para mostrar las frutas

            ItemTabla(name = "Manzana", function = "Rojo, rico en vitaminas")
            ItemTabla(name = "Plátano", function = "Amarillo, con alto nivel de potasio")
            ItemTabla(name = "Naranja", function = "Naranja, rico en vitamica C")
            ItemTabla(name = "Uva", function = "Morado, contiene antioxidantes")
            ItemTabla(name = "Sandía", function = "Verde y rojo, aporte en líquidos")
            ItemTabla(name = "Kiwi", function = "Verde, contiene aicdez")
            ItemTabla(name = "Piña", function = "Amarillo, vitamina D y dulzura")
            ItemTabla(name = "Fresa", function = "Rojo, alto en vitamina B6 y acido folico")
            ItemTabla(name = "Mango", function = "Amarillo, vitaminas A y C")
            ItemTabla(name = "Pera", function = "Verde, contiene fitonutrientes")
        }
    }
}
