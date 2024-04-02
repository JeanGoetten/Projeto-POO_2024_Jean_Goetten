package Items;

public class Potion extends Item{
    private float mana;

    public Potion(String name, int qtd) {
        super(name, qtd);
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }
}
