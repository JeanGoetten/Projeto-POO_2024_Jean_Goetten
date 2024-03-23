//6. Classe Carro: Crie uma classe Carro com atributos como marca, modelo e ano.
//Implemente métodos para ligar e desligar o carro.

public class Carro {
    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void ligar(){
        System.out.println("Ligando " + marca + " " + modelo + " ano: " + ano);
    }
    public void desligar(){
        System.out.println("Desligando " + marca + " " + modelo + " ano: " + ano);
    }
}
