import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num=0;
        int n=0;
        int p=0;
        int c=0;
        short i;

        for (i=0;i<10;i++){
            num= Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero:"));
            if(num<0){
                n++;
            } else if (num==0) {
                c++;
            }
            else{
                p++;
            }
        }
        System.out.println("Positivos: "+p+" Negativos: "+n+" Ceros: "+c);
    }
}