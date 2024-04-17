package Geometria;

public class Cubo extends FormaGeometrica{

    private float aresta;

    public Cubo(float aresta) {
        this.aresta = aresta;
    }

    @Override
    public double area() {
        return 6*Math.pow(aresta, 2);
    }

    @Override
    public double perimetro() {
        return 12 * aresta;
    }
}
