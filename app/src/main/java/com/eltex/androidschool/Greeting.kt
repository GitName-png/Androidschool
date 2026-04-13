package com.eltex.androidschool

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.eltex.androidschool.ui.theme.AndroidschoolTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.hello, name),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    AndroidschoolTheme {
        Greeting("Eltex")
    }
}

@Preview(showBackground = true, locale = "ru")
@Composable
private fun GreetingPreviewRu() {
    AndroidschoolTheme {
        Greeting("Eltex")
    }
}