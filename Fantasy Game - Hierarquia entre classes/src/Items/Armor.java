package Items;

public class Armor extends Item{
    private float protection;

    public Armor(String name, int qtd) {
        super(name, qtd);
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }
}
