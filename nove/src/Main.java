//Criar um programa que verifica se um número é primo ou não

import java.util.Scanner;

public class Main {

    public static boolean Primo(int userNum){
        for (int i = 2; i < userNum - 1; i++){
            if (userNum % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int userNum = scan.nextInt();

        if(Primo(userNum)){
            System.out.println(userNum + " é um número primo");
        }else{
            System.out.println(userNum + " não é um número primo");
        }
    }
}