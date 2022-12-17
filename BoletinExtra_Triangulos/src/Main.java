import javax.swing.*;

public class Main {

    final static int A=1;
    final static int B=2;
    final static int C=3;

    public static void main(String[] args) {
    Triangulos obx = new Triangulos();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Triangulo A. \n2.Triangulo B. \n3.Triangulo C."));

        switch (opcion){
            case A:
                obx.trianguloA(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas")));
                break;
            case B:
                obx.trianguloB(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas")));
                break;
            case C:
                obx.trianguloC(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas")));
                break;
            default:
                JOptionPane.showMessageDialog(null,"Introduzca una opcion valida.");
        }




    }
}