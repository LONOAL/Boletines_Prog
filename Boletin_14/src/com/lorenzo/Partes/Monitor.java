package com.lorenzo.Partes;

    /**
    * Boletin_14: Da valor a las pulgadas del monitor.
    *
    * @author Lorenzo Nogueira
    * @version 25.11.2022
    */

public class Monitor {
    private float pulgadas;

    /**
    * Constructor vacio.
    */

    public Monitor() {
    }

    /**
     * Constructor.
     * @param pulgadas: pulgadas.
     */

    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    /**
     * Getter.
     * @return pulgadas: pulgadas.
     */

    public float getPulgadas() {
        return pulgadas;
    }

    /**
     * Setter.
     * @param pulgadas
     * Dar valor pulgadas.
     */

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return " pulgadas= " + pulgadas;
    }
}
