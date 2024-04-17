package Animais;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer(){
        System.out.println(nome + " comeu");
    }
    public void comunicar(){
        System.out.println(nome + " comunicou");
    }
}
