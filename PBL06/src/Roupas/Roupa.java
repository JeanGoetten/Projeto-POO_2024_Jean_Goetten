package Roupas;

public abstract class Roupa implements Produto{
    private int tamanho;
    private String cor;

    public Roupa(int tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public float calcularPrecoFinal(float acrescimo){
        return 0;
    }
}
