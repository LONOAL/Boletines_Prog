

package com.mycompany.boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin7_1 {

    public static void main(String[] args) {
        Positivo obx = new Positivo ();
        String num= JOptionPane.showInputDialog("Teclee un numero");
        int numero= Integer.parseInt(num);
        System.out.println(num);
        obx.numPositivo(numero);
    }
}
