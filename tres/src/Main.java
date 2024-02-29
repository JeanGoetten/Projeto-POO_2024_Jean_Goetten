//Criar um programa que calcula a média de três números digitados pelo usuário

import java.util.Scanner;

public class Main {

    public static int Media(int a, int b, int c){
        int media = (a + b + c)/3;
        return (int)media;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int userNum1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int userNum2 = scan.nextInt();

        System.out.println("Digite o último número inteiro: ");
        int userNum3 = scan.nextInt();

        System.out.println("Média: " + Media(userNum1, userNum2, userNum3));
    }
}