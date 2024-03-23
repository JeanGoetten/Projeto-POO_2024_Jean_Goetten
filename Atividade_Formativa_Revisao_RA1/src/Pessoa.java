//1. Classe Pessoa: Crie uma classe Pessoa com atributos como nome, idade e endereço.
//Crie métodos para configurar e obter esses atributos.

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(){} // construtor vazio
    public Pessoa(String nome){ // construtor 1 atributo
        this.nome = nome;
    }
    public Pessoa(String nome, int idade){ // sobrecarga
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, String endereco){ // sobrecarga
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEnddereco(String endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(String nome){
        return this.endereco;
    }
    public int getIdade(){
        return this.idade;
    }
}
