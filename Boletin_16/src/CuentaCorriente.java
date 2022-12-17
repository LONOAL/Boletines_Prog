public class CuentaCorriente extends Conta {
    private final float interes=1.5f;

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);

    }

    @Override
    public String toString() {
        return
                super.toString()+" interes=" + interes
                ;
    }
}
