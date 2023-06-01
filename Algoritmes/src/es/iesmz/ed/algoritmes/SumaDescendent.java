package es.iesmz.ed.algoritmes;

public class SumaDescendent {
    private final long numero;

    public SumaDescendent(long numero) {
        this.numero = numero;
    }

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
