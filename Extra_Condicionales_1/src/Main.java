import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    int numero=Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero:"));
    Cifras obx= new Cifras();
    obx.contarCifras(numero);
    }
}