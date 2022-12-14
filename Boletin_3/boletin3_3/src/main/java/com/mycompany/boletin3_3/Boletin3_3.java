
package com.mycompany.boletin3_3;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin3_3 {

 public static void main(String[] args) {
  
double b100,b20,b5,m1,total;
Scanner scan= new Scanner(System.in);
b100= scan.nextDouble();
b20= scan.nextDouble();
b5= scan.nextDouble();
m1= scan.nextDouble();
total= b100*100+b20*20+b5*5+m1;
System.out.println("Billetes de 100:"+b100+"\nBilletes de 20:"+b20+"\nBilletes de 5: "+b5+"\nMonedas de 1: "+m1+"\nTotal: "+total+" €");

    }
}