package es.iesmz.ed.algoritmes;

public class Polidivisible {
    private long numero;

    public Polidivisible(long numero) {
        this.numero = numero;
    }
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
