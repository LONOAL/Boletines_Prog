/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin7_3 {

    public static void main(String[] args) {
        Numero obx1= new Numero();
        int num= Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero"));
        obx1.positivo(num);
    }
}
