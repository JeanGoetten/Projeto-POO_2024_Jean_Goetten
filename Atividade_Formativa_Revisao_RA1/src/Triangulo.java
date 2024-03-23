//7. Classe Triângulo: Crie uma classe Triângulo com atributos para os lados (a, b, c).
//Implemente um método para verificar se é um triângulo válido e outro para calcular a
//área.

public class Triangulo {
    private float a;
    private float b;
    private float c;
    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valida(){
        if(a > 0 && b > 0 && c > 0){
            return true;
        }else{
            return false;
        }
    }
    public double area(){
        double p = (a + b + c)/2; // semiperímetro de Heron
        return java.lang.Math.sqrt(p * (p - a) * (p - b) * (p - c)); // fórmula de Heron
    }
}
