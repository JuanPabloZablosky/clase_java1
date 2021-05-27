package ejercicio1;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(){

    }

    public CuentaCorriente(double saldo){
        setSaldo(saldo);
    }

    public CuentaCorriente(CuentaCorriente cc){
        setSaldo(cc.getSaldo());
    }

    public void ingreso(double monto){
        saldo += monto;
    }

    public void egreso(double monto){
        saldo -= monto;
    }

    public void reintegro(double monto, CuentaCorriente cc){
        cc.egreso(monto);
        this.ingreso(monto);
    }

    public void transferencia(double monto, CuentaCorriente cc){
        cc.ingreso(monto);
        this.egreso(monto);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
