package com.example.secret_vault_library

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeView(){

    Scaffold(
        topBar = {
            BarView(title = "Secret Vault Library")
        }
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(it)){
        }
    }
}