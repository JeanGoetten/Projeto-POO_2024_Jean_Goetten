package Geometria;

public abstract class FormaGeometrica {
    private double medida;

    public FormaGeometrica(double medida) {
        this.medida = medida;
    }

    public double getMedida() {
        return medida;
    }

    public double calcularArea(){
        return this.medida;
    }

}
