package Eletronicos;

public class CelularMarcaX extends Eletronico implements Celular{

    public CelularMarcaX(String name) {
        super(name);
    }

    @Override
    public void instalarApp() {
        System.out.println("O app foi instalado no dispositivo " + getName());
    }
}
