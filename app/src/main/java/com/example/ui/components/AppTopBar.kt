package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Hearing
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.AppLanguage
import com.example.model.NavTab
import com.example.util.ContactHelper
import com.example.viewmodel.MainViewModel
import com.example.viewmodel.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    state: UiState,
    viewModel: MainViewModel,
    onMenuClick: () -> Unit
) {
    var showLangMenu by remember { mutableStateOf(false) }

    val tabTitle = when (state.currentTab) {
        NavTab.HOME -> when (state.language) {
            AppLanguage.HINDI -> "नमस्ते • हिन्दी सीखें"
            AppLanguage.NEPALI -> "नमस्ते • हिन्दी सिक्नुहोस्"
            AppLanguage.ENGLISH -> "Hindi Bhasha Learning"
        }
        NavTab.LEARN -> when (state.language) {
            AppLanguage.HINDI -> "अध्ययन • सीखें"
            AppLanguage.NEPALI -> "अध्ययन • सिक्नुहोस्"
            AppLanguage.ENGLISH -> "Learn & Master"
        }
        NavTab.PRACTICE -> when (state.language) {
            AppLanguage.HINDI -> "अभ्यास और प्रश्नोत्तरी"
            AppLanguage.NEPALI -> "अभ्यास र प्रश्नोत्तरी"
            AppLanguage.ENGLISH -> "Practice & Quizzes"
        }
        NavTab.ABOUT -> when (state.language) {
            AppLanguage.HINDI -> "संस्कृति, इतिहास व संपर्क"
            AppLanguage.NEPALI -> "संस्कृति, इतिहास र सम्पर्क"
            AppLanguage.ENGLISH -> "Culture & Developer"
        }
    }

    TopAppBar(
        title = {
            Column {
                Text(
                    text = tabTitle,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.3.sp
                    ),
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Text(
                    text = "Hindi • Nepali • English",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.85f)
                )
            }
        },
        navigationIcon = {
            IconButton(
                onClick = onMenuClick,
                modifier = Modifier.testTag("top_bar_menu_button")
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Open Navigation Menu",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        },
        actions = {
            // Streak badge
            Surface(
                color = MaterialTheme.colorScheme.secondaryContainer,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(end = 6.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.LocalFireDepartment,
                        contentDescription = "Daily Streak",
                        tint = Color(0xFFD97706),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = "${state.streak}d",
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold),
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                }
            }

            // Language Selector Button
            Box {
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { showLangMenu = true }
                        .padding(horizontal = 8.dp, vertical = 5.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Language,
                            contentDescription = "Language",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = when (state.language) {
                                AppLanguage.ENGLISH -> "EN"
                                AppLanguage.HINDI -> "हिन्दी"
                                AppLanguage.NEPALI -> "नेपाली"
                            },
                            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                DropdownMenu(
                    expanded = showLangMenu,
                    onDismissRequest = { showLangMenu = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("English (English)") },
                        leadingIcon = {
                            RadioButton(
                                selected = state.language == AppLanguage.ENGLISH,
                                onClick = null
                            )
                        },
                        onClick = {
                            viewModel.setLanguage(AppLanguage.ENGLISH)
                            showLangMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("हिन्दी (Hindi)") },
                        leadingIcon = {
                            RadioButton(
                                selected = state.language == AppLanguage.HINDI,
                                onClick = null
                            )
                        },
                        onClick = {
                            viewModel.setLanguage(AppLanguage.HINDI)
                            showLangMenu = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("नेपाली (Nepali)") },
                        leadingIcon = {
                            RadioButton(
                                selected = state.language == AppLanguage.NEPALI,
                                onClick = null
                            )
                        },
                        onClick = {
                            viewModel.setLanguage(AppLanguage.NEPALI)
                            showLangMenu = false
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.width(6.dp))
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}
