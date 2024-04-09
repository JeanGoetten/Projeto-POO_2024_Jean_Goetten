package Characters;
import Items.Potion;

public class Mage extends Character{
    private float mana;
    Potion potion = new Potion("Mana", 10);

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

    @Override
    public void useItem(int value){
        potion.useItem(value);
    }
}
