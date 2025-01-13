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
fun VerdurasScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Green),
                title = { Text("Verduras", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues).fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ItemTabla(name = "Zanahoria", function = "Rico en vitamina A")
            ItemTabla(name = "Espinaca", function = "Ideal para ensaladas")
            ItemTabla(name = "Tomate", function = "Utilizado como verdura ")
            ItemTabla(name = "Pepino", function = "Fresco, ideal para ensaladas")
            ItemTabla(name = "Pimiento", function = "Diferentes colores y sabores")
            ItemTabla(name = "Calabacín", function = "Muy versátil en la cocina")
            ItemTabla(name = "Brócoli", function = "Rico en nutrientes")
            ItemTabla(name = "Coliflor", function = "Similar al brócoli pero blanco")
            ItemTabla(name = "Cebolla", function = "Base para muchas recetas")
            ItemTabla(name = "Ajo", function = "Condimento esencial")
        }
    }
}