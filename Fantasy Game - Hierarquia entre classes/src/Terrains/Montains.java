package Terrains;

public class Montains extends Terrain{
    public Montains(String name) {
        super(name);
    }

    public void Description(){
        System.out.println("Bem vindo a " + getName() + ". Onde o vento sopra sob e sobre você. ");
    }
}
