package Characters;

public class Mage extends Character{
    private float mana;
    public Mage(String name) {
        super(name);
    }

    public float getMana() { return mana; }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public void addMana(){
        mana++;
    }
    public void subMana(){
        mana--;
    }

}
