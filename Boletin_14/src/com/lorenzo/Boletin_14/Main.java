package com.lorenzo.Boletin_14;

import com.lorenzo.Partes.Cpu;
import com.lorenzo.Partes.Monitor;
import com.lorenzo.Partes.Teclado;

/**
 * Boletin_14: Main.
 *
 * @author Lorenzo Nogueira
 * @version 25.11.2022
 */

public class Main {
    public static void main(String[] args) {
        Monitor mo = new Monitor(27);
        Teclado te = new Teclado("Logitech");
        Cpu pro = new Cpu(5);
        Ordenador pc = new Ordenador();
        pc.setPrecio(750);
        System.out.println(mo.toString()+te.toString()+pro.toString()+pc.toString());


    }
}