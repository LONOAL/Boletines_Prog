
package com.mycompany.boletin2_3;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin2_3 {

    public static void main(String[] args) {
    Scanner scaner= new Scanner(System.in);
    System.out.println("Teclee o dinero a cambiar.");
    float dinero= scaner.nextFloat();
    System.out.println("Teclee o precio da moneda a que desea cambiar.");
    float cambio= scaner.nextFloat();
    float rcambio= dinero * cambio;
    System.out.println("Dinero= " + dinero + " Al cambio= " + rcambio);
    }
}
