package Geometria;

public class Circulo extends FormaGeometrica {
    public Circulo(double medida) {
        super(medida);
    }
    @Override
    public double calcularArea(){
        return Math.PI*(Math.pow(getMedida(), 2));
    }
}
