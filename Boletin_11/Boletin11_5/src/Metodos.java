import javax.swing.*;

public class Metodos {


    public int numeroTrabajadores(){
        int ntrab=Integer.parseInt(JOptionPane.showInputDialog("Teclee el número de trabajadores"));
        if (ntrab<=0){
            JOptionPane.showMessageDialog(null,"El numero de trabajadores debe de ser mayor que 0.");
            ntrab=Integer.parseInt(JOptionPane.showInputDialog("Teclee el número de trabajadores"));
            return ntrab;
        }
        else{
            return ntrab;
        }
    }



    public int pedirSueldos (int ntrab){

        int sueldoalto=0;
        int sueldobajo=0;
        int sueldo;
        int totalsueldos=0;
        int nsueldos;

        for(nsueldos=0;nsueldos<ntrab;nsueldos++) {

            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Teclee un salario"));
            if (sueldo < 0) {
                nsueldos--;
                JOptionPane.showMessageDialog(null, "Teclee un sueldo positivo");
            } else{
                totalsueldos = totalsueldos + sueldo;

                if (sueldo < 1750 && sueldo > 1000) {
                 sueldoalto++;
                 sueldo = 0;
                } else if (sueldo < 1000) {
                 sueldobajo++;
                 sueldo = 0;
                } else {
                 sueldo = 0;
             }
        }
        }
        System.out.println(sueldoalto+" trabajadores cobran entre 1000 y 1750 euros.");
        System.out.println((sueldobajo*100/ntrab)+" % "+"de trabajadores cobran menos de 1000 euros.");
        return totalsueldos;
    }







}
