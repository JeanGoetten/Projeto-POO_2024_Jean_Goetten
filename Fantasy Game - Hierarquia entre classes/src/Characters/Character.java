package Characters;

public class Character {
    private String name;
    private float life;
    private float attackPower;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public float getAttackPower() { return attackPower; }

    public void setAttackPower(float attackPower) { this.attackPower = attackPower; }
}
