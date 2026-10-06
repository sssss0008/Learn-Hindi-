package com.example.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Quiz
import androidx.compose.material.icons.outlined.School
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.model.AppLanguage
import com.example.model.NavTab

@Composable
fun AppBottomNav(
    currentTab: NavTab,
    language: AppLanguage,
    onTabSelected: (NavTab) -> Unit
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        // Tab 1: Home
        val homeLabel = when (language) {
            AppLanguage.HINDI -> NavTab.HOME.titleHi
            AppLanguage.NEPALI -> NavTab.HOME.titleNe
            AppLanguage.ENGLISH -> NavTab.HOME.titleEn
        }
        NavigationBarItem(
            selected = currentTab == NavTab.HOME,
            onClick = { onTabSelected(NavTab.HOME) },
            icon = {
                Icon(
                    imageVector = if (currentTab == NavTab.HOME) Icons.Filled.Home else Icons.Outlined.Home,
                    contentDescription = homeLabel
                )
            },
            label = {
                Text(
                    text = homeLabel,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = if (currentTab == NavTab.HOME) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 11.sp
                    )
                )
            },
            modifier = Modifier.testTag("nav_tab_home"),
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = MaterialTheme.colorScheme.primary,
                selectedTextColor = MaterialTheme.colorScheme.primary,
                indicatorColor = MaterialTheme.colorScheme.primaryContainer
            )
        )

        // Tab 2: Learn
        val learnLabel = when (language) {
            AppLanguage.HINDI -> NavTab.LEARN.titleHi
            AppLanguage.NEPALI -> NavTab.LEARN.titleNe
            AppLanguage.ENGLISH -> NavTab.LEARN.titleEn
        }
        NavigationBarItem(
            selected = currentTab == NavTab.LEARN,
            onClick = { onTabSelected(NavTab.LEARN) },
            icon = {
                Icon(
                    imageVector = if (currentTab == NavTab.LEARN) Icons.Filled.School else Icons.Outlined.School,
                    contentDescription = learnLabel
                )
            },
            label = {
                Text(
                    text = learnLabel,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = if (currentTab == NavTab.LEARN) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 11.sp
                    )
                )
            },
            modifier = Modifier.testTag("nav_tab_learn"),
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = MaterialTheme.colorScheme.primary,
                selectedTextColor = MaterialTheme.colorScheme.primary,
                indicatorColor = MaterialTheme.colorScheme.primaryContainer
            )
        )

        // Tab 3: Practice
        val practiceLabel = when (language) {
            AppLanguage.HINDI -> NavTab.PRACTICE.titleHi
            AppLanguage.NEPALI -> NavTab.PRACTICE.titleNe
            AppLanguage.ENGLISH -> NavTab.PRACTICE.titleEn
        }
        NavigationBarItem(
            selected = currentTab == NavTab.PRACTICE,
            onClick = { onTabSelected(NavTab.PRACTICE) },
            icon = {
                Icon(
                    imageVector = if (currentTab == NavTab.PRACTICE) Icons.Filled.Quiz else Icons.Outlined.Quiz,
                    contentDescription = practiceLabel
                )
            },
            label = {
                Text(
                    text = practiceLabel,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = if (currentTab == NavTab.PRACTICE) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 11.sp
                    )
                )
            },
            modifier = Modifier.testTag("nav_tab_practice"),
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = MaterialTheme.colorScheme.primary,
                selectedTextColor = MaterialTheme.colorScheme.primary,
                indicatorColor = MaterialTheme.colorScheme.primaryContainer
            )
        )

        // Tab 4: About & Culture
        val aboutLabel = when (language) {
            AppLanguage.HINDI -> "परिचय व संस्कृति"
            AppLanguage.NEPALI -> "परिचय र संस्कृति"
            AppLanguage.ENGLISH -> "About & Culture"
        }
        NavigationBarItem(
            selected = currentTab == NavTab.ABOUT,
            onClick = { onTabSelected(NavTab.ABOUT) },
            icon = {
                Icon(
                    imageVector = if (currentTab == NavTab.ABOUT) Icons.Filled.Info else Icons.Outlined.Info,
                    contentDescription = aboutLabel
                )
            },
            label = {
                Text(
                    text = aboutLabel,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = if (currentTab == NavTab.ABOUT) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 11.sp
                    )
                )
            },
            modifier = Modifier.testTag("nav_tab_about"),
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = MaterialTheme.colorScheme.primary,
                selectedTextColor = MaterialTheme.colorScheme.primary,
                indicatorColor = MaterialTheme.colorScheme.primaryContainer
            )
        )
    }
}
