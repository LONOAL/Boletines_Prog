

package com.mycompany.boletin3_5;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin3_5 {

 public static void main(String[] args) {
       
    
     Scanner scan= new Scanner(System.in);
     double soldoFixo, ventas, km, dietas, soldoTotal;
     System.out.print("Teclee o soldo bruto: ");
     soldoFixo= scan.nextDouble();
     System.out.print("Teclee as ventas totales: "); 
     ventas= scan.nextDouble();
     System.out.print("Teclee os kilometros recorridos: ");
     km= scan.nextDouble();
     System.out.print("Teclee os dias con desprazamento: ");
     dietas= scan.nextDouble();
     soldoTotal= (soldoFixo+ventas*0.05+km*2+dietas*30)*0.82-36;
     double soldoTotalT = Math.round(soldoTotal*100.0)/100.0;
     System.out.println("Soldo bruto: "+(soldoFixo+ventas*0.05+km*2+dietas*30)+" Soldo total: "+soldoTotalT);
    }
}
