/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin7_4;

/**
 *
 * @author PC-LORENZO
 */
public class Peso {
    public void difPeso(int peso1, int peso2){
        if(peso1>peso2){
            System.out.println(peso1+" Kg");
            System.out.println(peso2+" Kg");
            System.out.println("Diferencia: "+(peso1-peso2)+" Kg");
        }
        else if (peso1<peso2){
            System.out.println(peso2+" Kg");
            System.out.println(peso1+" Kg");
            System.out.println("Diferencia: "+(peso2-peso1)+" Kg");
        }
        else {
            System.out.println(peso1+" Kg");
            System.out.println("Pesan lo mismo");
        }
        
    }
}
