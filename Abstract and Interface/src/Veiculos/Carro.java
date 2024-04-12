package Veiculos;

public class Carro extends Veiculo{

    @Override
    public void acelerar(){
        System.out.println("O carro acelerou...");
    }
    @Override
    public void frear(){
        System.out.println("O carro freou...");
    }
}
