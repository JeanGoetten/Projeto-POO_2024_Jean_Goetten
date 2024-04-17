package Conta;

public abstract class Conta {

    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public abstract void depoisto(float valor);
    public abstract boolean saque(float valor);
    public abstract void verificarSaldo();

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
