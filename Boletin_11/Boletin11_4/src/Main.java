import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Metodos obx = new Metodos();

        int num=1;

        while (num != 0) {
            System.out.println(obx.tabla(num=Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero"))));

        }
    }
}