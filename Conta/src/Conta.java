public class Conta {
    String nome;
    int numero;
    float saldo;

    public boolean Sacar(float valor){
        if(valor > this.saldo){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    public void Depositar(float valor){
        this.saldo += valor;
    }
    public void SetSaldo(float valor){
        this.saldo = valor;
    }
    public float GetSaldo(){
        return this.saldo;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return this.nome;
    }
    public void SetNumero(int numero){
        this.numero = numero;
    }
    public int GetNumero(){
        return this.numero;
    }
}
