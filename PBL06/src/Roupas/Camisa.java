package Roupas;

public class Camisa extends Roupa{
    private String nome;
    private String marca;
    private float preco;
    private float desconto = 10;

    public Camisa(int tamanho, String cor) {
        super(tamanho, cor);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float calcularPrecoFinal(float acrescimo){
        return preco - (desconto/100)*preco + (acrescimo/100)*preco; // gera um resultado diferente da calculadora, mas está de acordo com os padrões de mercado
    }
}
