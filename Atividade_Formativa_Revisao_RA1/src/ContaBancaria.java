//8. Classe Conta Bancária: Crie uma classe Conta Bancária com atributos para o nome
//do titular, número da conta e saldo. Implemente métodos para depositar, sacar e exibir
//o saldo.

public class ContaBancaria {
    private String nome;
    private int numero;
    private float saldo;

    public ContaBancaria(String nome) { // constroi com inicialização do nome e numero
        this.nome = nome;
        this.numero++;
    }
    public ContaBancaria(String nome, float saldo) { // constroi com inicialização de nome, numero e saldo
        this.nome = nome;
        this.saldo = saldo;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public boolean depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean sacar(float valor){
        if(valor > 0 && valor < this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}