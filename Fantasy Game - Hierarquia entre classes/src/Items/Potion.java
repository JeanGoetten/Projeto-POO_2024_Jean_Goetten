package Items;

public class Potion extends Item{
    private float mana;

    public Potion(String name, int qtd) {
        super(name, qtd);
    }

    public float getMana() {
        return this.mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    @Override
    public void setQtd(int qtd) {
        super.setQtd(qtd);
    }
    public void useItem(int value){
        setQtd(value);
    }
}
