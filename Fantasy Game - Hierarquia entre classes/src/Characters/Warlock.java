package Characters;

public class Warlock extends Character{
    private float mana;
    public Warlock(String name) {
        super(name);
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public boolean greenSkull(){
        if(mana > 0){
            mana = mana - 5;
            return true;
        }else{
            return false;
        }
    }
}
