import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int area;

        b=Integer.parseInt(JOptionPane.showInputDialog("Teclee la base"));
        a=Integer.parseInt(JOptionPane.showInputDialog("Teclee la altura"));

        if(a<0|b<0){
            System.out.println("Teclee un numero positivo");
        }
        else{
        area=b*a;
            System.out.println("Area= "+area);
        }
    }
}