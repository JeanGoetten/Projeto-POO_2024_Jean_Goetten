package Conta;

public class ContaPoupança extends Conta{
    public ContaPoupança(int saldo) {
        super(saldo);
    }

    @Override
    public void depoisto(float valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public boolean saque(float valor) {
        if(getSaldo() > valor){
            setSaldo(getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }
}
