

package com.mycompany.boletin2_5;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Teclee el numero de millas.");
        float millas= scaner.nextFloat();
        float metros= 1852;
        float resultado= millas * metros;
        System.out.println("Millas= "+millas+"\nResultado en m= "+resultado);
    }
}
