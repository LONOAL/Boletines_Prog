import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre= JOptionPane.showInputDialog("Introduce el nombre del articulo:");
        int ventas= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de ventas:"));
        Almacen obx= new Almacen();
        obx.articulos(nombre,ventas);
    }
}