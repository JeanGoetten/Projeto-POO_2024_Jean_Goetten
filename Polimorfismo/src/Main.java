
//5. Classe Animais.Animal com Método Movimentar: Crie uma classe Animais.Animal com um
//método movimentar(). Em seguida, crie duas subclasses Peixe e Ave, que
//sobrescrevem o método movimentar() para que o peixe nade e a ave voe.

import Animais.*;
import Geometria.*;
import Pessoas.Aluno;
import Pessoas.Pessoa;
import Pessoas.Professor;
import Veiculos.Carro;
import Veiculos.Moto;
import Veiculos.Veiculo;

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

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
        animal.movimentar();
        peixe.movimentar();;
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


    }
}