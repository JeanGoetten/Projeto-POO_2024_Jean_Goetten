package Characters;

import Items.Armor;

public class Warrior extends Character{
    private float rage;
    Armor armor = new Armor("Shield", 100);
    public Warrior(String name) {
        super(name);
    }

    public float getRage() {
        return rage;
    }

    public void setRage(float rage) {
        this.rage = rage;
    }

    @Override
    public void useItem(int value){
        armor.useItem(value);
    }
}
