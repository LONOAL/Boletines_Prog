import javax.swing.*;

public class Almacen {
public void articulos(String nombre, int ventas){

    if (ventas<=100){
        JOptionPane.showMessageDialog(null,nombre+"\nTipo de consumo: baixo.");
    }
    else if (100<ventas && ventas<=500) {
        JOptionPane.showMessageDialog(null,nombre+"\nTipo de consumo: medio.");
    }
    else if (500<ventas && ventas<=1000) {
        JOptionPane.showMessageDialog(null,nombre+"\nTipo de consumo: alto.");
    }
    else {
        JOptionPane.showMessageDialog(null,nombre+"\nTipo de consumo: primeira necesidade.");
    }
}





}
