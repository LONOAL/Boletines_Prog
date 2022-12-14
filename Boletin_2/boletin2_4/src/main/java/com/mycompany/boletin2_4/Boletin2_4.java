

package com.mycompany.boletin2_4;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.print("Teclee o primeiro numero:");
        double numA= scaner.nextFloat();
        System.out.print("Teclee o segundo numero:");
        double numB= scaner.nextFloat ();
        double suma= numA + numB;
        double resta= numA - numB;
        double mult= numA * numB;
        double div= numA/numB;
        System.out.println("S= "+suma+"\nR= "+resta+"\nM= "+mult+"\nD= "+div);
        
    }
}
