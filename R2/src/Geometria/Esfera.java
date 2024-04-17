package Geometria;

public class Esfera extends FormaGeometrica{
    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 4*Math.PI*(Math.pow(raio, 2));
    }

    @Override
    public double perimetro() {
        return 4*Math.PI * raio;
    }
}
