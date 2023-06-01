package es.iesmz.ed.algoritmes;

/**
 * Esta clase suma todos los dígitos de un número de forma descendente.
 * @author: Francisco Romero Gálvez
 * @version: 01/06/2023
 */

public class SumaDescendent {
    private final long numero;

    /**
     * Constructor para pasar el número que se desea sumar.
     * @param numero El parámetro define el número que se va a pasar al método suma().
     */

    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    /**
     * Método que suma los dígitos de un número. Devuelve el resultado de la suma.
     * @return Es la suma de los dígitos del número.
     */

    public long suma() {
        String numeroString = String.valueOf(numero);
        int numeroEntero = numeroString.length();
        long suma = 0;
        for (int i = 0; i < numeroEntero; i++) {
            String substringNumero = numeroString.substring(i);
            long numeroSeparado = Long.parseLong(substringNumero);
            suma += numeroSeparado;
        }
        return suma;
    }
}
