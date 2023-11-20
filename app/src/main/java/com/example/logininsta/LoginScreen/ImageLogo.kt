package com.example.logininsta.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.logininsta.R


@Composable
fun ImageLogo(modifier: Modifier) {
    Image(painter = painterResource(id = R.drawable.insta),
        contentDescription = null,
        modifier = modifier)
}