import javax.swing.*;

public class Conta {

    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }

    public Conta(long numeroConta, double saldo, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void ingresar(double cantIngresar){
        saldo=saldo+cantIngresar;
    }

    public void retirar(double cantRetirar){
        if ((saldo-cantRetirar)>=0){
            saldo=saldo-cantRetirar;
        }
        else
            JOptionPane.showMessageDialog(null,"Saldo insuficiente.");
    }

    public void actualizarSaldo(){

    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }
}
