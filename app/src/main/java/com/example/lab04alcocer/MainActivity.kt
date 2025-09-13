package com.example.lab04alcocer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Aquí definimos la UI
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    // Colocamos varios componentes
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Componente 1: Botón con estilo
        Button(
            onClick = { /* Acción del botón */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Presionar",
                fontSize = 18.sp,
                color = Color.White
            )
        }

        // Componente 2: Texto de ejemplo (para que luego lo modifiques)
        Text(
            text = "Soy el segundo componente",
            fontSize = 22.sp,
            color = Color.Blue
        )

        // Componente 3: Caja de texto
        var texto by remember { mutableStateOf("") }
        BasicTextField(
            value = texto,
            onValueChange = { texto = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
    }
}
