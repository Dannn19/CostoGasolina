package com.mexiti.costogasolina

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalculosGasolinaTest {

    @Test
    fun calcularMonto_40l_22_35() {
        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)
        val montoActual = calcularMonto(precio, cantLitros, darPropina, propina)

        assertEquals(montoEsperado, montoActual)
    }
}

