
package com.mycompany.boletin3_4;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin3_4 {

public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int total, b100, b20, b5, m1;
    System.out.print("Teclee la cantidad de dinero: ");
    total= scan.nextInt();
    b100=total/100;
    b20=total%100/20;
    b5= total%100%20/5;
    m1=total%100%20%5;
    System.out.print("Billetes de 100: "+b100+"\nBilletes de 20: "+b20+"\nBilletes de 5: "+b5+"\nMonedas de 1: "+m1);
    }
}