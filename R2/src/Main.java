import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Eletronicos.CelularMarcaX;
import Eletronicos.Eletronico;
import Eletronicos.LaptopMarcaX;
import Eletronicos.TelevisaoMarcaX;

public class Main {
    public static void main(String[] args) {

        Eletronico eletronico = new Eletronico("Genérico");

        CelularMarcaX celularMarcaX = new CelularMarcaX("celular marca x");
        LaptopMarcaX laptopMarcaX = new LaptopMarcaX("laptop marca x");
        TelevisaoMarcaX televisaoMarcaX = new TelevisaoMarcaX("televisão marca x");

        eletronico.setBateria(100);
        eletronico.ligar();
        eletronico.verificarBateria();
        eletronico.desligar();

        celularMarcaX.setBateria(100);
        celularMarcaX.ligar();
        celularMarcaX.verificarBateria();
        celularMarcaX.desligar();

        laptopMarcaX.setBateria(100);
        laptopMarcaX.ligar();
        laptopMarcaX.verificarBateria();
        laptopMarcaX.desligar();

        televisaoMarcaX.ligar();
        televisaoMarcaX.mudarDeCanal();
        televisaoMarcaX.desligar();

        System.out.println();

        Animal animal = new Animal("Animal");
        Cachorro cachorro = new Cachorro("Cachorro");
        Gato gato = new Gato("Gato");
        Passaro passaro = new Passaro("Passaro");

        animal.comer();
        animal.comunicar();
        cachorro.comer();
        cachorro.latir();
        cachorro.comunicar();
        gato.comer();
        gato.miar();
        gato.comunicar();
        passaro.comer();
        passaro.cantar();
        passaro.comunicar();

        System.out.println();



    }
}