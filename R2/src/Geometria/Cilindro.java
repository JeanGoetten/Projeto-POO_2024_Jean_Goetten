package Geometria;

public class Cilindro extends FormaGeometrica{

    private float raio;
    private float h;

    public Cilindro(float raio, float h) {
        this.raio = raio;
        this.h = h;
    }

    @Override
    public double area() {
        return 2*Math.PI * (raio + h);
    }

    @Override
    public double perimetro() {
        return 2 * raio * Math.PI;
    }
}
