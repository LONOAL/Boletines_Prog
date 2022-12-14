import javax.swing.*;

public class Areas {
    public void calculoAreas() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el area a calcular: \n1. Cuadrado.\n2. Trianguo.\n3. Circulo."));
        if (opcion <= 3 && opcion >= 1) {
            switch (opcion) {
                case 1:
                    float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el lado:"));
                    JOptionPane.showMessageDialog(null, "Area= " + lado * 2);
                    break;
                case 2:
                    float base = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base:"));
                    float altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura:"));
                    JOptionPane.showMessageDialog(null,"Area= " + base * altura / 2);
                    break;
                case 3:
                    float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el radio:"));
                    JOptionPane.showMessageDialog(null, "Area= " + Math.pow(radio, 2) * Math.PI);
            }
        }
    }
    }

