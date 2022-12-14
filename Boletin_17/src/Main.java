import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();
        DecimalFormat formato1 = new DecimalFormat("#.00");
        int option;
    do {
        float notaT = notas.calcularNotaT();
        float notaP = notas.calcularNotaP();
        float notaB = notas.calcularNotaB();
        float notaG = notaB + notaP + notaT;
        System.out.println("PROBAS TEÓRICAS……………" + formato1.format(notaT) +
                "\nPROBAS PRÁCTICA……………" + formato1.format(notaP) +
                "\nBOLETÍNS  ………………………." + formato1.format(notaB) +
                "\nNOTA TOTAL……………………" + formato1.format(notaG));
        option= JOptionPane.showConfirmDialog(null,"Quieres calcular otra nota");
    }while (option==0);

    }
}