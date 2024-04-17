package Eletronicos;

public class LaptopMarcaX extends Eletronico implements Laptop{
    public LaptopMarcaX(String name) {
        super(name);
    }


    @Override
    public void conectarMouse() {
        System.out.println("Mouse conectado no dispositivo " + getName());
    }
}
