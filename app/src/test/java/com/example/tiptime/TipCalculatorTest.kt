package com.example.tiptime
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.0
        val tipPercent = 20.0
        val expected_tip = NumberFormat.getCurrencyInstance().format(2)
        val actual_tip = calculateTip(amount, tipPercent, false)

        assertEquals(expected_tip, actual_tip)
    }
}