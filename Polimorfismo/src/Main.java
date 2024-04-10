//6. Calculadora com Métodos para Soma: Crie uma classe Calculadora com
//        vários métodos soma() que aceitam diferentes tipos de parâmetros, como dois
//        inteiros, dois números de ponto flutuante, um inteiro e um número de ponto
//        flutuante, ou uma matriz de inteiros. Teste cada método em sua classe principal.
//7. Conversor de Unidades com Métodos para Converter: Crie uma classe
//        ConversorUnidades com métodos para converter unidades de medida, como
//        metros para centímetros, quilogramas para gramas, horas para minutos, etc.
//        Implemente vários métodos de sobrecarga para lidar com diferentes tipos de
//        unidades e valores. Teste cada método em sua classe principal.
//8. Manipulador de Strings com Métodos para Concatenar: Crie uma classe
//        ManipuladorStrings com um método concatenar() que aceita uma ou mais strings
//        como parâmetros e retorna a concatenação dessas strings. Implemente
//        sobrecargas do método concatenar() para lidar com diferentes quantidades de
//        strings. Teste cada método em sua classe principal.
//9. Calculadora de Área com Métodos para Calcular: Crie uma classe
//        CalculadoraArea com métodos para calcular a área de diferentes formas
//        geométricas, como quadrado, retângulo, círculo, triângulo, etc. Implemente
//        vários métodos de sobrecarga para lidar com diferentes números de parâmetros,
//        como lados, base e altura, raio, etc. Teste cada método em sua classe principal.
//10. Manipulador de Listas com Métodos para Operações: Crie uma classe
//        ManipuladorListas com métodos para realizar operações com listas, como
//        adicionar elementos, remover elementos, encontrar o máximo, encontrar o
//        mínimo, calcular a média, etc. Implemente sobrecargas de métodos para lidar
//        com diferentes tipos de listas e diferentes operações. Teste cada método em sua
//        classe principal.



import Animais.*;
import Calculadora.Calculadora;
import Geometria.*;
import ManipuladorStrings.ManipuladorStrings;
import Pessoas.*;
import Veiculos.*;
import ManipuladorListas.ManipuladorListas;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        //FormaGeometrica fg = new FormaGeometrica();  // verificação da impossibilidade de instanciação da classe abstract
        Quadrado quadrado = new Quadrado(4);
        Circulo circulo = new Circulo(4);

        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new Moto();

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        Calculadora calculadora = new Calculadora();

        ManipuladorStrings manipuladorStrings = new ManipuladorStrings();

        ManipuladorListas manipuladorListas = new ManipuladorListas();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
        animal.movimentar();
        peixe.movimentar();
        ave.movimentar();

        System.out.println();

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do círculo: " + circulo.calcularArea());

        System.out.println();

        veiculo.acelerar();
        carro.acelerar();
        moto.acelerar();

        System.out.println();

        pessoa.saudacao();
        aluno.saudacao();
        professor.saudacao();

        System.out.println();

        calculadora.soma( 5, 5);
        System.out.println();
        calculadora.soma(5.5, 5);
        System.out.println();
        calculadora.soma(5, 5.5);
        System.out.println();
        calculadora.soma(5.55f, 5);
        System.out.println();
        calculadora.soma(5, 5.55f);

        System.out.println();
        System.out.println();

        manipuladorStrings.concatenar("Olá ", "mundo ", "concatenado!");

        System.out.println();

        manipuladorListas.addElemento(5, 6, 7);
        manipuladorListas.addElemento(5.5f, 6.5f, 7.5f);
        manipuladorListas.addElemento("João", "Maria", "Pedro");
        System.out.println();
        System.out.print(manipuladorListas.media());
        System.out.println();
        manipuladorListas.concatenar();

        System.out.println();

    }
}