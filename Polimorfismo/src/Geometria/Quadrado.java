package Geometria;

public class Quadrado extends FormaGeometrica{
    public Quadrado(double medida) {
        super(medida);
    }
    @Override
    public double calcularArea(){
        return 2*getMedida();
    }
}
