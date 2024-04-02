package Terrains;

public class Desert extends Terrain{
    public Desert(String name) {
        super(name);
    }

    public void Description(){
        System.out.println("Bem vindo a " + getName() + ". Onde o ar queima e a noite congela. ");
    }
}
