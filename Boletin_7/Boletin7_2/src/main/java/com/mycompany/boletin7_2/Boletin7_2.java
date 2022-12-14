/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin7_2 {

    public static void main(String[] args) {
        Operaciones obx = new Operaciones ();
        String num1= JOptionPane.showInputDialog("Teclee un numero");
        int numero1= Integer.parseInt(num1);
        String num2= JOptionPane.showInputDialog("Teclee otro numero");
        int numero2= Integer.parseInt(num2);
        System.out.println(num1);
        System.out.println(num2);
        obx.sumaResta(numero1, numero2);
    }
}

    
