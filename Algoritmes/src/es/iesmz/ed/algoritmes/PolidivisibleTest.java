package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolidivisibleTest {

    @Test
    void esPolidivisible1() {
        Polidivisible poli = new Polidivisible(102);
        boolean resultadoEsperado = poli.esPolidivisible();
        assertTrue(resultadoEsperado);
    }

    @Test
    void esPolidivisible2() {
        Polidivisible poli = new Polidivisible(9876);
        boolean resultadoEsperado = poli.esPolidivisible();
        assertTrue(resultadoEsperado);
    }

    @Test
    void esPolidivisible3() {
        Polidivisible poli = new Polidivisible(381654729);
        boolean resultadoEsperado = poli.esPolidivisible();
        assertTrue(resultadoEsperado);
    }

    @Test
    void esPolidivisible4() {
        Polidivisible poli = new Polidivisible(392104856);
        boolean resultadoEsperado = poli.esPolidivisible();
        assertFalse(resultadoEsperado);
    }

    @Test
    void esPolidivisible5() {
        Polidivisible poli = new Polidivisible(101);
        boolean resultadoEsperado = poli.esPolidivisible();
        assertFalse(resultadoEsperado);
    }
}
