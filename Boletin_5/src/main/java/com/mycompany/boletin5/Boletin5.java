
package com.mycompany.boletin5;

/**
 *
 * @author PC-LORENZO
 */
public class Boletin5 {

    public static void main(String[] args) {
        consumo obxconsumo1= new consumo();
        obxconsumo1.setLitros(50);
        obxconsumo1.setpGas(1.57f);
        obxconsumo1.consumoEuros();
        consumo obxconsumo2= new consumo(200f, 50f, 2,1.85f);
        int velocidadMedia= obxconsumo2.getvMed();
        System.out.println(velocidadMedia+" Km/h");
    }
}
