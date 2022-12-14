import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int ntrab;
        int salariototal;

        Metodos obx= new Metodos();

        ntrab=obx.numeroTrabajadores();
        salariototal=obx.pedirSueldos(ntrab);
        System.out.println("El sueldo total es de: "+salariototal+" €");
    }
}