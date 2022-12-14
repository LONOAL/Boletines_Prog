
package com.mycompany.boletin3_1;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin3_1 {

public static void main(String[] args) {
    Scanner scaner= new Scanner(System.in);
    double tarifa, pagado, descuento;
    System.out.print("Teclee o precio pagado:");
    pagado=scaner.nextDouble();
    System.out.print("Teclee o precio sen desconto:");
    tarifa=scaner.nextDouble();
    descuento= (tarifa-pagado)*100/tarifa;
    System.out.print("El descuento es de un " + descuento + "%");
    }
}