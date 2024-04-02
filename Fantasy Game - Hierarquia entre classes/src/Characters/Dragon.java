package Characters;

public class Dragon extends Character{
    public Dragon(String name) {
        super(name);
    }

    public void spitsFire(){
        System.out.println("O dragão cuspiu fogo! Você tomou " + getAttackPower() + " de dano");
    }
}
