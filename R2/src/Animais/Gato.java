package Animais;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }
    public void miar(){
        System.out.println("O gato miou");
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
