import javax.swing.*;

public class Cifras {
    public void contarCifras(int num){
        if ((num/10000)>=10){
            JOptionPane.showMessageDialog(null,"El numero no es valido.");
        }
        else if ((num/10000)>=1){
            JOptionPane.showMessageDialog(null,"Tiene 5 cifras.");
        }
        else if ((num/1000)>=1) {
            JOptionPane.showMessageDialog(null,"Tiene 4 cifras.");
        }
        else if ((num/100)>=1) {
            JOptionPane.showMessageDialog(null,"Tiene 3 cifras.");
        }
        else if ((num/10)>=1) {
            JOptionPane.showMessageDialog(null,"Tiene 2 cifras.");
        }
        else if ((num)>=1) {
            JOptionPane.showMessageDialog(null,"Tiene 1 cifras.");
        }
        else  {
            JOptionPane.showMessageDialog(null,"El numero no es valido.");
        }
    }
}
