package com.mexiti.costogasolina

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.hasSetTextAction
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.text.NumberFormat

@RunWith(AndroidJUnit4::class)
class CalculoGasolinaUITest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testCalculoUI_40l_22_35() {
        composeTestRule.setContent {
            CostoGasolinaTheme {
                CostGasLayout()
            }
        }

        composeTestRule.onAllNodes(hasSetTextAction())[0].performTextInput("22.35")
        composeTestRule.onAllNodes(hasSetTextAction())[1].performTextInput("40")

        val montoEsperado = NumberFormat.getCurrencyInstance().format(22.35 * 40.0)

        composeTestRule.onNodeWithText("Monto Total: $montoEsperado").assertIsDisplayed()
    }
}

