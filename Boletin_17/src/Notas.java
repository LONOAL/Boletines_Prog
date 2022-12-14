import com.lorenzo.datos.getters;

import javax.swing.*;

public class Notas {

    public float calcularNotaT(){
        float notaA;
        float notaB;
        notaA= getters.getFloat("Introduce la primera nota:");
        while ((notaA<0)&&(notaA>10)) {
            JOptionPane.showMessageDialog(null, "Introduce una nota valida (entre 0 y 10)");
            notaA = getters.getFloat("Introduce la primera nota:");
        }
        notaB= getters.getFloat("Introduce la segunda nota:");
        while ((notaB<0)&&(notaB>10)){
            JOptionPane.showMessageDialog(null,"Introduce una nota valida (entre 0 y 10)");
            notaB= getters.getFloat("Introduce la segunda nota:");
        }
        return (((notaA+notaB)/2)*0.4f);
    }

    public float calcularNotaP(){
        float notaP;
        notaP= getters.getFloat("Introduce la nota de el examen práctico:");
        while ((notaP<0)&&(notaP>10)) {
            JOptionPane.showMessageDialog(null, "Introduce una nota valida (entre 0 y 10)");
            notaP = getters.getFloat("Introduce la nota de el examen práctico:");
        }
        return (notaP*0.4f);
    }

    public float calcularNotaB(){
        float boletinesE;
        float boletinesT;

        boletinesT= getters.getFloat("Nº total de boletines:");
        while (boletinesT<0) {
            JOptionPane.showMessageDialog(null, "El numero de boletines no puede ser negativo");
            boletinesT = getters.getFloat("Nº total de boletines:");
        }
        boletinesE= getters.getFloat("Nº de boletines entregados:");
        while ((boletinesE<0)&&(boletinesE>boletinesT)){
            JOptionPane.showMessageDialog(null,"El numero de boletines no puede ser negativo ni superior al total");
            boletinesE= getters.getFloat("Introduce la segunda nota:");
        }

        float porcentaje  = boletinesE * 100 / boletinesT;

        if (porcentaje>90){
            return 2;
        }else if ((porcentaje<=90)&&(porcentaje>=70)){
            return 1;
        }else
            return 0;
    }

}
