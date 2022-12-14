
package com.mycompany.boletin3_2;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin3_2 {

 public static void main(String[] args) {
       float grados, k, f;
       Scanner scaner= new Scanner(System.in);
       System.out.print("Introduzca el valor en grados celsius:");
       grados= scaner.nextFloat();
       f= (grados*9/5)-32;
       k= (float) (grados+273.15);
       System.out.print("Celsius: "+grados+"\nFahrenheit: "+f+"\nKelvin: "+k);
    }
}