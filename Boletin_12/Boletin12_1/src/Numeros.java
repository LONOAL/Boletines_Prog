import javax.swing.*;
import javax.swing.JPanel;
public class Numeros {

    public int pedirNumero(){

        int numero;

        JPasswordField pf = new JPasswordField();
        int opciones = JOptionPane.showConfirmDialog(null, pf, "Introduce un numero entre 1 y 50", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (opciones == JOptionPane.OK_OPTION) { numero = Integer.parseInt(new String(pf.getPassword()));
            while(numero<1|numero>50){
                JOptionPane.showConfirmDialog(null, pf, "Introduce un numero entre 1 y 50", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                numero = Integer.parseInt(new String(pf.getPassword()));
            }

        }
        else{
            numero=0;
        }
        return numero;


    }

    public int numeroIntentos(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero de intentos"));
        while(numero<1){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero de intentosr"));
        }
        return numero;
    }

    public void juegoPrincipal(int nadivinar, int nintentos){

        int intentos;
        int input;

        for(intentos=0;intentos<nintentos;intentos++){
            input=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 1 y 50"));
            if (input==nadivinar){
                JOptionPane.showMessageDialog(null,"Has acertado :)");
                break;
            }
            else if(input<nadivinar){
                JOptionPane.showMessageDialog(null,"Más grande."+"\n Te quedan "+(nintentos-intentos-1)+" intentos");
            }
            else{
                JOptionPane.showMessageDialog(null,"Más pequeño."+"\n Te quedan "+(nintentos-intentos-1)+" intentos");
            }
        }
    }





}
