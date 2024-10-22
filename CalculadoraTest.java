package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 + 3 debe ser 5");
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), "La resta de 3 - 2 debe ser 1");
    }
}
