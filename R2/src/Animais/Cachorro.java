package Animais;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    public void latir(){
        System.out.println("O cachorro latiu");
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void comunicar() {
        super.comunicar();
    }
}
