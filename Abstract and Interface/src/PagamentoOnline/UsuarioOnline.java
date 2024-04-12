package PagamentoOnline;

public abstract class UsuarioOnline {
    private String nome;

    public UsuarioOnline(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
