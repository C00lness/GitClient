package com.example.gitclient

import android.widget.EditText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class SimpleUiTest {
    @get:Rule
    val activityRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testSubstringText() {
        activityRule.onNodeWithText("Начните", true).assertIsDisplayed()
    }

    @Test
    fun testTextEditText() {
        activityRule.onNodeWithTag("editText").assertIsDisplayed()
    }
}