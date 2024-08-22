package com.example.secret_vault_library

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun BarView(
    title: String,
    onBackNavClicked: () -> Unit= {}
){

    val navigationIcon : (@Composable () -> Unit)? =
        {
            IconButton(onClick = { onBackNavClicked() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = colorResource(id = R.color.color1),
                    contentDescription = null
                )
            }
        }

    TopAppBar(
        title = {
            Text(
                text = title,
                color = colorResource(id = R.color.color1),
                modifier = Modifier
                    .padding(start = 4.dp)
                    .heightIn(max = 24.dp)
            )
        },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.color4),
        navigationIcon = navigationIcon
    )
}