package com.lorenzo.Boletin_14;

import com.lorenzo.Partes.Cpu;
import com.lorenzo.Partes.Monitor;
import com.lorenzo.Partes.Teclado;

    /**
    * Boletin_14: Reune los valores de las partes del ordenador.
    *
    * @author Lorenzo Nogueira
    * @version 25.11.2022
    */

public class Ordenador {
    private Monitor mo;
    private Teclado te;
    private Cpu pro;
    private float precio;

    /**
     * Constructor vacio.
     */

    public Ordenador() {
    }

    /**
     * Constructor.
     * @param mo monitor: pulgadas.
     * @param te Teclado: marca.
     * @param pro Cpu: velocidade.
     */

    public Ordenador(Monitor mo, Teclado te, Cpu pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    /**
     * Getter.
     * @return mo: pulgadas.
     */

    public Monitor getMo() {
        return mo;
    }

    /**
     * Setter.
     * @param mo
     * Dar valor mo: pulgadas.
     */

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    /**
     * Getter.
     * @return te: pulgadas.
     */

    public Teclado getTe() {
        return te;
    }

    /**
     * Setter.
     * @param te
     * Dar valor te: marca.
     */

    public void setTe(Teclado te) {
        this.te = te;
    }

    /**
     * Getter.
     * @return pro: pulgadas.
     */

    public Cpu getPro() {
        return pro;
    }

    /**
     * Setter.
     * @param pro
     * Dar valor pro: velocidad.
     */

    public void setPro(Cpu pro) {
        this.pro = pro;
    }

    /**
     * Getter.
     * @return precio: pulgadas.
     */

    public float getPrecio() {
        return precio;
    }

    /**
     * Setter.
     * @param precio
     * Dar valor precio: precio.
     */

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " precio= " + precio;
    }
}
