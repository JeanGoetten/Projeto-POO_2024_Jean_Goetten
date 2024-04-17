package Eletronicos;

public class Eletronico{
    private String name;
    private int bateria;

    public Eletronico(String name) {
        this.name = name;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ligar(){
        System.out.println(name + " power on");
        bateria--;
    }
    public void desligar(){
        System.out.println(name + " power off");
    }
    public void verificarBateria(){
        System.out.println(name + " charge: " + bateria);
    }
}
