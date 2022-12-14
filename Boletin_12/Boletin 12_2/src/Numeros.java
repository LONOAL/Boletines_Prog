import javax.swing.*;

public class Numeros {

    public int generarNumero() {
        return (int) (Math.random() * (50 - 1) + 1);
    }

    public int pedirIntentos() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero de intentos"));
        while (numero < 1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero de intentosr"));
        }
        return numero;
    }

    public void juegoPrincipal(int nadivinar, int nintentos) {


        int intentos;
        int input;

        for (intentos = 0; intentos < nintentos; intentos++) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 1 y 50"));
            if (input == nadivinar) {
                JOptionPane.showMessageDialog(null, "Has acertado :)");
                break;
            } else if (Math.abs(nadivinar - input) > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos." + "\n Te quedan " + (nintentos - intentos - 1) + " intentos");
            } else if ((Math.abs(nadivinar - input) <= 20) && (Math.abs(nadivinar - input) >= 10)) {
                JOptionPane.showMessageDialog(null, "Lejos." + "\n Te quedan " + (nintentos - intentos - 1) + " intentos");
            } else if ((Math.abs(nadivinar - input) < 10) && (Math.abs(nadivinar - input) > 5)) {
                JOptionPane.showMessageDialog(null, "Cerca." + "\n Te quedan " + (nintentos - intentos - 1) + " intentos");
            } else {
                JOptionPane.showMessageDialog(null, "Muy cerca." + "\n Te quedan " + (nintentos - intentos - 1) + " intentos");
            }
        }
    }


}
