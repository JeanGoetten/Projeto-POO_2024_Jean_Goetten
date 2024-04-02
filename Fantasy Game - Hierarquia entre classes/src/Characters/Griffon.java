package Characters;

public class Griffon extends Character{
    public Griffon(String name) {
        super(name);
    }

    public void flapped(){
        System.out.println("O grifo abanou as asas! Você tomou " + getAttackPower() + " de dano");
    }
}
