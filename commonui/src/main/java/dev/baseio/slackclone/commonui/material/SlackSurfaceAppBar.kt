package dev.baseio.slackclone.commonui.material

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.baseio.slackclone.commonui.theme.SlackCloneSurface
import dev.baseio.slackclone.commonui.theme.SlackCloneTheme

@Composable
fun SlackSurfaceAppBar(
  title: @Composable () -> Unit,
  modifier: Modifier = Modifier,
  navigationIcon: @Composable (() -> Unit)? = null,
  actions: @Composable RowScope.() -> Unit = {},
  backgroundColor: Color = MaterialTheme.colors.primarySurface,
  contentColor: Color = contentColorFor(backgroundColor),
  elevation: Dp = AppBarDefaults.TopAppBarElevation,
) {
  SlackCloneSurface(
    color = SlackCloneTheme.colors.uiBackground,
    contentColor = SlackCloneTheme.colors.accent,
  ) {
    TopAppBar(
      title, modifier, navigationIcon, actions, backgroundColor, contentColor, elevation
    )
  }
}

@Composable
fun SlackSurfaceAppBar(
  modifier: Modifier = Modifier,
  backgroundColor: Color = MaterialTheme.colors.primarySurface,
  contentColor: Color = contentColorFor(backgroundColor),
  elevation: Dp = AppBarDefaults.TopAppBarElevation,
  contentPadding: PaddingValues = AppBarDefaults.ContentPadding,
  content: @Composable RowScope.() -> Unit
) {
  SlackCloneSurface(
    color = SlackCloneTheme.colors.uiBackground,
    contentColor = SlackCloneTheme.colors.accent,
  ) {
    TopAppBar(
      modifier, backgroundColor, contentColor, elevation, contentPadding, content
    )
  }
}