//2. Classe Banco: Crie uma classe Banco que represente uma conta bancária. Inclua
//atributos como número da conta, saldo e métodos para depósito e retirada de dinheiro.

public class Banco {
    private String nome;
    private int numero;
    private float saldo;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Banco(String nome, int numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return this.numero;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean deposito(float valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean saque(float valor){
        if(valor > 0 && valor < this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
