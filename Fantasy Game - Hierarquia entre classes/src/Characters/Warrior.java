package Characters;

import Items.Armor;
import Items.Potion;

public class Warrior extends Character{
    private float armor;
    public Warrior(String name) {
        super(name);
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void addArmor(int value){
        armor += value;
    }

    public void useShild(int qtd){
        armor -= qtd;
    }

    public void useItem(Armor armor){
        System.out.println("Warrior armor: " + getArmor());
        addArmor(armor.getQtd());
        armor.useItem(armor.getQtd());
        System.out.println("New Warrior armor: " + getArmor());
    }
}
