package Terrains;

public class Wood extends Terrain{
    public Wood(String name) {
        super(name);
    }

    public void Description(){
        System.out.println("Bem vindo a " + getName() + ". Onde a sombra oscila sobre a relva. ");
    }
}
