package es.iesmz.ed.algoritmes;

public class Cablejat {
    private String [] conectores;

    public Cablejat(String[] conectores) {
        this.conectores = conectores;
    }

    public boolean esPotConnectar() {
        boolean sePuede = false;
        for (int i = 0; i < conectores.length; i++) {
            if (conectores[0].startsWith("H") && conectores[conectores.length - 1].endsWith("M")) {
                sePuede = true;
            } else if (conectores[0].startsWith("M") && conectores[conectores.length - 1].endsWith("H")) {
                sePuede = true;
            }
        }
        return sePuede;
    }
}
