//Criar um programa que simula o lançamento de um dado e imprime o resultado.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rndNumber = new Random();

        int valor = rndNumber.nextInt(6) + 1;
        System.out.println("Dado rolado: " + valor);


    }
}