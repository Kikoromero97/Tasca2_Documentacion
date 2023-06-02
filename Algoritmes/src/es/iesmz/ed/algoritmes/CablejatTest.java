package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {

    @Test
    void SoloDosCables() {
        Cablejat cables = new Cablejat(new String[]{"MM", "HH"});
        boolean resultadoEsperado = cables.esPotConnectar();
        assertTrue(resultadoEsperado);
    }

    @Test
    void SoloMachos() {
        Cablejat cables = new Cablejat(new String[]{"MM", "MM"});
        boolean resultadoEsperado = cables.esPotConnectar();
        assertFalse(resultadoEsperado);
    }

    @Test
    void SoloHembras() {
        Cablejat cables = new Cablejat(new String[]{"FF", "FF"});
        boolean resultadoEsperado = cables.esPotConnectar();
        assertFalse(resultadoEsperado);
    }

    @Test
    void SoloTresCables() {
        Cablejat cables = new Cablejat(new String[]{"MH", "HM", "HH"});
        boolean resultadoEsperado = cables.esPotConnectar();
        assertTrue(resultadoEsperado);
    }
    @Test
    void SoloCincoCables() {
        Cablejat cables = new Cablejat(new String[]{"MH", "MM", "MM", "HH", "MH"});
        boolean resultadoEsperado = cables.esPotConnectar();
        assertTrue(resultadoEsperado);
    }
}