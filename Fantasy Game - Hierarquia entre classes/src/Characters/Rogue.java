package Characters;

public class Rogue extends Character{
    private int comboPoints;
    public Rogue(String name) {
        super(name);
    }

    public int getComboPoints() {
        return comboPoints;
    }

    public void setComboPoints(int comboPoints) {
        this.comboPoints = comboPoints;
    }

    public void combo(){
        this.comboPoints++;
    }
}
