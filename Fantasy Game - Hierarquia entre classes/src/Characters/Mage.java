package Characters;
import Items.Armor;
import Items.Potion;

public class Mage extends Character{
    private float mana;

    public Mage(String name) {
        super(name);
    }

    public float getMana() { return mana; }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public void addMana(int value){
        mana += value;
    }
    public void subMana(int qtd){
        mana -= qtd;
    }

    public void fireball(int qtd){
        subMana(qtd);
    }

    public void useItem(Potion potion){
        System.out.println("Mage mana: " + getMana());
        addMana(potion.getQtd());
        potion.useItem(potion.getQtd());
        System.out.println("Mage mana: " + getMana());
    }
}
