package Animais;

public class Passaro extends Animal{

    public Passaro(String nome) {
        super(nome);
    }
    public void cantar(){
        System.out.println("O pássaro cantou");
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
