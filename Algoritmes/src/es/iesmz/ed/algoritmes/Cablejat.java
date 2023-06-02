package es.iesmz.ed.algoritmes;
/**
 * Esta clase comprueba si pueden conectarse cables formando un círculo.
 * @author: Francisco Romero Gálvez
 * @version: 02/06/2023
 */
public class Cablejat {
    private String [] conectores;

    /**
     * Constructor para pasar un vector de Strings con los cables.
     * @param conectores El parámetro define un vector con una cantidad de cables definidos.
     */
    public Cablejat(String[] conectores) {
        this.conectores = conectores;
    }

    /**
     * Método que comprueba si el primer cable y el último pueden conectarse. Devuelve si se pueden conectar.
     * @return Devuelve true si puede conectarse, false si no es posible.
     */
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
