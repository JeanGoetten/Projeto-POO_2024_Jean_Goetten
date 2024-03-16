public class Pessoa {
    private final String nome; // final: não pode ser herdado - imutável
    private final Integer tipo;
    public Pessoa(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public Integer getTipo(){
        return this.tipo;
    }
    public String getNome(){
        return this.nome;
    }
}
