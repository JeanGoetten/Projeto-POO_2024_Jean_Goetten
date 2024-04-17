package Eletronicos;

public class TelevisaoMarcaX extends Eletronico implements Televisao{


    public TelevisaoMarcaX(String name) {
        super(name);
    }

    @Override
    public void mudarDeCanal() {
        System.out.println("A televisao " + getName() + " mudou de canal. ");
    }
}
