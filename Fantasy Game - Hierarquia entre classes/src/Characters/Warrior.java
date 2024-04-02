package Characters;

public class Warrior extends Character{
    private float rage;
    public Warrior(String name) {
        super(name);
    }

    public float getRage() {
        return rage;
    }

    public void setRage(float rage) {
        this.rage = rage;
    }
}
