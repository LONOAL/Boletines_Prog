

package com.mycompany.boletin7_5;

import javax.swing.*;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin7_5 {

    public static void main(String[] args) {
        int numa= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));
        int numb= Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
        int numc= Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero: "));
        Numeros obx1 = new Numeros();
        obx1.numMayor(numa, numb, numc);
    }
}
