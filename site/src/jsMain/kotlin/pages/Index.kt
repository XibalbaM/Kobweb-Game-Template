package fr.xibalba.kobwebGameTemplate.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import fr.xibalba.kobwebGameTemplate.components.Game

@Page
@Composable
fun HomePage() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Game()
    }
}
