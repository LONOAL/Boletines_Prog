
package com.mycompany.boletin7_5;

import javax.swing.*;

/**
 *
 * @author PC-LORENZO
 */
public class Numeros {

    
    public void numMayor(int numa, int numb, int numc){
        if (numa>numb && numa>numc){
            JOptionPane.showMessageDialog(null,"El primer numero es el mayor: "+numa);
        }
        else if (numb>numa && numb>numc) {
            JOptionPane.showMessageDialog(null, "El segundo número es el mayor: "+numb);
        }
        else if (numc>numa && numc>numb){
            JOptionPane.showMessageDialog(null, "El tercer numero es el mayor: "+numc);
        }
        else {
            JOptionPane.showMessageDialog(null, "Hay varios numeros iguales");
        }
    }
            
            
    
}
