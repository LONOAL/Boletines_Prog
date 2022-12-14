import javax.swing.*;

public class Funciones {

    public int introducirOpcion(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Cuadrado. \n2.Triangulo. \n3.Circunferencia."));
        return opcion;
    }

    public int introducirNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclee el valor necesario para el calculo:"));
        return numero;
    }

    public int calcularAreaCuadrado(int lado){
        int area = lado*lado;
        return area;
    }

    public int calcularAreaTriangulo(int base, int altura){
        int area = base*altura/2;
        return area;
    }

    public double calcularAreaCircunferencia(int radio){
        double area= (Math.pow(radio, 2)*Math.PI);
        return area;
    }
    public void mostrarArea(double area){
        JOptionPane.showMessageDialog(null, "El area es= "+area);
    }

    public void mostrarMensaje(){
        JOptionPane.showMessageDialog(null,"Opcion invalida");
    }

}
