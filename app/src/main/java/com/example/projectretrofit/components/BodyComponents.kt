package com.example.projectretrofit.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.projectretrofit.util.Constants.Companion.CUSTOM_BLACK
import com.example.projectretrofit.viewModel.GamesViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title: String, showBackButton: Boolean = false, onClickBackButton: ()-> Unit){
    TopAppBar(
        title = { Text(text = title, color = Color.White, fontWeight = FontWeight.ExtraBold)},
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(CUSTOM_BLACK)
        ),
        navigationIcon = {
            if (showBackButton){
                IconButton(onClick = { onClickBackButton() }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)
                }
            }
        }
    )
}
