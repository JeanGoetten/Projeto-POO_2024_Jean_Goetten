//3. Classe Retângulo: Crie uma classe Retângulo com atributos de largura e altura.
//Implemente métodos para calcular a área e o perímetro do retângulo.

public class Retangulo {
    private float altura;
    private float largura;

    public Retangulo(){} // não exige atributos na instanciação
    public Retangulo(float altura, float largura) { // permite passar os atributos na instanciação
        this.altura = altura;
        this.largura = largura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public float getAltura() {
        return this.altura;
    }

    public float getLargura() {
        return this.largura;
    }
    public float area(){
        return this.altura * this.largura;
    }
    public float perimetro(){
        return 2 * (this.altura + this.largura);
    }
}
