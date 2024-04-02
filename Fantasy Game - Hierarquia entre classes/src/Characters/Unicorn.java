package Characters;

public class Unicorn extends Character{

    public Unicorn(String name) {
        super(name);
    }

    public void gored(){
        System.out.println("O unicórnio te chifrou! Você tomou " + getAttackPower() + " de dano");
    }
}
