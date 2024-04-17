import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Auntenticar.Administrador;
import Auntenticar.Cliente;
import Auntenticar.Login;
import Auntenticar.Usuario;
import Conta.ContaCorrente;
import Conta.ContaPoupança;
import Eletronicos.CelularMarcaX;
import Eletronicos.Eletronico;
import Eletronicos.LaptopMarcaX;
import Eletronicos.TelevisaoMarcaX;
import Geometria.Cilindro;
import Geometria.Cubo;
import Geometria.Esfera;

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

        Cubo cubo = new Cubo(10);
        Esfera esfera = new Esfera(3);
        Cilindro cilindro = new Cilindro(120, 50);

        System.out.println("cubo área: " + cubo.area());
        System.out.println("cubo perímetro: " + cubo.perimetro());
        System.out.println("esfera área: " + esfera.area());
        System.out.println("esfera perímetro: " + esfera.perimetro());
        System.out.println("cilindro área: " + cilindro.area());
        System.out.println("cilindro perímetro: " + cilindro.perimetro());

        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente(5000);
        ContaPoupança contaPoupança = new ContaPoupança(50000);

        contaCorrente.saque(50);
        contaCorrente.depoisto(0);
        contaCorrente.verificarSaldo();

        contaPoupança.saque(0);
        contaPoupança.depoisto(30000);
        contaPoupança.verificarSaldo();

        System.out.println();

        Usuario user = new Usuario();
        Administrador admin = new Administrador();
        Cliente client = new Cliente();

        Login login = new Login(admin);

        login.newLogin(user);
        login.newLogin(client);

    }
}