package Characters;

public class Archer extends Character{
    private float attention;
    public Archer(String name) {
        super(name);
    }

    public float getAttention() {
        return attention;
    }

    public void setAttention(float attention) {
        this.attention = attention;
    }

    public boolean payAttention(){
        if(attention > 0){
            this.attention--;
            return true;
        }else{
            return false;
        }
    }
}
