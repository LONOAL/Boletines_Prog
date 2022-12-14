/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin7_4 {

    public static void main(String[] args) {
        Peso obx1= new Peso();
        int pe1= Integer.parseInt(JOptionPane.showInputDialog("Teclee o peso da primeira persoa:"));
        int pe2= Integer.parseInt(JOptionPane.showInputDialog("Teclee o peso da segunda persoa:"));
        obx1.difPeso(pe1, pe2);
    }
}
