package es.iesmz.ed.algoritmes;

/**
 * Esta clase comprueba si un número es polidivisible.
 *
 * @author: Francisco Romero Gálvez
 * @version: 02/06/2023
 */
public class Polidivisible {
    private long numero;

    /**
     * Constructor para pasar un número.
     *
     * @param numero El parámetro define un número para pasar por el constructor.
     */

    public Polidivisible(long numero) {
        this.numero = numero;
    }

    /**
     * Método que comprueba si un número es polidivisible, es decir, es divisible por su longitud.
     *
     * @return Devuelve true si el número es polidivisible. Si no lo es, devolverá false.
     */
    public boolean esPolidivisible() {
        String numeroString = String.valueOf(numero);
        for (int i = 1; i <= numeroString.length(); i++) {
            long numSeparado = Long.parseLong(numeroString.substring(0, i));
            if (numSeparado % i != 0) {
                return false;
            }
        }
        return true;
    }
}
