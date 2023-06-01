package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {

    @Test
    void primeraSuma() {
        SumaDescendent suma = new SumaDescendent(2222);
        long resultadoEsperado = suma.suma();
        long resultadoReal = 2468;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    void SegundaSuma() {
        SumaDescendent suma = new SumaDescendent(594198);
        long resultadoEsperado = suma.suma();
        long resultadoReal = 692898;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    void TerceraSuma() {
        SumaDescendent suma = new SumaDescendent(500001);
        long resultadoEsperado = suma.suma();
        long resultadoReal = 500006;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    void CuartaSuma() {
        SumaDescendent suma = new SumaDescendent(0);
        long resultadoEsperado = suma.suma();
        long resultadoReal = 0;
        assertEquals(resultadoReal, resultadoEsperado);
    }
}