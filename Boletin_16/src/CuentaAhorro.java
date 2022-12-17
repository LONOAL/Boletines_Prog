public class CuentaAhorro extends Conta{
    private float interes;
    public double balaceMinimo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(long numeroConta, double saldo, Persoa cliente, float interes, double balaceMinimo) {
        super(numeroConta, saldo, cliente);
        this.interes = interes;
        this.balaceMinimo = balaceMinimo;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return
                " interes=" + interes+
        " balaceMinimo=" + balaceMinimo
        ;
    }
}
