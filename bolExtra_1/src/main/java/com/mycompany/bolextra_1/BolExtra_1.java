

package com.mycompany.bolextra_1;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class BolExtra_1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float base, iva, total;
        System.out.print("Teclee o prezo base do producto: ");
        base= scan.nextFloat();
        System.out.print("Teclee o ive: ");
        iva= scan.nextFloat();
        total= base+base * iva / 100;
        System.out.println("Importe: "+base+" €"+ ", IVA: "+base*iva/100+" €"+", Total: "+total+" €");
        
    }
}
