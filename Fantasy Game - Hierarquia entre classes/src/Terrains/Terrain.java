package Terrains;

public class Terrain {
    private String name;

    public Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void description(){
        System.out.println("Dizem que as terras fantásticas se extendem para além do horizonte, mas ninguém sabe onde termina o horizonte...");
    }
}
