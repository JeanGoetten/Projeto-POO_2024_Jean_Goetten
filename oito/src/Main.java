//Criar um programa que calcula o fatorial de um número.

import java.util.Scanner;

public class Main {
    public static void Fatorial(int userNum){
        int fat = 1;
        String step = "";
        for (int i = userNum; i > 1; i--){
            fat *= i;
            step += i + " x ";
        }
        System.out.println(step + "1 = " + fat);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");

        int userNum = scan.nextInt();

        Fatorial(userNum);
    }
}