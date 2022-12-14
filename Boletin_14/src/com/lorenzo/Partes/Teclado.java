package com.lorenzo.Partes;

    /**
    * Boletin_14: Da valor a la marca del teclado.
    *
    * @author Lorenzo Nogueira
    * @version 25.11.2022
    */

public class Teclado {
    private String marca;

    /**
     * Constructor vacio.
     */

    public Teclado() {
    }

    /**
     * Constructor.
     * @param marca: marca.
     */

    public Teclado(String marca) {
        this.marca = marca;
    }

    /**
     * Getter.
     * @return marca: marca.
     */

    public String getMarca() {
        return marca;
    }

    /**
     * Setter.
     * @param marca
     * Dar valor marca.
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return " marca= " + marca;
    }
}
