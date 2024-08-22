package com.example.secret_vault_library

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun HomeView(){

    val context = LocalContext.current

    Scaffold(
        topBar = {BarView(title = "Secret Vault Library", {
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
        })}
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(it)){
        }
    }
}